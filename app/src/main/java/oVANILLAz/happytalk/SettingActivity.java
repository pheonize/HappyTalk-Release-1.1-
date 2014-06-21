package oVANILLAz.happytalk;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.res.Configuration;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Locale;

/**
 * Created by oVANILLAz on 6/4/14 AD.
 */
public class SettingActivity extends PreferenceActivity implements OnSharedPreferenceChangeListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //aboutSSS();
    }

//    private void aboutSSS() {
//        Button btnAbout = (Button) findViewById(R.id.aboutTh);
//        btnAbout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(),AboutActivity2.class);
//                startActivity(intent);
//            }
//        });
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main_actions,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.action_settings:
                //Intent i = new Intent(this,SettingActivity.class);
                //finish();
                //startActivity(i);
                //onRestart();
                return true;


            default:
                return super.onOptionsItemSelected(item);

        }


    }


    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        if (key.equals("langPref")) {
            //Display selected
            displayCurrentName(sharedPreferences);
            //Toast.makeText(this, "Language changed", Toast.LENGTH_SHORT).show();
            //Intent intent = new Intent(this,SettingActivity.class);
            //finish();
            //startActivity(intent);
            //return;
            recreate();
        }
    }

    private void displayCurrentName(SharedPreferences sharedPreferences) {

        Preference langPref = findPreference("langPref");

        String value = sharedPreferences.getString("langPref","");

        String msg ="Current language : " +sharedPreferences.getString("langPref","");


        if (value.equals("Thai")) {
            Configuration configuration = new Configuration();
            configuration.locale = new Locale("Th");

            String newConfig = String.valueOf(configuration.locale);

              Locale newLocale = new Locale(newConfig);
            Locale.setDefault(newLocale);
                Configuration config = getBaseContext().getResources().getConfiguration();
            if(!config.locale.equals(newLocale)){
                config.locale = newLocale;
                getBaseContext().getResources().updateConfiguration(config,null);
            }

//
//            Configuration newConf = new Configuration();
//            newConf.locale = newLocale;
//
//            //update locale
//            getResources().updateConfiguration(newConf,null);

            //getResources().updateConfiguration(configuration,null);
           // onConfigurationChanged(configuration);
            //onCreate(null);
            //setConfig(newConfig);

        } else {
            Configuration configuration = new Configuration();
            configuration.locale = Locale.ENGLISH;

            String newConfig = String.valueOf(configuration.locale);



            Locale newLocale = new Locale(newConfig);
            Locale.setDefault(newLocale);
            Configuration config = getBaseContext().getResources().getConfiguration();
            if(!config.locale.equals(newLocale)){
                config.locale = newLocale;
                getBaseContext().getResources().updateConfiguration(config,null);
            }
            //getResources().updateConfiguration(configuration, null);

            //onCreate(null);
        }
        langPref.setSummary(msg);
    }



//    private void setConfig(String newConfig) {
//        Locale newLocale = new Locale(newConfig);
//        Resources res = getResources();
//        DisplayMetrics dm = res.getDisplayMetrics();
//        Configuration conf = res.getConfiguration();
//        conf.locale = newLocale;
//        res.updateConfiguration(conf,dm);
//
//        onConfigurationChanged(conf);
//    }



//    @Override
//    public void onConfigurationChanged(Configuration newConfig) {
//        super.onConfigurationChanged(newConfig);
//
//        getBaseContext().getResources().updateConfiguration(newConfig, getBaseContext().getResources().getDisplayMetrics());
//        addPreferencesFromResource(R.xml.setting);
//       // setTitle(R.string.app_name);
//
//        // Checks the active language
//        if (newConfig.locale.equals(Locale.ENGLISH)) {
//            Toast.makeText(this, "English", Toast.LENGTH_SHORT).show();
////        } else if (newConfig.locale.equals("th")) {
//        }else{
//            Toast.makeText(this, "Th", Toast.LENGTH_SHORT).show();
//        }
//    }
     public void onResume() {
        super.onResume();
         addPreferencesFromResource(R.xml.setting);
         SharedPreferences settings =
                 PreferenceManager.getDefaultSharedPreferences(this);
         settings.registerOnSharedPreferenceChangeListener(this);

         displayCurrentName(settings);
    }
}
