package oVANILLAz.happytalk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by oVANILLAz on 5/15/14 AD.
 */
public class CustomListViewAdapter extends ArrayAdapter<String>{
    String[] STR;
    int[] RESOURCE_ID;
    LayoutInflater INFLATER;

    public CustomListViewAdapter(Context context,int textViewResourceId,String[] objects,int[] resourceId){
        super(context,textViewResourceId,objects);
        STR = objects;
        RESOURCE_ID = resourceId;
        INFLATER = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


    }
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = null;
        if(convertView == null) {
            convertView = INFLATER.inflate(R.layout.listview_row
                    , parent, false);
            imageView =
                    (ImageView)convertView.findViewById(R.id.imageView1);
        } else {
            imageView =
                    (ImageView)convertView.findViewById(R.id.imageView1);
            DecodeTask dt1 = (DecodeTask)imageView.getTag(R.id.imageView1);
            if(dt1 != null)
                dt1.cancel(true);
        }

        imageView.setImageBitmap(null);
        DecodeTask dt2 = new DecodeTask(getContext(), imageView
                , RESOURCE_ID[position]);
        dt2.execute();
        imageView.setTag(R.id.imageView1, dt2);

        TextView textView =
                (TextView)convertView.findViewById(R.id.textView1);
        textView.setText(STR[position]);

        return convertView;
    }
}
