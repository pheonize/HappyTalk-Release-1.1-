package oVANILLAz.happytalk;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import android.widget.Button;

import oVANILLAz.happytalk.Database.FavoriteDAL;

import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by oVANILLAz on 6/9/14 AD.
 */
public class MyListAdapter extends BaseExpandableListAdapter {

    private Context context;

    private ArrayList<GroupHeader> groupHeadersList;
    private ArrayList<GroupHeader> originalList;
    private MediaPlayer mediaPlayer;
    Button btnSound;
    Button btnFavorite;

    ArrayList<Child> childList = new ArrayList<Child>();

    private ArrayList<GroupHeader> groupHeaderList = new ArrayList<GroupHeader>();

    Child child;
    GroupHeader groupHeader;

    int previousGroup = -1;



    FavoriteDAL favoriteDAL;
    SQLiteDatabase sqLiteDatabase;



    Cursor mCursor;
    String lang_from,lang_to,wordEN,wordFrom,wordTo,karaokeTH,karaokeEN;

    private int flag;

    //Boolean flagT =false;




    public MyListAdapter(Context context,ArrayList<GroupHeader> groupHeadersList,String lang_from,String lang_To){
        this.context = context;
        this.groupHeadersList = new ArrayList<GroupHeader>();
        this.groupHeadersList.addAll(groupHeadersList);
        this.originalList = new ArrayList<GroupHeader>();
        this.originalList.addAll(groupHeadersList);
        this.lang_from = lang_from;
        this.lang_to = lang_To;



    }

    @Override
    public Object getChild(int groupPosition,int childPosition){
        ArrayList<Child> childList = groupHeadersList.get(groupPosition).getChildList();
        return childList.get(childPosition);
    }

    @Override
    public long getChildId(int groupPosition,int childPosition){
        return childPosition;
    }



    @Override
    public View getChildView(int groupPosition, final int childPosition,boolean isLastChild,View view ,ViewGroup parent) {

        child = (Child) getChild(groupPosition, childPosition);




            if (view == null) {
                LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                view = layoutInflater.inflate(R.layout.child_item, null);
            }

            TextView txtwordFrom = (TextView) view.findViewById(R.id.txtWordFrom);
            TextView txtwordEN = (TextView) view.findViewById(R.id.txtWordEN);
            TextView txtwordTo = (TextView) view.findViewById(R.id.txtWordTo);
            TextView txtkaraokeTH = (TextView) view.findViewById(R.id.txtKaraokeTH);
            TextView txtkaraokeEN = (TextView) view.findViewById(R.id.txtKaraokeEN);


            btnSound = (Button) view.findViewById(R.id.sounds);


            btnFavorite = (Button) view.findViewById(R.id.favorite);
            // btnFavorite.setBackgroundResource(R.drawable.fav_unshow);

        checkFavorite();


            btnSound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (child.getSoundPath() != -1) {
                        btnSound.setBackgroundResource(R.drawable.sound_push);
                        try {
                            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                                mediaPlayer.stop();
                                mediaPlayer.release();
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }

                        loadSound(child.getSoundPath());
                    }

                }

            });


            btnFavorite.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    Favorite();


                }


            });

            txtwordFrom.setText(child.getWordFrom().trim());
            txtwordEN.setText(child.getWordEN().trim());
            txtwordTo.setText(child.getWordTo().trim());
            txtkaraokeEN.setText(child.getKaraokeEN().trim());
            txtkaraokeTH.setText(child.getKaraokeTH().trim());

            return view;
        }



    private void checkFavorite() {
        favoriteDAL = new FavoriteDAL(context);
        sqLiteDatabase = favoriteDAL.getWritableDatabase();
        // if (sqLiteDatabase != null) {
        String wordFrom = child.getWordFrom().trim();
        String wordTo = child.getWordTo().trim();


        String select = " SELECT * FROM " + FavoriteDAL.TABLE_FAVORITE +" WHERE "
                + FavoriteDAL.COLUMN_WORDFROM + "='" + wordFrom + "'"
                + " AND " + FavoriteDAL.COLUMN_WORDTO + "='" + wordTo + "'";

        Cursor mCursor = sqLiteDatabase.rawQuery(select, null);

            if (mCursor.moveToFirst()) {
                while (mCursor.isAfterLast() == false) {
                    if (mCursor.getString(4).equals(wordFrom) && mCursor.getString(5).equals(wordTo)) {
                        btnFavorite.setBackgroundResource(R.drawable.fav_show);
//                        mCursor.moveToNext();

                    }
                    mCursor.moveToNext();

                }


            }
            else{
                btnFavorite.setBackgroundResource(R.drawable.fav_unshow);
            }



    }


    private void Favorite() {
        favoriteDAL = new FavoriteDAL(context);
        String wordEN = child.getWordEN();
        String wordFrom = child.getWordFrom();
        String wordTo = child.getWordTo();
        String karaokeEN = child.getKaraokeEN();
        String karaokeTH = child.getKaraokeTH();
        int sound = child.getSoundPath();


        String insert = "INSERT INTO " + FavoriteDAL.TABLE_FAVORITE + " (" + FavoriteDAL.COLUMN_LANGFROM
                + ", " + FavoriteDAL.COLUMN_LANGTO + ", " + FavoriteDAL.COLUMN_WORDEN + ", "
                + FavoriteDAL.COLUMN_WORDFROM + ", " + FavoriteDAL.COLUMN_WORDTO + ", " + FavoriteDAL.COLUMN_KARAOKEEN +
                ", " + FavoriteDAL.COLUMN_KARAOKETH + ", " + FavoriteDAL.COLUMN_SOUND + " ) VALUES ('" + lang_from + "', '" + lang_to +
                "', '" + wordEN + "', '" + wordFrom + "', '" + wordTo + "', '"
                + karaokeEN + "', '" + karaokeTH + "', '" + sound + "');";


        String delete = "DELETE FROM " + FavoriteDAL.TABLE_FAVORITE + " WHERE "


                 + FavoriteDAL.COLUMN_WORDFROM + "='" + wordFrom + "'"
                + " AND " + FavoriteDAL.COLUMN_WORDTO + "='" + wordTo + "'";


        sqLiteDatabase = favoriteDAL.getWritableDatabase();
       // if (sqLiteDatabase != null) {

            String select = " SELECT * FROM " + FavoriteDAL.TABLE_FAVORITE;
            Cursor mCursor = sqLiteDatabase.rawQuery(select, null);

        int magicSave = 0;
        if (mCursor.moveToFirst()) {
            while (mCursor.isAfterLast() == false) {

                if (mCursor.getString(4).equals(wordFrom) && mCursor.getString(5).equals(wordTo)) {
                    magicSave++;
                    sqLiteDatabase.execSQL(delete);
                    btnFavorite.setBackgroundResource(R.drawable.fav_unshow);
                //    Toast.makeText(context, "Delete Favorite Success", Toast.LENGTH_SHORT).show();

                }
               mCursor.moveToNext();
            }

            if(magicSave == 0)
            {
                btnFavorite.setBackgroundResource(R.drawable.fav_show);
                sqLiteDatabase.execSQL(insert);
               // Toast.makeText(context, "Add Favorite Success", Toast.LENGTH_SHORT).show();

            }
        }
        else{
            btnFavorite.setBackgroundResource(R.drawable.fav_show);
            sqLiteDatabase.execSQL(insert);

           // Toast.makeText(context, "Add Favorite Success", Toast.LENGTH_SHORT).show();
        }


    }


    @Override
    public int getChildrenCount(int groupPosition){
        ArrayList<Child> childList = groupHeadersList.get(groupPosition).getChildList();
        return childList.size();
    }

    @Override
    public Object getGroup(int groupPosition) {


        return groupHeadersList.get(groupPosition);
    }

    @Override
    public int getGroupCount(){
        return groupHeadersList.size();
    }

    @Override
    public long getGroupId(int groupPosition){
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition,boolean isLastChild,View view,ViewGroup parent){

        GroupHeader groupHeader = (GroupHeader) getGroup(groupPosition);
        if(view == null){
            LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.group_listview,null);
        }

        TextView wordFrom = (TextView)view.findViewById(R.id.wordFrom);
        TextView wordEN = (TextView)view.findViewById(R.id.wordEN);

        wordFrom.setText(groupHeader.getWordFrom().trim());
        wordEN.setText(groupHeader.getWordEN().trim());

        return view;


    }

    @Override
    public boolean hasStableIds(){
        return true;
    }

    @Override
    public boolean isChildSelectable(int groupPosition,int childPosition){
        return true;
    }


    public void filterData(String query){
        query =query.toLowerCase();

        Log.v("MyListAdapter",String.valueOf(groupHeadersList.size()));
        groupHeadersList.clear();

        if(query.isEmpty()){
            groupHeadersList.addAll(originalList);

        }
        else{
            for(GroupHeader groupHeader:originalList){
                ArrayList<Child> groupHeaders = groupHeader.getChildList();
                ArrayList<Child> newList = new ArrayList<Child>();
                for(Child child : groupHeaders){
                    if(child.getWordFrom().toLowerCase().contains(query) || child.getWordTo().toLowerCase().contains(query) || child.getWordEN().toLowerCase().contains(query)){
                        newList.add(child);
                    }
                }
                if(newList.size()>0){
                    GroupHeader nGroupHeader = new GroupHeader(groupHeader.getWordFrom(),groupHeader.getWordEN(),newList);
                    groupHeadersList.add(nGroupHeader);
                }


            }
        }


        Log.v("MyListAdapter" ,String.valueOf(groupHeadersList.size()));
        notifyDataSetChanged();
    }

    // Filter Class
    public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        groupHeadersList.clear();

        if(charText.length()==0){
            groupHeadersList.addAll(originalList);
            //groupHeadersList.clear();
        }
        else{
            for(GroupHeader groupHeader:originalList){
                ArrayList<Child> groupHeaders = groupHeader.getChildList();
                ArrayList<Child> newList = new ArrayList<Child>();
                for(Child child : groupHeaders){
                    if(child.getWordFrom().toLowerCase().contains(charText) || child.getWordTo().toLowerCase().contains(charText)){
                        newList.add(child);
                    }
                }
                if(newList.size()>0){
                    GroupHeader nGroupHeader = new GroupHeader(groupHeader.getWordFrom(),groupHeader.getWordEN(),newList);
                    groupHeadersList.add(nGroupHeader);
                }


            }
        }


        Log.v("MyListAdapter" ,String.valueOf(groupHeadersList.size()));
        notifyDataSetChanged();
    }






    //LoadSound


    public void loadSound(int soundPath) {

            mediaPlayer = MediaPlayer.create(context, soundPath);
            mediaPlayer.start();


        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                  //Toast.makeText(context,"Finish",Toast.LENGTH_SHORT).show();
                mediaPlayer.release();
                //onStop();
               btnSound.setBackgroundResource(R.drawable.sound);
            }
        });


    }

    public void onStop() {
        try {
            if (mediaPlayer !=null && mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.release();
               // btnSound.setBackgroundResource(R.drawable.sound);
            }
        }
        catch (IllegalStateException e){
            e.printStackTrace();
        }
    }






}
