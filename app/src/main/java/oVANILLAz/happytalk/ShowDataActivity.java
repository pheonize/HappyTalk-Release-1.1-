package oVANILLAz.happytalk;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import oVANILLAz.happytalk.Database.Database;

/**
 * Created by oVANILLAz on 6/3/14 AD.
 */
public class ShowDataActivity extends Activity{

    private TextView langFrom;
    private TextView langTo;
    private TextView wordFrom;
    private TextView wordTo;
    private TextView wordEN;
    private TextView karaokeEN;
    private TextView karaokeTH;
    private Button sound;
    private Button favorite;


    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
//        setContentView(R.layout.dialog_data);
//
//        langFrom = (TextView)findViewById(R.id.txtLangFrom);
//        langTo = (TextView)findViewById(R.id.txtLangTo);
//        wordFrom = (TextView)findViewById(R.id.txtWordFrom);
//        wordTo = (TextView)findViewById(R.id.txtWordTo);
//        wordEN = (TextView)findViewById(R.id.txtWordEN);
//        karaokeEN=(TextView)findViewById(R.id.txtKaraokeEN);
//        karaokeTH=(TextView)findViewById(R.id.txtKaraokeTH);
//        sound =(Button)findViewById(R.id.btnSound);
//        favorite=(Button)findViewById(R.id.btnFavorite);

        sound.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        favorite.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Bundle extra = getIntent().getExtras();
        if(extra !=null){
            //String strlangFrom = extra.getString(Database.COLUMN_LANGFROM);
            //String strlangTo = extra.getString(Database.COLUMN_LANGTO);
            String strlangFrom = extra.getString("strCountryFrom", "");
            String strlangTo = extra.getString("strCountryTo","");
            String strwordFrom = extra.getString(Database.COLUMN_WORDFROM);
            String strwordTo = extra.getString(Database.COLUMN_WORDTO);
            String strwordEN = extra.getString(Database.COLUMN_WORDEN);
            String strkaraokeEN = extra.getString(Database.COLUMN_KARAOKEEN);
            String strkaraokeTH = extra.getString(Database.COLUMN_KARAOKETH);

            if(langFrom !=null){
                langFrom.setText(strlangFrom);
            }
            if(langTo !=null){
                langTo.setText(strlangTo);
            }
            if(wordFrom!=null){
                wordFrom.setText(strwordFrom);
            }
            if(wordTo!=null){
                wordTo.setText(strwordTo);
            }
            if(wordEN !=null){
                wordEN.setText(strwordEN);
            }
            if(karaokeEN !=null){
                karaokeEN.setText(strkaraokeEN);
            }
            if(karaokeTH !=null){
                karaokeTH.setText(strkaraokeTH);
            }
        }


    }

}
