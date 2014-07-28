package oVANILLAz.happytalk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.content.res.TypedArray;
import android.content.Intent;
import android.widget.Spinner;
import android.widget.TextView;


import android.widget.AdapterView.OnItemSelectedListener;


import oVANILLAz.happytalk.Database.FavoriteDAL;

import java.util.Locale;


public class MainActivity extends Activity {


    private Spinner countryFrom, countryTo;

    int countryF , countryT,userChoiceFrom,userChoiceTo;
    SharedPreferences sharedPref1 , sharedPref2;
    private String strCountryFrom, strCountryTo;

    SQLiteDatabase sqLiteDatabase;
    String[] country_list1 = {"Thai", "Brunei", "Cambodia", "China", "Indonesia",
            "Laos", "Malaysia", "Myanmar", "Philippines", "Singapore",
            "Vietnam"};

    Integer[] img1 = {R.drawable.thailand_flag, R.drawable.brunei_flag, R.drawable.cambodia_flag,
            R.drawable.china_flag, R.drawable.indonesia_flag,
            R.drawable.laos_flag, R.drawable.malaysia,
            R.drawable.myanmar_flag, R.drawable.philippines_flag,
            R.drawable.singapore_flag,
            R.drawable.vietnam_flag};

    String[] country_list2 = {"China", "Thai", "Brunei", "Cambodia", "Indonesia",
            "Laos", "Malaysia", "Myanmar", "Philippines", "Singapore",
            "Vietnam"};

    Integer[] img2 = {R.drawable.china_flag, R.drawable.thailand_flag, R.drawable.brunei_flag, R.drawable.cambodia_flag,
            R.drawable.indonesia_flag,
            R.drawable.laos_flag, R.drawable.malaysia,
            R.drawable.myanmar_flag, R.drawable.philippines_flag,
            R.drawable.singapore_flag,
            R.drawable.vietnam_flag};


    //Th
    String[] country_list1TH = {"ไทย", "บรูไน", "กัมพูชา", "จีน", "อินโดนีเซีย",
            "ลาว", "มาเลเซีย", "พม่า", "ฟิลิปปินส์", "สิงคโปร์",
            "เวียดนาม"};

    Integer[] img1TH = {R.drawable.thailand_flag, R.drawable.brunei_flag, R.drawable.cambodia_flag,
            R.drawable.china_flag, R.drawable.indonesia_flag,
            R.drawable.laos_flag, R.drawable.malaysia,
            R.drawable.myanmar_flag, R.drawable.philippines_flag,
            R.drawable.singapore_flag,
            R.drawable.vietnam_flag};

    String[] country_list2TH = {"จีน", "ไทย", "บรูไน", "กัมพูชา", "อินโดนีเซีย",
            "ลาว", "มาเลเซีย", "พม่า", "ฟิลิปปินส์", "สิงคโปร์",
            "เวียดนาม"};

    Integer[] img2TH = {R.drawable.china_flag, R.drawable.thailand_flag, R.drawable.brunei_flag, R.drawable.cambodia_flag,
            R.drawable.indonesia_flag,
            R.drawable.laos_flag, R.drawable.malaysia,
            R.drawable.myanmar_flag, R.drawable.philippines_flag,
            R.drawable.singapore_flag,
            R.drawable.vietnam_flag};
    Context context;

    private Typeface thSarabun;


    ImageView happy,sss,logis,mol;

    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        FavoriteDAL db = new FavoriteDAL(this);


        //loadingFont();
    }




    public void footerLink() {
        happy = (ImageView) findViewById(R.id.happytalk);

        happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "http://www.thailog.org/happyworkplace";

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);

                //pass the url to intent data
                intent.setData(Uri.parse(url));

                startActivity(intent);

            }
        });
        sss =(ImageView)findViewById(R.id.sososo);
        sss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.thaihealth.or.th"));
                startActivity(intent);
            }
        });
        logis = (ImageView) findViewById(R.id.logistic);
        logis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.thailog.org"));
                startActivity(intent);
            }
        });

        mol = (ImageView) findViewById(R.id.mol);
        mol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.mol.go.th"));
                startActivity(intent);
            }
        });


    }

//    private void loadingFont() {
//
//        thSarabun = Typeface.createFromAsset(context.getAssets(), "fonts/THSarabunPSK");

//
//
//
//
//    }


    private void initWidget() {
        countryFrom = (Spinner) findViewById(R.id.spinner_show);



        countryTo = (Spinner) findViewById(R.id.spinner2_show);
        // btnSearch = (Button) findViewById(R.id.btn_go);


    }


    private void initWidgetTH() {
        countryFrom = (Spinner) findViewById(R.id.spinner_show);


        countryTo = (Spinner) findViewById(R.id.spinner2_show);
        // btnSearch = (Button) findViewById(R.id.btn_go);
    }


    //spinner
    public class MyCustomAdapter extends ArrayAdapter<String> {

        public MyCustomAdapter(Context context, int textViewResourceId, String[] objects, Integer[] img) {
            super(context, textViewResourceId, objects);
        }

        @Override
        public View getDropDownView(int position, View convertView, ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }

        public View getCustomView(int position, View convertView, ViewGroup parent) {
            //return super.getView(position,convertView,parent);

            LayoutInflater inflater = getLayoutInflater();
            View row = inflater.inflate(R.layout.spinner_row, parent, false);
            TextView label = (TextView) row.findViewById(R.id.country);
            label.setText(country_list1[position]);


            ImageView icon = (ImageView) row.findViewById(R.id.flag);
            icon.setImageResource(img1[position]);

            return row;
        }

    }

    public class MyCustomAdapter2 extends ArrayAdapter<String> {

        public MyCustomAdapter2(Context context, int textViewResourceId, String[] objects, Integer[] img) {
            super(context, textViewResourceId, objects);
        }

        @Override
        public View getDropDownView(int position, View convertView, ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }

        public View getCustomView(int position, View convertView, ViewGroup parent) {
            //return super.getView(position,convertView,parent);

            LayoutInflater inflater = getLayoutInflater();
            View row = inflater.inflate(R.layout.spinner_row, parent, false);
            TextView label = (TextView) row.findViewById(R.id.country);
            label.setText(country_list2[position]);


            ImageView icon = (ImageView) row.findViewById(R.id.flag);
            icon.setImageResource(img2[position]);

            return row;
        }

    }


    //spinner TH
    public class MyCustomAdapterTH extends ArrayAdapter<String> {

        public MyCustomAdapterTH(Context context, int textViewResourceId, String[] objects, Integer[] img) {
            super(context, textViewResourceId, objects);
        }

        @Override
        public View getDropDownView(int position, View convertView, ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }

        public View getCustomView(int position, View convertView, ViewGroup parent) {
            //return super.getView(position,convertView,parent);

            LayoutInflater inflater = getLayoutInflater();
            View row = inflater.inflate(R.layout.spinner_row, parent, false);
            TextView label = (TextView) row.findViewById(R.id.country);
            label.setText(country_list1TH[position]);


            ImageView icon = (ImageView) row.findViewById(R.id.flag);
            icon.setImageResource(img1TH[position]);

            return row;
        }

    }

    public class MyCustomAdapter2TH extends ArrayAdapter<String> {

        public MyCustomAdapter2TH(Context context, int textViewResourceId, String[] objects, Integer[] img) {
            super(context, textViewResourceId, objects);
        }

        @Override
        public View getDropDownView(int position, View convertView, ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }

        public View getCustomView(int position, View convertView, ViewGroup parent) {
            //return super.getView(position,convertView,parent);

            LayoutInflater inflater = getLayoutInflater();
            View row = inflater.inflate(R.layout.spinner_row, parent, false);
            TextView label = (TextView) row.findViewById(R.id.country);
            label.setText(country_list2TH[position]);


            ImageView icon = (ImageView) row.findViewById(R.id.flag);
            icon.setImageResource(img2TH[position]);

            return row;
        }

    }

    //print
    public class MyOnItemSelectedListener implements OnItemSelectedListener {

        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {



            switch (parent.getId()) {
                case R.id.spinner_show:


                    strCountryFrom = String.valueOf(countryFrom.getSelectedItem());
                    saveSpinnerValue1();
                    break;

                case R.id.spinner2_show:

                    strCountryTo = String.valueOf(countryTo.getSelectedItem());
                    saveSpinnerValue2();


                    break;

                default:

                    break;

            }

       // saveSpinnerValue();

        }

        public void onNothingSelected(AdapterView parent) {
            // Do nothing.

        }

    }


    private void saveSpinnerValue1() {
        userChoiceFrom = countryFrom.getSelectedItemPosition();
        sharedPref1 = getSharedPreferences("FileName1",MODE_PRIVATE);
        SharedPreferences.Editor prefEditor1 = sharedPref1.edit();
        prefEditor1.putInt("userChoiceSpinner1",userChoiceFrom);
        prefEditor1.commit();





    }
    private void saveSpinnerValue2(){
        userChoiceTo = countryTo.getSelectedItemPosition();
        sharedPref2 = getSharedPreferences("FileName2",MODE_PRIVATE);
        SharedPreferences.Editor prefEditor2 = sharedPref2.edit();
        prefEditor2.putInt("userChoiceSpinner2",userChoiceTo);
        prefEditor2.commit();
    }

    public class MyOnItemSelectedListenerTH implements OnItemSelectedListener {

        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {


            switch (parent.getId()) {
                case R.id.spinner_show:

                    strCountryFrom = String.valueOf(countryFrom.getSelectedItem());
                    saveSpinnerValue1();


                    break;

                case R.id.spinner2_show:
                    strCountryTo = String.valueOf(countryTo.getSelectedItem());
                    saveSpinnerValue2();
                    break;

                default:
//                strCountryFrom = String.valueOf(1);
//                strCountryTo = String.valueOf(2);
                    break;

            }
            //Log.d("country:",parent.getItemAtPosition(pos).toString());

        }

        public void onNothingSelected(AdapterView parent) {
            // Do nothing.

        }

    }

    public int[] getImageArray(int resId, int defResId) {
        TypedArray my_image_array = getResources().obtainTypedArray(resId);
        int[] array_res = new int[my_image_array.length()];
        for (int i = 0; i < array_res.length; i++)
            array_res[i] = my_image_array.getResourceId(i, defResId);
        my_image_array.recycle();
        return array_res;
    }

    public String[] getStringArray(int resId) {
        TypedArray my_string_array = getResources().obtainTypedArray(resId);
        String[] array_string = new String[my_string_array.length()];
        for (int i = 0; i < array_string.length; i++)
            array_string[i] = my_string_array.getString(i);
        my_string_array.recycle();
        return array_string;
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
                //finish();
                startActivity(i);
                // onRestart();
                return true;
            //break;
            case R.id.action_search:
                Intent intent;
                intent = new Intent(getApplicationContext(), SearchActivity.class);
                intent.putExtra("strCountryFrom", strCountryFrom);
                intent.putExtra("strCountryTo", strCountryTo);
                // finish();
                startActivity(intent);
                //onRestart();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void onResume() {
        super.onResume();
        //reload value from preference screen
        PreferenceManager.setDefaultValues(this, R.xml.setting, false);
        final SharedPreferences setting = PreferenceManager.getDefaultSharedPreferences(this);

        String value = setting.getString("langPref", "");


        Locale locale = new Locale(value);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());
        this.setContentView(R.layout.activity_main);





        if (value.equals("English(United States)") || value.equals("ENG")) {
            // getResources().updateConfiguration(config, null);
            initWidget();



            countryFrom = (Spinner) findViewById(R.id.spinner_show);
            countryFrom.setAdapter(new MyCustomAdapter(MainActivity.this, R.layout.spinner_row, country_list1, img1));
            countryFrom.setOnItemSelectedListener(new MyOnItemSelectedListener());
            loadSpinnerValue1();


            //loadSpinnerValue2();
            countryTo = (Spinner) findViewById(R.id.spinner2_show);
            countryTo.setAdapter(new MyCustomAdapter2(MainActivity.this, R.layout.spinner_row, country_list2, img2));
            countryTo.setOnItemSelectedListener(new MyOnItemSelectedListener());
            loadSpinnerValue2();



            //custom icon
            int[] array_res = getImageArray(R.array.image_array
                    , R.drawable.ic_launcher);
            String[] array_string = getStringArray(R.array.string_array);
            //

            ListView listView = (ListView) findViewById(R.id.listView);
            listView.setAdapter(new CustomListViewAdapter(getApplicationContext()
                    , android.R.id.text1, array_string, array_res));
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                //arg2 =input value use to switchcase
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    Intent intent;
                    switch (position) {
                        case 0:
                            intent = new Intent(getApplicationContext(), ConversationActivity.class);
                            intent.putExtra("strCountryFrom", strCountryFrom);
                            intent.putExtra("strCountryTo", strCountryTo);
                            Log.d("countryFrom", strCountryFrom);
                            Log.d("countryTo", strCountryTo);

                            //finish();
                            startActivity(intent);

                            break;
                        case 1:
                            intent = new Intent(getApplicationContext(), ThingActivity.class);
                            intent.putExtra("strCountryFrom", strCountryFrom);
                            intent.putExtra("strCountryTo", strCountryTo);
                           // finish();
                            startActivity(intent);

                            break;
                        case 2:
                            intent = new Intent(getApplicationContext(), PlaceActivity.class);
                            intent.putExtra("strCountryFrom", strCountryFrom);
                            intent.putExtra("strCountryTo", strCountryTo);
                            //finish();
                            startActivity(intent);

                            break;

                        case 3:
                            intent = new Intent(getApplicationContext(), HelpActivity.class);
                            intent.putExtra("strCountryFrom", strCountryFrom);
                            intent.putExtra("strCountryTo", strCountryTo);
                            //finish();
                            startActivity(intent);

                            break;
                        case 4:
                            intent = new Intent(getApplicationContext(), LogisticActivity.class);
                            intent.putExtra("strCountryFrom", strCountryFrom);
                            intent.putExtra("strCountryTo", strCountryTo);

                            //finish();
                            startActivity(intent);

                            break;
                        case 5:
                            intent = new Intent(getApplicationContext(), FavoriteActivity.class);
                            intent.putExtra("strCountryFrom", strCountryFrom);
                            intent.putExtra("strCountryTo", strCountryTo);
                            //finish();
                            startActivity(intent);

                            break;
                    }
                }


            });
        } else if (value.equals(("Thai"))) {
            initWidgetTH();

            Spinner countryFrom = (Spinner) findViewById(R.id.spinner_show);
            countryFrom.setAdapter(new MyCustomAdapterTH(MainActivity.this, R.layout.spinner_row, country_list1TH, img1TH));
            countryFrom.setOnItemSelectedListener(new MyOnItemSelectedListenerTH());
            loadSpinnerValue1();

            Spinner countryTo = (Spinner) findViewById(R.id.spinner2_show);
            countryTo.setAdapter(new MyCustomAdapter2TH(MainActivity.this, R.layout.spinner_row, country_list2TH, img2TH));
            countryTo.setOnItemSelectedListener(new MyOnItemSelectedListenerTH());
            loadSpinnerValue2();


            //custom icon
            int[] array_res = getImageArray(R.array.image_array
                    , R.drawable.ic_launcher);
            String[] array_string = getStringArray(R.array.string_array);
            //

            ListView listView = (ListView) findViewById(R.id.listView);
            listView.setAdapter(new CustomListViewAdapter(getApplicationContext()
                    , android.R.id.text1, array_string, array_res));
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                //arg2 =input value use to switchcase
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    Intent intent;
                    switch (position) {
                        case 0:
                            intent = new Intent(getApplicationContext(), ConversationActivity.class);
                            intent.putExtra("strCountryFrom", strCountryFrom);
                            intent.putExtra("strCountryTo", strCountryTo);
                            Log.d("countryFrom", strCountryFrom);
                            Log.d("countryTo", strCountryTo);

                           // finish();
                            startActivity(intent);
                            //onRestart();
                            break;
                        case 1:
                            intent = new Intent(getApplicationContext(), ThingActivity.class);
                            intent.putExtra("strCountryFrom", strCountryFrom);
                            intent.putExtra("strCountryTo", strCountryTo);
                            finish();
                            startActivity(intent);
                            //onRestart();
                            break;
                        case 2:
                            intent = new Intent(getApplicationContext(), PlaceActivity.class);
                            intent.putExtra("strCountryFrom", strCountryFrom);
                            intent.putExtra("strCountryTo", strCountryTo);
                           // finish();
                            startActivity(intent);
                            // onRestart();
                            break;
                        case 3:
                            intent = new Intent(getApplicationContext(), HelpActivity.class);
                            intent.putExtra("strCountryFrom", strCountryFrom);
                            intent.putExtra("strCountryTo", strCountryTo);
                            startActivity(intent);
                            //onRestart();
                            break;
                        case 4:
                            intent = new Intent(getApplicationContext(), LogisticActivity.class);
                            intent.putExtra("strCountryFrom", strCountryFrom);
                            intent.putExtra("strCountryTo", strCountryTo);
                            //finish();
                            startActivity(intent);
                            //onRestart();
                            break;
                        case 5:
                            intent = new Intent(getApplicationContext(), FavoriteActivity.class);
                            intent.putExtra("strCountryFrom", strCountryFrom);
                            intent.putExtra("strCountryTo", strCountryTo);
                            //finish();
                            startActivity(intent);
                            //onRestart();
                            break;
                    }
                }


            });

        }
        footerLink();
    }





    private void loadSpinnerValue1() {
        sharedPref1 = getSharedPreferences("FileName1",MODE_PRIVATE);
        countryF = sharedPref1.getInt("userChoiceSpinner1",-1);
        if(countryF != -1) {
            // set the value of the spinner
            countryFrom.setSelection(countryF);
        }



    }
    private void loadSpinnerValue2() {

        sharedPref2 = getSharedPreferences("FileName2",MODE_PRIVATE);
        countryT = sharedPref2.getInt("userChoiceSpinner2",-1);
        if(countryT != -1){
            countryTo.setSelection(countryT);
        }
    }
}







