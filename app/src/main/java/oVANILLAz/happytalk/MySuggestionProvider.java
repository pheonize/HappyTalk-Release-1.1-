package oVANILLAz.happytalk;

import android.content.SearchRecentSuggestionsProvider;

/**
 * Created by oVANILLAz on 6/11/14 AD.
 */
public class MySuggestionProvider extends SearchRecentSuggestionsProvider{
    public final static String AUTHORITY ="com.example.happytalk.happytalk";
    public final static int MODE = DATABASE_MODE_QUERIES | DATABASE_MODE_2LINES;

    public MySuggestionProvider(){
        setupSuggestions(AUTHORITY,MODE);

    }



}
