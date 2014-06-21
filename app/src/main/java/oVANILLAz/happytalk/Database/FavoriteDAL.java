package oVANILLAz.happytalk.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import oVANILLAz.happytalk.GroupHeader;

import java.util.ArrayList;

/**
 * Created by oVANILLAz on 6/12/14 AD.
 */
public class FavoriteDAL extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_NAME = "HappyTalk";

    public static final String TABLE_FAVORITE = "favorite";

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_LANGFROM = "langFrom";
    public static final String COLUMN_LANGTO = "langTo";
    public static final String COLUMN_WORDEN = "wordEN";
    public static final String COLUMN_WORDFROM = "wordFrom";
    public static final String COLUMN_WORDTO = "wordTo";
    public static final String COLUMN_KARAOKETH = "karaokeTH";
    public static final String COLUMN_KARAOKEEN = "karaokeEN";
    public static final String COLUMN_SOUND = "sound";

    private Context context;

    private ArrayList<GroupHeader> groupHeaderList = new ArrayList<GroupHeader>();





    public FavoriteDAL(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);


    }




    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_FAVORITE_TABLE = "CREATE TABLE " + TABLE_FAVORITE + "("
                + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_LANGFROM +
                " TEXT, " + COLUMN_LANGTO + " TEXT, " + COLUMN_WORDEN + " TEXT, " + COLUMN_WORDFROM + " TEXT, " +
                COLUMN_WORDTO + " TEXT, " + COLUMN_KARAOKETH + " TEXT, " + COLUMN_KARAOKEEN +
                " TEXT, " + COLUMN_SOUND + " INTEGER " + ")";

        db.execSQL(CREATE_FAVORITE_TABLE);
        Log.d("CREATE TABLE", "Create Table Successfully.");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_FAVORITE);

        onCreate(db);
    }

}
