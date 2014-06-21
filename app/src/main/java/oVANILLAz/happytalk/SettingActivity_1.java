package oVANILLAz.happytalk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by oVANILLAz on 6/3/14 AD.
 */
public class SettingActivity_1 extends Activity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
        
        initSettingListView();


    }

//    @Override
//    protected void onListItemClick(ListView l, View v, int position, long id) {
//        super.onListItemClick(l, v, position, id);
//    }

    private void initSettingListView() {

        final String[] setting =new String[] {"Language","About"};

        ListView listView = (ListView) findViewById(R.id.settingList);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,setting);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position){
                    case 0:
                        intent = new Intent(getApplicationContext(), LanguageActivity.class);
                        startActivity(intent);
                       // Language();
                        break;
                    case 1:
                       // intent = new Intent(getApplicationContext(), AboutActivity.class);
                       // startActivity(intent);
                        break;
                    default:
                        break;
                }
            }
        });



    }

//    public void Language() {
//        final String[] items ={"Thai","English"};
//        final String[] itemsTH ={"ไทย","อังกฤษ"};
//        AlertDialog.Builder builder = new AlertDialog.Builder(SettingActivity.this);
//
//        builder.setTitle("Choose Language");
//        builder.setSingleChoiceItems(items, 1, null);
//        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                ListView lv = ((AlertDialog) dialog).getListView();
//                int selectedItem = lv.getCheckedItemPosition();
//
//                showToast("Language changed : " + items[selectedItem]);
//
//                if(items[selectedItem].equals("Thai")){
//                    Configuration configuration = new Configuration();
//                    configuration.locale = new Locale("Th");
//                    getResources().updateConfiguration(configuration,null);
//
//                    onCreate(null);
//                }
//                else{
//                    Configuration configuration = new Configuration();
//                    configuration.locale = Locale.ENGLISH;
//                    getResources().updateConfiguration(configuration,null);
//
//                    onCreate(null);
//
//
//                }
//            }
//        })
//        .show();
//
//
//    }

    public void Language(){

    }


    private void showToast(String text) {
        Toast toast = Toast.makeText(this, text, Toast.LENGTH_LONG);
        toast.show();
    }


}
