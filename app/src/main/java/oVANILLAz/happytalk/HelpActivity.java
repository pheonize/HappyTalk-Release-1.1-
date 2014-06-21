package oVANILLAz.happytalk;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ExpandableListView;

import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.TextView;


import oVANILLAz.happytalk.Database.Database;
import oVANILLAz.happytalk.Database.EmergencyDAL;

import java.util.ArrayList;

/**
 * Created by oVANILLAz on 6/11/14 AD.
 */
public class HelpActivity extends Activity implements SearchView.OnQueryTextListener,SearchView.OnCloseListener {


    //DB
    private static Database db;
    SQLiteDatabase sqLiteDatabase;
    Context context;
    Button btnSound;
    String langTo,langFrom;
    String[] country_list = {"Brunei", "Cambodia", "China", "Indonesia",
            "Laos", "Malaysia", "Myanmar", "Philippines", "Singapore",
            "Thai", "Vietnam"};

    Integer[] img = {R.drawable.brunei_flag, R.drawable.cambodia_flag,
            R.drawable.china_flag, R.drawable.indonesia_flag,
            R.drawable.laos_flag, R.drawable.malaysia,
            R.drawable.myanmar_flag, R.drawable.philippines_flag,
            R.drawable.singapore_flag, R.drawable.thailand_flag,
            R.drawable.vietnam_flag};


    private Cursor cursor;
    private MediaPlayer mediaPlayer;
    private Spinner countryFrom, countryTo;
    private String strCountryFrom, strCountryTo;
    private ArrayList<Parent> parents;

    //Last version
    private SearchView search;
    private MyListAdapter listAdapter;
    private ExpandableListView myList;
    private ArrayList<GroupHeader> groupHeaderList = new ArrayList<GroupHeader>();

    private EmergencyDAL loadWording;

    //Set value
    String lang_from,lang_to;

    private int prev = -1;


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.emergency);





        Configuration configuration = new Configuration();

        getResources().updateConfiguration(configuration,null);

        initWidget();
//        search();

        checkLanguage();

        //DB

//        db = new Database(this);
//
//        sqLiteDatabase = db.getWritableDatabase();


    }

    private void checkLanguage() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }

        String lang_from = extras.getString("strCountryFrom", "");
        if (lang_from != null) {
            //Do something

            Log.d("--Conservation_FROM", lang_from);
            TextView langFrom = (TextView) findViewById(R.id.txtLangFrom);
            langFrom.setText(lang_from);



        }

        String lang_to = extras.getString("strCountryTo", "");
        if (lang_to != null) {
            //Do something
            Log.d("--Conservation_TO", lang_to);
            TextView langTo = (TextView) findViewById(R.id.txtLangTo);
            langTo.setText(lang_to);

        }
        displayList(lang_from,lang_to);
        saveValue(lang_from,lang_to);
    }
    public void saveValue(String lang_from, String lang_to) {
        this.lang_from = lang_from;
        this.lang_to = lang_to;

    }


    //method to expand all group
    public void displayList(String lang_from,String lang_to) {





        if (lang_from.equals("Thai") && lang_to.equals("Brunei") || lang_from.equals("ไทย") && lang_to.equals("บรูไน")) {

            //display the list
            // loadThaiToBrunei();
            loadWording = new EmergencyDAL();
            loadWording.loadThaiToBrunei();
            //get ref to the expandableListView
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });


        }

        if(lang_from.equals("Thai") && lang_to.equals("China") || lang_from.equals("ไทย")&&lang_to.equals("จีน")){
            loadWording = new EmergencyDAL();
            loadWording.loadThaiToChina();
            //get ref to the expandableListView
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });

        }
        if(lang_from.equals("Thai") && lang_to.equals("Thai") || lang_from.equals("ไทย") && lang_to.equals("ไทย")){
            loadWording = new EmergencyDAL();
            loadWording.loadThaiToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Thai") && lang_to.equals("Cambodia") || lang_from.equals("ไทย") && lang_to.equals("กัมพูชา") ){
            loadWording = new EmergencyDAL();
            loadWording.loadThaiToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }
        if(lang_from.equals("Thai")&& lang_to.equals("Indonesia") || lang_from.equals("ไทย") && lang_to.equals("อินโดนีเซีย")){
            loadWording = new EmergencyDAL();
            loadWording.loadThaiToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }
        if(lang_from.equals("Thai")&& lang_to.equals("Laos") || lang_from.equals("ไทย") && lang_to.equals("ลาว")){
            loadWording = new EmergencyDAL();
            loadWording.loadThaiToLaos();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Thai")&& lang_to.equals("Malaysia") || lang_from.equals("ไทย") && lang_to.equals("มาเลเซีย")){
            loadWording = new EmergencyDAL();
            loadWording.loadThaiToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }
        if(lang_from.equals("Thai")&& lang_to.equals("Myanmar") || lang_from.equals("ไทย") && lang_to.equals("พม่า")){
            loadWording = new EmergencyDAL();
            loadWording.loadThaiToMyanmar();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Thai")&& lang_to.equals("Philippines") || lang_from.equals("ไทย") && lang_to.equals("ฟิลิปปินส์")){
            loadWording = new EmergencyDAL();
            loadWording.loadThaiToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Thai")&& lang_to.equals("Singapore") || lang_from.equals("ไทย") && lang_to.equals("สิงคโปร์")){
            loadWording = new EmergencyDAL();
            loadWording.loadThaiToSingapore();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Thai")&& lang_to.equals("Vietnam") || lang_from.equals("ไทย") && lang_to.equals("เวียดนาม")){
            loadWording = new EmergencyDAL();
            loadWording.loadThaiToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Brunei")&& lang_to.equals("China") || lang_from.equals("บรูไน") && lang_to.equals("จีน")){
            loadWording = new EmergencyDAL();
            loadWording.loadBruneiToChina();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Brunei") && lang_to.equals("Thai") || lang_from.equals("บรูไน") && lang_to.equals("ไทย")){
            loadWording = new EmergencyDAL();
            loadWording.loadBruneiToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Brunei") && lang_to.equals("Brunei") || lang_from.equals("บรูไน") && lang_to.equals("บรูไน")){
            loadWording = new EmergencyDAL();
            loadWording.loadBruneiToBrunei();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Brunei") && lang_to.equals("Cambodia") || lang_from.equals("บรูไน") && lang_to.equals("กัมพูชา")){
            loadWording = new EmergencyDAL();
            loadWording.loadBruneiToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });

        }

        if(lang_from.equals("Brunei") && lang_to.equals("Indonesia") || lang_from.equals("บรูไน") && lang_to.equals("อินโดนีเซีย")){
            loadWording = new EmergencyDAL();
            loadWording.loadBruneiToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Brunei") && lang_to.equals("Laos") || lang_from.equals("บรูไน") && lang_to.equals("ลาว")){
            loadWording = new EmergencyDAL();
            loadWording.loadBruneiToLaos();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }


        if(lang_from.equals("Brunei") && lang_to.equals("Malaysia") || lang_from.equals("บรูไน") && lang_to.equals("มาเลเซีย")){
            loadWording = new EmergencyDAL();
            loadWording.loadBruneiToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Brunei") && lang_to.equals("Myanmar") || lang_from.equals("บรูไน") && lang_to.equals("พม่า")){
            loadWording = new EmergencyDAL();
            loadWording.loadBruneiToMyanmar();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Brunei") && lang_to.equals("Philippines") || lang_from.equals("บรูไน") && lang_to.equals("ฟิลิปปินส์")){
            loadWording = new EmergencyDAL();
            loadWording.loadBruneiToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Brunei") && lang_to.equals("Singapore") || lang_from.equals("บรูไน") && lang_to.equals("สิงคโปร์")){
            loadWording = new EmergencyDAL();
            loadWording.loadBruneiToSingapore();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Brunei") && lang_to.equals("Vietnam") || lang_from.equals("บรูไน") && lang_to.equals("เวียดนาม")){
            loadWording = new EmergencyDAL();
            loadWording.loadBruneiToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Cambodia") && lang_to.equals("China") || lang_from.equals("กัมพูชา") && lang_to.equals("จีน")){
            loadWording = new EmergencyDAL();
            loadWording.loadCambodiaToChina();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Cambodia") && lang_to.equals("Thai") || lang_from.equals("กัมพูชา") && lang_to.equals("ไทย")){
            loadWording = new EmergencyDAL();
            loadWording.loadCambodiaToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Cambodia") && lang_to.equals("Brunei") || lang_from.equals("กัมพูชา") && lang_to.equals("บรูไน")){
            loadWording = new EmergencyDAL();
            loadWording.loadCambodiaToBrunei();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Cambodia") && lang_to.equals("Cambodia") || lang_from.equals("กัมพูชา") && lang_to.equals("กัมพูชา")){
            loadWording = new EmergencyDAL();
            loadWording.loadCambodiaToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Cambodia") && lang_to.equals("Indonesia") || lang_from.equals("กัมพูชา") && lang_to.equals("อินโดนีเซีย")){
            loadWording = new EmergencyDAL();
            loadWording.loadCambodiaToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }


        if(lang_from.equals("Cambodia") && lang_to.equals("Laos") || lang_from.equals("กัมพูชา") && lang_to.equals("ลาว")){
            loadWording = new EmergencyDAL();
            loadWording.loadCambodiaToLaos();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Cambodia") && lang_to.equals("Malaysia") || lang_from.equals("กัมพูชา") && lang_to.equals("มาเลเซีย")){
            loadWording = new EmergencyDAL();
            loadWording.loadCambodiaToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Cambodia") && lang_to.equals("Myanmar") || lang_from.equals("กัมพูชา") && lang_to.equals("พม่า")){
            loadWording = new EmergencyDAL();
            loadWording.loadCambodiaToMyanmar();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }


        if(lang_from.equals("Cambodia") && lang_to.equals("Philippines") || lang_from.equals("กัมพูชา") && lang_to.equals("ฟิลิปปินส์")){
            loadWording = new EmergencyDAL();
            loadWording.loadCambodiaToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Cambodia") && lang_to.equals("Singapore") || lang_from.equals("กัมพูชา") && lang_to.equals("สิงคโปร์")){
            loadWording = new EmergencyDAL();
            loadWording.loadCambodiaToSingapore();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Cambodia") && lang_to.equals("Vietnam") || lang_from.equals("กัมพูชา") && lang_to.equals("เวียดนาม")){
            loadWording = new EmergencyDAL();
            loadWording.loadCambodiaToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("China") && lang_to.equals("China") || lang_from.equals("จีน") && lang_to.equals("จีน")){
            loadWording = new EmergencyDAL();
            loadWording.loadChinaToChina();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("China") && lang_to.equals("Thai") || lang_from.equals("จีน") && lang_to.equals("ไทย")){
            loadWording = new EmergencyDAL();
            loadWording.loadChinaToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("China") && lang_to.equals("Brunei") || lang_from.equals("จีน") && lang_to.equals("บรูไน")){
            loadWording = new EmergencyDAL();
            loadWording.loadChinaToBrunei();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("China") && lang_to.equals("Cambodia") || lang_from.equals("จีน") && lang_to.equals("กัมพูชา")){
            loadWording = new EmergencyDAL();
            loadWording.loadChinaToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("China") && lang_to.equals("Indonesia") || lang_from.equals("จีน") && lang_to.equals("อินโดนีเซีย")){
            loadWording = new EmergencyDAL();
            loadWording.loadChinaToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("China") && lang_to.equals("Laos") || lang_from.equals("จีน") && lang_to.equals("ลาว")){
            loadWording = new EmergencyDAL();
            loadWording.loadChinaToLaos();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("China") && lang_to.equals("Malaysia") || lang_from.equals("จีน") && lang_to.equals("มาเลเซีย")){
            loadWording = new EmergencyDAL();
            loadWording.loadChinaToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("China") && lang_to.equals("Myanmar") || lang_from.equals("จีน") && lang_to.equals("พม่า")){
            loadWording = new EmergencyDAL();
            loadWording.loadChinaToMyanmar();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("China") && lang_to.equals("Philippines") || lang_from.equals("จีน") && lang_to.equals("ฟิลิปปินส์")){
            loadWording = new EmergencyDAL();
            loadWording.loadChinaToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("China") && lang_to.equals("Singapore") || lang_from.equals("จีน") && lang_to.equals("สิงคโปร์")){
            loadWording = new EmergencyDAL();
            loadWording.loadChinaToSingapore();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("China") && lang_to.equals("Vietnam") || lang_from.equals("จีน") && lang_to.equals("เวียดนาม")){
            loadWording = new EmergencyDAL();
            loadWording.loadChinaToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Indonesia") && lang_to.equals("China") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("จีน")){
            loadWording = new EmergencyDAL();
            loadWording.loadIndonesiaToChina();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Indonesia") && lang_to.equals("Thai") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("ไทย")){
            loadWording = new EmergencyDAL();
            loadWording.loadIndonesiaToChina();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Indonesia") && lang_to.equals("Thai") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("ไทย")){
            loadWording = new EmergencyDAL();
            loadWording.loadIndonesiaToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Indonesia") && lang_to.equals("Brunei") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("บรูไน")){
            loadWording = new EmergencyDAL();
            loadWording.loadIndonesiaToBrunei();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Indonesia") && lang_to.equals("Cambodia") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("กัมพูชา")){
            loadWording = new EmergencyDAL();
            loadWording.loadIndonesiaToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Indonesia") && lang_to.equals("Indonesia") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("อินโดนีเซีย")){
            loadWording = new EmergencyDAL();
            loadWording.loadIndonesiaToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Indonesia") && lang_to.equals("Laos") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("ลาว")){
            loadWording = new EmergencyDAL();
            loadWording.loadIndonesiaToLaos();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Indonesia") && lang_to.equals("Malaysia") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("มาเลเซีย")){
            loadWording = new EmergencyDAL();
            loadWording.loadIndonesiaToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Indonesia") && lang_to.equals("Myanmar") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("พม่า")){
            loadWording = new EmergencyDAL();
            loadWording.loadIndonesiaToMyanmar();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Indonesia") && lang_to.equals("Philippines") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("ฟิลิปปินส์")){
            loadWording = new EmergencyDAL();
            loadWording.loadIndonesiaToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Indonesia") && lang_to.equals("Singapore") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("สิงคโปร")){
            loadWording = new EmergencyDAL();
            loadWording.loadIndonesiaToSingapore();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Indonesia") && lang_to.equals("Vietnam") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("เวียดนาม")){
            loadWording = new EmergencyDAL();
            loadWording.loadIndonesiaToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Laos") && lang_to.equals("China") || lang_from.equals("ลาว") && lang_to.equals("จีน")){
            loadWording = new EmergencyDAL();
            loadWording.loadLaosToChina();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Laos") && lang_to.equals("Thai") || lang_from.equals("ลาว") && lang_to.equals("ไทย")){
            loadWording = new EmergencyDAL();
            loadWording.loadLaosToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Laos") && lang_to.equals("Brunei") || lang_from.equals("ลาว") && lang_to.equals("บรูไน")){
            loadWording = new EmergencyDAL();
            loadWording.loadLaosToBrunei();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Laos") && lang_to.equals("Cambodia") || lang_from.equals("ลาว") && lang_to.equals("กัมพูชา")){
            loadWording = new EmergencyDAL();
            loadWording.loadLaosToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Laos") && lang_to.equals("Indonesia") || lang_from.equals("ลาว") && lang_to.equals("อินโดนีเซีย")){
            loadWording = new EmergencyDAL();
            loadWording.loadLaosToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Laos") && lang_to.equals("Laos") || lang_from.equals("ลาว") && lang_to.equals("ลาว")){
            loadWording = new EmergencyDAL();
            loadWording.loadLaosToLaos();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Laos") && lang_to.equals("Malaysia") || lang_from.equals("ลาว") && lang_to.equals("มาเลเซีย")){
            loadWording = new EmergencyDAL();
            loadWording.loadLaosToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Laos") && lang_to.equals("Myanmar") || lang_from.equals("ลาว") && lang_to.equals("พม่า")){
            loadWording = new EmergencyDAL();
            loadWording.loadLaosToMyanmar();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }


        if(lang_from.equals("Laos") && lang_to.equals("Philippines") || lang_from.equals("ลาว") && lang_to.equals("ฟิลิปปินส์")){
            loadWording = new EmergencyDAL();
            loadWording.loadLaosToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Laos") && lang_to.equals("Singapore") || lang_from.equals("ลาว") && lang_to.equals("สิงคโปร์")){
            loadWording = new EmergencyDAL();
            loadWording.loadLaosToSingapore();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Laos") && lang_to.equals("Vietnam") || lang_from.equals("ลาว") && lang_to.equals("เวียดนาม")){
            loadWording = new EmergencyDAL();
            loadWording.loadLaosToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Malaysia") && lang_to.equals("China") || lang_from.equals("มาเลเซีย") && lang_to.equals("จีน")){
            loadWording = new EmergencyDAL();
            loadWording.loadMalaysiaToChina();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Malaysia") && lang_to.equals("Thai") || lang_from.equals("มาเลเซีย") && lang_to.equals("ไทย")){
            loadWording = new EmergencyDAL();
            loadWording.loadMalaysiaToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Malaysia") && lang_to.equals("Brunei") || lang_from.equals("มาเลเซีย") && lang_to.equals("บรูไน")){
            loadWording = new EmergencyDAL();
            loadWording.loadMalaysiaToBrunei();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Malaysia") && lang_to.equals("Cambodia") || lang_from.equals("มาเลเซีย") && lang_to.equals("กัมพูชา")){
            loadWording = new EmergencyDAL();
            loadWording.loadMalaysiaToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Malaysia") && lang_to.equals("Indonesia") || lang_from.equals("มาเลเซีย") && lang_to.equals("อินโดนีเซีย")){
            loadWording = new EmergencyDAL();
            loadWording.loadMalaysiaToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Malaysia") && lang_to.equals("Laos") || lang_from.equals("มาเลเซีย") && lang_to.equals("ลาว")){
            loadWording = new EmergencyDAL();
            loadWording.loadMalaysiaToLaos();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Malaysia") && lang_to.equals("Malaysia") || lang_from.equals("มาเลเซีย") && lang_to.equals("มาเลเซีย")){
            loadWording = new EmergencyDAL();
            loadWording.loadMalaysiaToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Malaysia") && lang_to.equals("Myanmar") || lang_from.equals("มาเลเซีย") && lang_to.equals("พม่า")){
            loadWording = new EmergencyDAL();
            loadWording.loadMalaysiaToMyanmar();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Malaysia") && lang_to.equals("Philippines") || lang_from.equals("มาเลเซีย") && lang_to.equals("ฟิลิปปินส์")){
            loadWording = new EmergencyDAL();
            loadWording.loadMalaysiaToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Malaysia") && lang_to.equals("Singapore") || lang_from.equals("มาเลเซีย") && lang_to.equals("สิงคโปร์")){
            loadWording = new EmergencyDAL();
            loadWording.loadMalaysiaToSingapore();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Malaysia") && lang_to.equals("Vietnam") || lang_from.equals("มาเลเซีย") && lang_to.equals("เวียดนาม")){
            loadWording = new EmergencyDAL();
            loadWording.loadMalaysiaToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Myanmar") && lang_to.equals("China") || lang_from.equals("พม่า") && lang_to.equals("จีน")){
            loadWording = new EmergencyDAL();
            loadWording.loadMyanmarToChina();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Myanmar") && lang_to.equals("Thai") || lang_from.equals("พม่า") && lang_to.equals("ไทย")){
            loadWording = new EmergencyDAL();
            loadWording.loadMyanmarToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Myanmar") && lang_to.equals("Brunei") || lang_from.equals("พม่า") && lang_to.equals("บรูไน")){
            loadWording = new EmergencyDAL();
            loadWording.loadMyanmarToBrunei();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Myanmar") && lang_to.equals("Brunei") || lang_from.equals("พม่า") && lang_to.equals("บรูไน")){
            loadWording = new EmergencyDAL();
            loadWording.loadMyanmarToBrunei();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Myanmar") && lang_to.equals("Cambodia") || lang_from.equals("พม่า") && lang_to.equals("กัมพูชา")){
            loadWording = new EmergencyDAL();
            loadWording.loadMyanmarToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }


        if(lang_from.equals("Myanmar") && lang_to.equals("Indonesia") || lang_from.equals("พม่า") && lang_to.equals("อินโดนีเซีย")){
            loadWording = new EmergencyDAL();
            loadWording.loadMyanmarToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Myanmar") && lang_to.equals("Laos") || lang_from.equals("พม่า") && lang_to.equals("ลาว")){
            loadWording = new EmergencyDAL();
            loadWording.loadMyanmarToLaos();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Myanmar") && lang_to.equals("Malaysia") || lang_from.equals("พม่า") && lang_to.equals("มาเลเซีย")){
            loadWording = new EmergencyDAL();
            loadWording.loadMyanmarToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Myanmar") && lang_to.equals("Myanmar") || lang_from.equals("พม่า") && lang_to.equals("พม่า")){
            loadWording = new EmergencyDAL();
            loadWording.loadMyanmarToMyanmar();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Myanmar") && lang_to.equals("Philippines") || lang_from.equals("พม่า") && lang_to.equals("ฟิลิปปินส์")){
            loadWording = new EmergencyDAL();
            loadWording.loadMyanmarToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }


        if(lang_from.equals("Myanmar") && lang_to.equals("Singapore") || lang_from.equals("พม่า") && lang_to.equals("สิงคโปร์")){
            loadWording = new EmergencyDAL();
            loadWording.loadMyanmarToSingapore();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Myanmar") && lang_to.equals("Vietnam") || lang_from.equals("พม่า") && lang_to.equals("เวียดนาม")){
            loadWording = new EmergencyDAL();
            loadWording.loadMyanmarToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Philippines") && lang_to.equals("China") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("จีน")){
            loadWording = new EmergencyDAL();
            loadWording.loadPhilippinesToChina();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Philippines") && lang_to.equals("Thai") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("ไทย")){
            loadWording = new EmergencyDAL();
            loadWording.loadPhilippinesToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Philippines") && lang_to.equals("Brunei") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("บรูไน")){
            loadWording = new EmergencyDAL();
            loadWording.loadPhilippinesToBrunei();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Philippines") && lang_to.equals("Cambodia") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("กัมพูชา")){
            loadWording = new EmergencyDAL();
            loadWording.loadPhilippinesToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Philippines") && lang_to.equals("Indonesia") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("อินโดนีเซีย")){
            loadWording = new EmergencyDAL();
            loadWording.loadPhilippinesToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Philippines") && lang_to.equals("Laos") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("ลาว")){
            loadWording = new EmergencyDAL();
            loadWording.loadPhilippinesToLaos();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Philippines") && lang_to.equals("Malaysia") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("มาเลเซีย")){
            loadWording = new EmergencyDAL();
            loadWording.loadPhilippinesToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Philippines") && lang_to.equals("Myanmar") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("พม่า")){
            loadWording = new EmergencyDAL();
            loadWording.loadPhilippinesToMyanmar();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Philippines") && lang_to.equals("Philippines") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("ฟิลิปปินส์")){
            loadWording = new EmergencyDAL();
            loadWording.loadPhilippinesToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Philippines") && lang_to.equals("Singapore") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("สิงคโปร์")){
            loadWording = new EmergencyDAL();
            loadWording.loadPhilippinesToSingapore();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Philippines") && lang_to.equals("Vietnam") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("เวียดนาม")){
            loadWording = new EmergencyDAL();
            loadWording.loadPhilippinesToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Singapore") && lang_to.equals("China") || lang_from.equals("สิงคโปร์") && lang_to.equals("จีน")){
            loadWording = new EmergencyDAL();
            loadWording.loadSingaporeToChina();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }


        if(lang_from.equals("Singapore") && lang_to.equals("Thai") || lang_from.equals("สิงคโปร์") && lang_to.equals("ไทย")){
            loadWording = new EmergencyDAL();
            loadWording.loadSingaporeToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }


        if(lang_from.equals("Singapore") && lang_to.equals("Brunei") || lang_from.equals("สิงคโปร์") && lang_to.equals("บรูไน")){
            loadWording = new EmergencyDAL();
            loadWording.loadSingaporeToBrunei();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Singapore") && lang_to.equals("Cambodia") || lang_from.equals("สิงคโปร์") && lang_to.equals("กัมพูชา")){
            loadWording = new EmergencyDAL();
            loadWording.loadSingaporeToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Singapore") && lang_to.equals("Indonesia") || lang_from.equals("สิงคโปร์") && lang_to.equals("อินโดนีเซีย")){
            loadWording = new EmergencyDAL();
            loadWording.loadSingaporeToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Singapore") && lang_to.equals("Laos") || lang_from.equals("สิงคโปร์") && lang_to.equals("ลาว")){
            loadWording = new EmergencyDAL();
            loadWording.loadSingaporeToLaos();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Singapore") && lang_to.equals("Malaysia") || lang_from.equals("สิงคโปร์") && lang_to.equals("มาเลเซีย")){
            loadWording = new EmergencyDAL();
            loadWording.loadSingaporeToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Singapore") && lang_to.equals("Myanmar") || lang_from.equals("สิงคโปร์") && lang_to.equals("พม่า")){
            loadWording = new EmergencyDAL();
            loadWording.loadSingaporeToMyanmar();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Singapore") && lang_to.equals("Philippines") || lang_from.equals("สิงคโปร์") && lang_to.equals("ฟิลิปปินส์")){
            loadWording = new EmergencyDAL();
            loadWording.loadSingaporeToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Singapore") && lang_to.equals("Singapore") || lang_from.equals("สิงคโปร์") && lang_to.equals("สิงคโปร์")){
            loadWording = new EmergencyDAL();
            loadWording.loadSingaporeToSingapore();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Singapore") && lang_to.equals("Vietnam") || lang_from.equals("สิงคโปร์") && lang_to.equals("เวียดนาม")){
            loadWording = new EmergencyDAL();
            loadWording.loadSingaporeToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Vietnam") && lang_to.equals("China") || lang_from.equals("เวียดนาม") && lang_to.equals("จีน")){
            loadWording = new EmergencyDAL();
            loadWording.loadVietnamToChina();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Vietnam") && lang_to.equals("Thai") || lang_from.equals("เวียดนาม") && lang_to.equals("ไทย")){
            loadWording = new EmergencyDAL();
            loadWording.loadVietnamToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Vietnam") && lang_to.equals("Brunei") || lang_from.equals("เวียดนาม") && lang_to.equals("บรูไน")){
            loadWording = new EmergencyDAL();
            loadWording.loadVietnamToBrunei();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Vietnam") && lang_to.equals("Cambodia") || lang_from.equals("เวียดนาม") && lang_to.equals("กัมพูชา")){
            loadWording = new EmergencyDAL();
            loadWording.loadVietnamToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Vietnam") && lang_to.equals("Indonesia") || lang_from.equals("เวียดนาม") && lang_to.equals("อินโดนีเซีย")){
            loadWording = new EmergencyDAL();
            loadWording.loadVietnamToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }


        if(lang_from.equals("Vietnam") && lang_to.equals("Laos") || lang_from.equals("เวียดนาม") && lang_to.equals("ลาว")){
            loadWording = new EmergencyDAL();
            loadWording.loadVietnamToLaos();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Vietnam") && lang_to.equals("Malaysia") || lang_from.equals("เวียดนาม") && lang_to.equals("มาเลเซีย")){
            loadWording = new EmergencyDAL();
            loadWording.loadVietnamToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Vietnam") && lang_to.equals("Myanmar") || lang_from.equals("เวียดนาม") && lang_to.equals("พม่า")){
            loadWording = new EmergencyDAL();
            loadWording.loadVietnamToMyanmar();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Vietnam") && lang_to.equals("Philippines") || lang_from.equals("เวียดนาม") && lang_to.equals("ฟิลิปปินส์")){
            loadWording = new EmergencyDAL();
            loadWording.loadVietnamToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Vietnam") && lang_to.equals("Singapore") || lang_from.equals("เวียดนาม") && lang_to.equals("สิงคโปร์")){
            loadWording = new EmergencyDAL();
            loadWording.loadVietnamToSingapore();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }

        if(lang_from.equals("Vietnam") && lang_to.equals("Vietnam") || lang_from.equals("เวียดนาม") && lang_to.equals("เวียดนาม")){
            loadWording = new EmergencyDAL();
            loadWording.loadVietnamToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(HelpActivity.this, loadWording.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
            myList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int groupPosition) {
                    if (prev !=-1){
                        myList.collapseGroup(prev);
                    }
                    prev = groupPosition;
                }
            });
        }


    }


    //method expand all groups
    private void expandAll(){
        int count = listAdapter.getGroupCount();
        for (int i = 0 ;i< count;i++){
            myList.expandGroup(i);
        }
    }

    private void loadThaiToBrunei() {

        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("Test1", "Test2", "Test3", "Test4", "Test5", null, null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("TEST", "SUB", childList);
        groupHeaderList.add(groupHeader);


    }

    @Override
    public boolean onClose(){
        listAdapter.filterData("");
        expandAll();
        return false;
    }

    @Override
    public boolean onQueryTextChange(String qry) {
        listAdapter.filterData(qry);
        expandAll();
        return false;
    }

    @Override
    public boolean onQueryTextSubmit(String qry) {
        listAdapter.filterData(qry);
        expandAll();
        return false;
    }

    private void search() {
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        search = (SearchView) findViewById(R.id.action_search);
        search.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        search.setIconifiedByDefault(false);
        search.setOnQueryTextListener(this);
        search.setOnCloseListener(this);

    }

    private void initWidget() {
        countryFrom = (Spinner) findViewById(R.id.spinner_show);

        countryTo = (Spinner) findViewById(R.id.spinner2_show);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_main_actions, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_settings:
                Intent i;
                i = new Intent(getApplicationContext(), SettingActivity.class);
               finish();
                startActivity(i);

                return true;
            //break;
            case R.id.action_search:
                Intent intent;
                intent = new Intent(getApplicationContext(),SearchActivity.class);


                saveValue(lang_from,lang_to);
                intent.putExtra("strCountryFrom", lang_from);
                intent.putExtra("strCountryTo", lang_to);
                finish();
                startActivity(intent);


                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
