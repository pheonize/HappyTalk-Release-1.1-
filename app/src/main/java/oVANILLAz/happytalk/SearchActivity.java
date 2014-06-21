package oVANILLAz.happytalk;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.SearchView;

import oVANILLAz.happytalk.Database.ConversationDAL;

import oVANILLAz.happytalk.Database.EmergencyDAL;
import oVANILLAz.happytalk.Database.LogisticDAL;
import oVANILLAz.happytalk.Database.PlaceDAL;
import oVANILLAz.happytalk.Database.ThingDAL;

import java.util.ArrayList;

/**
 * Created by oVANILLAz on 6/11/14 AD.
 */
public class SearchActivity extends Activity implements SearchView.OnQueryTextListener, SearchView.OnCloseListener {

    private ConversationDAL loadConversation = new ConversationDAL();
    private ThingDAL loadThing = new ThingDAL();
    private PlaceDAL loadPlace = new PlaceDAL();
    private EmergencyDAL loadEmergency = new EmergencyDAL();
    private LogisticDAL loadLogistic = new LogisticDAL();



    private MyListAdapter listAdapter;

    private ExpandableListView myList;
    private ArrayList<GroupHeader> groupHeaderList = new ArrayList<GroupHeader>();
    private String strCountryFrom, strCountryTo;

    EditText editSearch;
    private SearchView search;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);

        checkLanguage();
        initSearch();


    }

//    private void initSearch() {
//        editSearch = (EditText)findViewById(R.id.searchText);
//        editSearch.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable arg0) {
//                String text = editSearch.getText().toString().toLowerCase();
//                listAdapter.filter(text);
//            }
//        });
//
//    }


    private void checkLanguage() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }

        String lang_from = extras.getString("strCountryFrom", "");
        if (lang_from != null) {
            //Do something

            Log.d("--Conservation_FROM", lang_from);
            //TextView langFrom = (TextView) findViewById(R.id.txtLangFrom);
            //langFrom.setText(lang_from);

        }

        String lang_to = extras.getString("strCountryTo", "");
        if (lang_to != null) {
            //Do something
            Log.d("--Conservation_TO", lang_to);
            //TextView langTo = (TextView) findViewById(R.id.txtLangTo);
            //langTo.setText(lang_to);

        }
        initData(lang_from, lang_to);
    }

    public void initData(String lang_from, String lang_to) {


        if (lang_from.equals("Thai") && lang_to.equals("Brunei") || lang_from.equals("ไทย") && lang_to.equals("บรูไน")) {

            loadConversation.loadThaiToBrunei();
            loadThing.loadThaiToBrunei();
            loadEmergency.loadThaiToBrunei();
            loadLogistic.loadThaiToBrunei();
            loadPlace.loadThaiToBrunei();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);

        }
        if (lang_from.equals("Thai") && lang_to.equals("China") || lang_from.equals("ไทย") && lang_to.equals("จีน")) {
            loadConversation.loadThaiToChina();
            loadThing.loadThaiToChina();
            loadEmergency.loadThaiToChina();
            loadLogistic.loadThaiToChina();
            loadPlace.loadThaiToChina();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);


        }
        if (lang_from.equals("Thai") && lang_to.equals("Thai") || lang_from.equals("ไทย") && lang_to.equals("ไทย")) {
            loadConversation.loadThaiToThai();
            loadThing.loadThaiToThai();
            loadEmergency.loadThaiToThai();
            loadLogistic.loadThaiToThai();
            loadPlace.loadThaiToThai();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Thai") && lang_to.equals("Cambodia") || lang_from.equals("ไทย") && lang_to.equals("กัมพูชา")) {
            loadConversation.loadThaiToCambodia();
            loadThing.loadThaiToCambodia();
            loadEmergency.loadThaiToCambodia();
            loadLogistic.loadThaiToCambodia();
            loadPlace.loadThaiToCambodia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }
        if (lang_from.equals("Thai") && lang_to.equals("Indonesia") || lang_from.equals("ไทย") && lang_to.equals("อินโดนีเซีย")) {
            loadConversation.loadThaiToIndonesia();
            loadThing.loadThaiToIndonesia();
            loadEmergency.loadThaiToIndonesia();
            loadLogistic.loadThaiToIndonesia();
            loadPlace.loadThaiToIndonesia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }
        if (lang_from.equals("Thai") && lang_to.equals("Laos") || lang_from.equals("ไทย") && lang_to.equals("ลาว")) {
            loadConversation.loadThaiToLaos();
            loadThing.loadThaiToLaos();
            loadEmergency.loadThaiToLaos();
            loadLogistic.loadThaiToLaos();
            loadPlace.loadThaiToLaos();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Thai") && lang_to.equals("Malaysia") || lang_from.equals("ไทย") && lang_to.equals("มาเลเซีย")) {
            loadConversation.loadThaiToMalaysia();
            loadThing.loadThaiToMalaysia();
            loadEmergency.loadThaiToMalaysia();
            loadLogistic.loadThaiToMalaysia();
            loadPlace.loadThaiToMalaysia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }
        if (lang_from.equals("Thai") && lang_to.equals("Myanmar") || lang_from.equals("ไทย") && lang_to.equals("พม่า")) {
            loadConversation.loadThaiToMyanmar();
            loadThing.loadThaiToMyanmar();
            loadEmergency.loadThaiToMyanmar();
            loadLogistic.loadThaiToMyanmar();
            loadPlace.loadThaiToMyanmar();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Thai") && lang_to.equals("Philippines") || lang_from.equals("ไทย") && lang_to.equals("ฟิลิปปินส์")) {
            loadConversation.loadThaiToPhilippines();
            loadThing.loadThaiToPhilippines();
            loadEmergency.loadThaiToPhilippines();
            loadLogistic.loadThaiToPhilippines();
            loadPlace.loadThaiToPhilippines();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Thai") && lang_to.equals("Singapore") || lang_from.equals("ไทย") && lang_to.equals("สิงคโปร์")) {
            loadConversation.loadThaiToSingapore();
            loadThing.loadThaiToSingapore();
            loadEmergency.loadThaiToSingapore();
            loadLogistic.loadThaiToSingapore();
            loadPlace.loadThaiToSingapore();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Thai") && lang_to.equals("Vietnam") || lang_from.equals("ไทย") && lang_to.equals("เวียดนาม")) {
            loadConversation.loadThaiToVietnam();
            loadThing.loadThaiToVietnam();
            loadEmergency.loadThaiToVietnam();
            loadLogistic.loadThaiToVietnam();
            loadPlace.loadThaiToVietnam();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Brunei") && lang_to.equals("China") || lang_from.equals("บรูไน") && lang_to.equals("จีน")) {
            loadConversation.loadBruneiToChina();
            loadThing.loadBruneiToChina();
            loadEmergency.loadBruneiToChina();
            loadLogistic.loadBruneiToChina();
            loadPlace.loadBruneiToChina();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Brunei") && lang_to.equals("Thai") || lang_from.equals("บรูไน") && lang_to.equals("ไทย")) {
            loadConversation.loadBruneiToThai();
            loadThing.loadBruneiToThai();
            loadEmergency.loadBruneiToThai();
            loadLogistic.loadBruneiToThai();
            loadPlace.loadBruneiToThai();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Brunei") && lang_to.equals("Brunei") || lang_from.equals("บรูไน") && lang_to.equals("บรูไน")) {
            loadConversation.loadBruneiToBrunei();
            loadThing.loadBruneiToBrunei();
            loadEmergency.loadBruneiToBrunei();
            loadLogistic.loadBruneiToBrunei();
            loadPlace.loadBruneiToBrunei();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Brunei") && lang_to.equals("Cambodia") || lang_from.equals("บรูไน") && lang_to.equals("กัมพูชา")) {
            loadConversation.loadBruneiToCambodia();
            loadThing.loadBruneiToCambodia();
            loadEmergency.loadBruneiToCambodia();
            loadLogistic.loadBruneiToCambodia();
            loadPlace.loadBruneiToCambodia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Brunei") && lang_to.equals("Indonesia") || lang_from.equals("บรูไน") && lang_to.equals("อินโดนีเซีย")) {
            loadConversation.loadBruneiToIndonesia();
            loadThing.loadBruneiToIndonesia();
            loadEmergency.loadBruneiToIndonesia();
            loadLogistic.loadBruneiToIndonesia();
            loadPlace.loadBruneiToIndonesia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Brunei") && lang_to.equals("Laos") || lang_from.equals("บรูไน") && lang_to.equals("ลาว")) {
            loadConversation.loadBruneiToLaos();
            loadThing.loadBruneiToLaos();
            loadEmergency.loadBruneiToLaos();
            loadLogistic.loadBruneiToLaos();
            loadPlace.loadBruneiToLaos();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }


        if (lang_from.equals("Brunei") && lang_to.equals("Malaysia") || lang_from.equals("บรูไน") && lang_to.equals("มาเลเซีย")) {
            loadConversation.loadBruneiToMalaysia();
            loadThing.loadBruneiToMalaysia();
            loadEmergency.loadBruneiToMalaysia();
            loadLogistic.loadBruneiToMalaysia();
            loadPlace.loadBruneiToMalaysia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Brunei") && lang_to.equals("Myanmar") || lang_from.equals("บรูไน") && lang_to.equals("พม่า")) {
            loadConversation.loadBruneiToMyanmar();
            loadThing.loadBruneiToMyanmar();
            loadEmergency.loadBruneiToMyanmar();
            loadLogistic.loadBruneiToMyanmar();
            loadPlace.loadBruneiToMyanmar();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Brunei") && lang_to.equals("Philippines") || lang_from.equals("บรูไน") && lang_to.equals("ฟิลิปปินส์")) {
            loadConversation.loadBruneiToPhilippines();
            loadThing.loadBruneiToPhilippines();
            loadEmergency.loadBruneiToPhilippines();
            loadLogistic.loadBruneiToPhilippines();
            loadPlace.loadBruneiToPhilippines();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Brunei") && lang_to.equals("Singapore") || lang_from.equals("บรูไน") && lang_to.equals("สิงคโปร์")) {
            loadConversation.loadBruneiToSingapore();
            loadThing.loadBruneiToSingapore();
            loadEmergency.loadBruneiToSingapore();
            loadLogistic.loadBruneiToSingapore();
            loadPlace.loadBruneiToSingapore();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Brunei") && lang_to.equals("Vietnam") || lang_from.equals("บรูไน") && lang_to.equals("เวียดนาม")) {
            loadConversation.loadBruneiToVietnam();
            loadThing.loadBruneiToVietnam();
            loadEmergency.loadBruneiToVietnam();
            loadLogistic.loadBruneiToVietnam();
            loadPlace.loadBruneiToVietnam();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Cambodia") && lang_to.equals("China") || lang_from.equals("กัมพูชา") && lang_to.equals("จีน")) {
            loadConversation.loadCambodiaToChina();
            loadThing.loadCambodiaToChina();
            loadEmergency.loadCambodiaToChina();
            loadLogistic.loadCambodiaToChina();
            loadPlace.loadCambodiaToChina();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Cambodia") && lang_to.equals("Thai") || lang_from.equals("กัมพูชา") && lang_to.equals("ไทย")) {
            loadConversation.loadCambodiaToThai();
            loadThing.loadCambodiaToThai();
            loadEmergency.loadCambodiaToThai();
            loadLogistic.loadCambodiaToThai();
            loadPlace.loadCambodiaToThai();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Cambodia") && lang_to.equals("Brunei") || lang_from.equals("กัมพูชา") && lang_to.equals("บรูไน")) {
            loadConversation.loadCambodiaToBrunei();
            loadThing.loadCambodiaToBrunei();
            loadEmergency.loadCambodiaToBrunei();
            loadLogistic.loadCambodiaToBrunei();
            loadPlace.loadCambodiaToBrunei();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Cambodia") && lang_to.equals("Cambodia") || lang_from.equals("กัมพูชา") && lang_to.equals("กัมพูชา")) {
            loadConversation.loadCambodiaToCambodia();
            loadThing.loadCambodiaToCambodia();
            loadEmergency.loadCambodiaToCambodia();
            loadLogistic.loadCambodiaToCambodia();
            loadPlace.loadCambodiaToCambodia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Cambodia") && lang_to.equals("Indonesia") || lang_from.equals("กัมพูชา") && lang_to.equals("อินโดนีเซีย")) {
            loadConversation.loadCambodiaToIndonesia();
            loadThing.loadCambodiaToIndonesia();
            loadEmergency.loadCambodiaToIndonesia();
            loadLogistic.loadCambodiaToIndonesia();
            loadPlace.loadCambodiaToIndonesia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }


        if (lang_from.equals("Cambodia") && lang_to.equals("Laos") || lang_from.equals("กัมพูชา") && lang_to.equals("ลาว")) {
            loadConversation.loadCambodiaToLaos();
            loadThing.loadCambodiaToLaos();
            loadEmergency.loadCambodiaToLaos();
            loadLogistic.loadCambodiaToLaos();
            loadPlace.loadCambodiaToLaos();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Cambodia") && lang_to.equals("Malaysia") || lang_from.equals("กัมพูชา") && lang_to.equals("มาเลเซีย")) {
            loadConversation.loadCambodiaToMalaysia();
            loadThing.loadCambodiaToMalaysia();
            loadEmergency.loadCambodiaToMalaysia();
            loadLogistic.loadCambodiaToMalaysia();
            loadPlace.loadCambodiaToMalaysia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Cambodia") && lang_to.equals("Myanmar") || lang_from.equals("กัมพูชา") && lang_to.equals("พม่า")) {
            loadConversation.loadCambodiaToMyanmar();
            loadThing.loadCambodiaToMyanmar();
            loadEmergency.loadCambodiaToMyanmar();
            loadLogistic.loadCambodiaToMyanmar();
            loadPlace.loadCambodiaToMyanmar();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }


        if (lang_from.equals("Cambodia") && lang_to.equals("Philippines") || lang_from.equals("กัมพูชา") && lang_to.equals("ฟิลิปปินส์")) {
            loadConversation.loadCambodiaToPhilippines();
            loadThing.loadCambodiaToPhilippines();
            loadEmergency.loadCambodiaToPhilippines();
            loadLogistic.loadCambodiaToPhilippines();
            loadPlace.loadCambodiaToPhilippines();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Cambodia") && lang_to.equals("Singapore") || lang_from.equals("กัมพูชา") && lang_to.equals("สิงคโปร์")) {
            loadConversation.loadCambodiaToSingapore();
            loadThing.loadCambodiaToSingapore();
            loadEmergency.loadCambodiaToSingapore();
            loadLogistic.loadCambodiaToSingapore();
            loadPlace.loadCambodiaToSingapore();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Cambodia") && lang_to.equals("Vietnam") || lang_from.equals("กัมพูชา") && lang_to.equals("เวียดนาม")) {
            loadConversation.loadCambodiaToVietnam();
            loadThing.loadCambodiaToVietnam();
            loadEmergency.loadCambodiaToVietnam();
            loadLogistic.loadCambodiaToVietnam();
            loadPlace.loadCambodiaToVietnam();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("China") || lang_from.equals("จีน") && lang_to.equals("จีน")) {
            loadConversation.loadChinaToChina();
            loadThing.loadChinaToChina();
            loadEmergency.loadChinaToChina();
            loadLogistic.loadChinaToChina();
            loadPlace.loadChinaToChina();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("Thai") || lang_from.equals("จีน") && lang_to.equals("ไทย")) {
            loadConversation.loadChinaToThai();
            loadThing.loadChinaToThai();
            loadEmergency.loadChinaToThai();
            loadLogistic.loadChinaToThai();
            loadPlace.loadChinaToThai();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("Brunei") || lang_from.equals("จีน") && lang_to.equals("บรูไน")) {
            loadConversation.loadChinaToBrunei();
            loadThing.loadChinaToBrunei();
            loadEmergency.loadChinaToBrunei();
            loadLogistic.loadChinaToBrunei();
            loadPlace.loadChinaToBrunei();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("Cambodia") || lang_from.equals("จีน") && lang_to.equals("กัมพูชา")) {
            loadConversation.loadChinaToCambodia();
            loadThing.loadChinaToCambodia();
            loadEmergency.loadChinaToCambodia();
            loadLogistic.loadChinaToCambodia();
            loadPlace.loadChinaToCambodia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("Indonesia") || lang_from.equals("จีน") && lang_to.equals("อินโดเซีย")) {
            loadConversation.loadChinaToIndonesia();
            loadThing.loadChinaToIndonesia();
            loadEmergency.loadChinaToIndonesia();
            loadLogistic.loadChinaToIndonesia();
            loadPlace.loadChinaToIndonesia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("Laos") || lang_from.equals("จีน") && lang_to.equals("ลาว")) {
            loadConversation.loadChinaToLaos();
            loadThing.loadChinaToLaos();
            loadEmergency.loadChinaToLaos();
            loadLogistic.loadChinaToLaos();
            loadPlace.loadChinaToLaos();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("Malaysia") || lang_from.equals("จีน") && lang_to.equals("มาเลเซีย")) {
            loadConversation.loadChinaToMalaysia();
            loadThing.loadChinaToMalaysia();
            loadEmergency.loadChinaToMalaysia();
            loadLogistic.loadChinaToMalaysia();
            loadPlace.loadChinaToMalaysia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("Myanmar") || lang_from.equals("จีน") && lang_to.equals("พม่า")) {
            loadConversation.loadChinaToMyanmar();
            loadThing.loadChinaToMyanmar();
            loadEmergency.loadChinaToMyanmar();
            loadLogistic.loadChinaToMyanmar();
            loadPlace.loadChinaToMyanmar();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("Philippines") || lang_from.equals("จีน") && lang_to.equals("ฟิลิปปินส์")) {
            loadConversation.loadChinaToPhilippines();
            loadThing.loadChinaToPhilippines();
            loadEmergency.loadChinaToPhilippines();
            loadLogistic.loadChinaToPhilippines();
            loadPlace.loadChinaToPhilippines();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("Singapore") || lang_from.equals("จีน") && lang_to.equals("สิงคโปร์")) {
            loadConversation.loadChinaToSingapore();
            loadThing.loadChinaToSingapore();
            loadEmergency.loadChinaToSingapore();
            loadLogistic.loadChinaToSingapore();
            loadPlace.loadChinaToSingapore();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("Vietnam") || lang_from.equals("จีน") && lang_to.equals("เวียดนาม")) {
            loadConversation.loadChinaToVietnam();
            loadThing.loadChinaToVietnam();
            loadEmergency.loadChinaToVietnam();
            loadLogistic.loadChinaToVietnam();
            loadPlace.loadChinaToVietnam();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Indonesia") && lang_to.equals("China") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("จีน")) {
            loadConversation.loadIndonesiaToChina();
            loadThing.loadIndonesiaToChina();
            loadEmergency.loadIndonesiaToChina();
            loadLogistic.loadIndonesiaToChina();
            loadPlace.loadIndonesiaToChina();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }



        if (lang_from.equals("Indonesia") && lang_to.equals("Thai") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("ไทย")) {
            loadConversation.loadIndonesiaToThai();
            loadThing.loadIndonesiaToThai();
            loadEmergency.loadIndonesiaToThai();
            loadLogistic.loadIndonesiaToThai();
            loadPlace.loadIndonesiaToThai();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Indonesia") && lang_to.equals("Brunei") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("บรูไน")) {
            loadConversation.loadIndonesiaToBrunei();
            loadThing.loadIndonesiaToBrunei();
            loadEmergency.loadIndonesiaToBrunei();
            loadLogistic.loadIndonesiaToBrunei();
            loadPlace.loadIndonesiaToBrunei();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Indonesia") && lang_to.equals("Cambodia") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("กัมพูชา")) {
            loadConversation.loadIndonesiaToCambodia();
            loadThing.loadIndonesiaToCambodia();
            loadEmergency.loadIndonesiaToCambodia();
            loadLogistic.loadIndonesiaToCambodia();
            loadPlace.loadIndonesiaToCambodia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Indonesia") && lang_to.equals("Indonesia") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("อินโดนีเซีย")) {
            loadConversation.loadIndonesiaToIndonesia();
            loadThing.loadIndonesiaToIndonesia();
            loadEmergency.loadIndonesiaToIndonesia();
            loadLogistic.loadIndonesiaToIndonesia();
            loadPlace.loadIndonesiaToIndonesia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Indonesia") && lang_to.equals("Laos") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("ลาว")) {
            loadConversation.loadIndonesiaToLaos();
            loadThing.loadIndonesiaToLaos();
            loadEmergency.loadIndonesiaToLaos();
            loadLogistic.loadIndonesiaToLaos();
            loadPlace.loadIndonesiaToLaos();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Indonesia") && lang_to.equals("Malaysia") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("มาเลเซีย")) {
            loadConversation.loadIndonesiaToMalaysia();
            loadThing.loadIndonesiaToMalaysia();
            loadEmergency.loadIndonesiaToMalaysia();
            loadLogistic.loadIndonesiaToMalaysia();
            loadPlace.loadIndonesiaToMalaysia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Indonesia") && lang_to.equals("Myanmar") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("พม่า")) {
            loadConversation.loadIndonesiaToMyanmar();
            loadThing.loadIndonesiaToMyanmar();
            loadEmergency.loadIndonesiaToMyanmar();
            loadLogistic.loadIndonesiaToMyanmar();
            loadPlace.loadIndonesiaToMyanmar();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Indonesia") && lang_to.equals("Philippines") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("ฟิลิปปินส์")) {
            loadConversation.loadIndonesiaToPhilippines();
            loadThing.loadIndonesiaToPhilippines();
            loadEmergency.loadIndonesiaToPhilippines();
            loadLogistic.loadIndonesiaToPhilippines();
            loadPlace.loadIndonesiaToPhilippines();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Indonesia") && lang_to.equals("Singapore") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("สิงคโปร")) {
            loadConversation.loadIndonesiaToSingapore();
            loadThing.loadIndonesiaToSingapore();
            loadEmergency.loadIndonesiaToSingapore();
            loadLogistic.loadIndonesiaToSingapore();
            loadPlace.loadIndonesiaToSingapore();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Indonesia") && lang_to.equals("Vietnam") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("เวียดนาม")) {
            loadConversation.loadIndonesiaToVietnam();
            loadThing.loadIndonesiaToVietnam();
            loadEmergency.loadIndonesiaToVietnam();
            loadLogistic.loadIndonesiaToVietnam();
            loadPlace.loadIndonesiaToVietnam();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Laos") && lang_to.equals("China") || lang_from.equals("ลาว") && lang_to.equals("จีน")) {
            loadConversation.loadLaosToChina();
            loadThing.loadLaosToChina();
            loadEmergency.loadLaosToChina();
            loadLogistic.loadLaosToChina();
            loadPlace.loadLaosToChina();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Laos") && lang_to.equals("Thai") || lang_from.equals("ลาว") && lang_to.equals("ไทย")) {
            loadConversation.loadLaosToThai();
            loadThing.loadLaosToThai();
            loadEmergency.loadLaosToThai();
            loadLogistic.loadLaosToThai();
            loadPlace.loadLaosToThai();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Laos") && lang_to.equals("Brunei") || lang_from.equals("ลาว") && lang_to.equals("บรูไน")) {
            loadConversation.loadLaosToBrunei();
            loadThing.loadLaosToBrunei();
            loadEmergency.loadLaosToBrunei();
            loadLogistic.loadLaosToBrunei();
            loadPlace.loadLaosToBrunei();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Laos") && lang_to.equals("Cambodia") || lang_from.equals("ลาว") && lang_to.equals("กัมพูชา")) {
            loadConversation.loadLaosToCambodia();
            loadThing.loadLaosToCambodia();
            loadEmergency.loadLaosToCambodia();
            loadLogistic.loadLaosToCambodia();
            loadPlace.loadLaosToCambodia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Laos") && lang_to.equals("Indonesia") || lang_from.equals("ลาว") && lang_to.equals("อินโดนีเซีย")) {
            loadConversation.loadLaosToIndonesia();
            loadThing.loadLaosToIndonesia();
            loadEmergency.loadLaosToIndonesia();
            loadLogistic.loadLaosToIndonesia();
            loadPlace.loadLaosToIndonesia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Laos") && lang_to.equals("Laos") || lang_from.equals("ลาว") && lang_to.equals("ลาว")) {
            loadConversation.loadLaosToLaos();
            loadThing.loadLaosToLaos();
            loadEmergency.loadLaosToLaos();
            loadLogistic.loadLaosToLaos();
            loadPlace.loadLaosToLaos();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Laos") && lang_to.equals("Malaysia") || lang_from.equals("ลาว") && lang_to.equals("มาเลเซีย")) {
            loadConversation.loadLaosToMalaysia();
            loadThing.loadLaosToMalaysia();
            loadEmergency.loadLaosToMalaysia();
            loadLogistic.loadLaosToMalaysia();
            loadPlace.loadLaosToMalaysia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Laos") && lang_to.equals("Myanmar") || lang_from.equals("ลาว") && lang_to.equals("พม่า")) {
            loadConversation.loadLaosToMyanmar();
            loadThing.loadLaosToMyanmar();
            loadEmergency.loadLaosToMyanmar();
            loadLogistic.loadLaosToMyanmar();
            loadPlace.loadLaosToMyanmar();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }


        if (lang_from.equals("Laos") && lang_to.equals("Philippines") || lang_from.equals("ลาว") && lang_to.equals("ฟิลิปปินส์")) {
            loadConversation.loadLaosToPhilippines();
            loadThing.loadLaosToPhilippines();
            loadEmergency.loadLaosToPhilippines();
            loadLogistic.loadLaosToPhilippines();
            loadPlace.loadLaosToPhilippines();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Laos") && lang_to.equals("Singapore") || lang_from.equals("ลาว") && lang_to.equals("สิงคโปร์")) {
            loadConversation.loadLaosToSingapore();
            loadThing.loadLaosToSingapore();
            loadEmergency.loadLaosToSingapore();
            loadLogistic.loadLaosToSingapore();
            loadPlace.loadLaosToSingapore();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Laos") && lang_to.equals("Vietnam") || lang_from.equals("ลาว") && lang_to.equals("เวียดนาม")) {
            loadConversation.loadLaosToVietnam();
            loadThing.loadLaosToVietnam();
            loadEmergency.loadLaosToVietnam();
            loadLogistic.loadLaosToVietnam();
            loadPlace.loadLaosToVietnam();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("China") || lang_from.equals("มาเลเซีย") && lang_to.equals("จีน")) {
            loadConversation.loadMalaysiaToChina();
            loadThing.loadMalaysiaToChina();
            loadEmergency.loadMalaysiaToChina();
            loadLogistic.loadMalaysiaToChina();
            loadPlace.loadMalaysiaToChina();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("Thai") || lang_from.equals("มาเลเซีย") && lang_to.equals("ไทย")) {
            loadConversation.loadMalaysiaToThai();
            loadThing.loadMalaysiaToThai();
            loadEmergency.loadMalaysiaToThai();
            loadLogistic.loadMalaysiaToThai();
            loadPlace.loadMalaysiaToThai();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("Brunei") || lang_from.equals("มาเลเซีย") && lang_to.equals("บรูไน")) {
            loadConversation.loadMalaysiaToBrunei();
            loadThing.loadMalaysiaToBrunei();
            loadEmergency.loadMalaysiaToBrunei();
            loadLogistic.loadMalaysiaToBrunei();
            loadPlace.loadMalaysiaToBrunei();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("Cambodia") || lang_from.equals("มาเลเซีย") && lang_to.equals("กัมพูชา")) {
            loadConversation.loadMalaysiaToCambodia();
            loadThing.loadMalaysiaToCambodia();
            loadEmergency.loadMalaysiaToCambodia();
            loadLogistic.loadMalaysiaToCambodia();
            loadPlace.loadMalaysiaToCambodia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("Indonesia") || lang_from.equals("มาเลเซีย") && lang_to.equals("อินโดนีเซีย")) {
            loadConversation.loadMalaysiaToIndonesia();
            loadThing.loadMalaysiaToIndonesia();
            loadEmergency.loadMalaysiaToIndonesia();
            loadLogistic.loadMalaysiaToIndonesia();
            loadPlace.loadMalaysiaToIndonesia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("Laos") || lang_from.equals("มาเลเซีย") && lang_to.equals("ลาว")) {
            loadConversation.loadMalaysiaToLaos();
            loadThing.loadMalaysiaToLaos();
            loadEmergency.loadMalaysiaToLaos();
            loadLogistic.loadMalaysiaToLaos();
            loadPlace.loadMalaysiaToLaos();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("Malaysia") || lang_from.equals("มาเลเซีย") && lang_to.equals("มาเลเซีย")) {
            loadConversation.loadMalaysiaToMalaysia();
            loadThing.loadMalaysiaToMalaysia();
            loadEmergency.loadMalaysiaToMalaysia();
            loadLogistic.loadMalaysiaToMalaysia();
            loadPlace.loadMalaysiaToMalaysia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("Myanmar") || lang_from.equals("มาเลเซีย") && lang_to.equals("พม่า")) {
            loadConversation.loadMalaysiaToMyanmar();
            loadThing.loadMalaysiaToMyanmar();
            loadEmergency.loadMalaysiaToMyanmar();
            loadLogistic.loadMalaysiaToMyanmar();
            loadPlace.loadMalaysiaToMyanmar();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("Philippines") || lang_from.equals("มาเลเซีย") && lang_to.equals("ฟิลิปปินส์")) {
            loadConversation.loadMalaysiaToPhilippines();
            loadThing.loadMalaysiaToPhilippines();
            loadEmergency.loadMalaysiaToPhilippines();
            loadLogistic.loadMalaysiaToPhilippines();
            loadPlace.loadMalaysiaToPhilippines();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("Singapore") || lang_from.equals("มาเลเซีย") && lang_to.equals("สิงคโปร์")) {
            loadConversation.loadMalaysiaToSingapore();
            loadThing.loadMalaysiaToSingapore();
            loadEmergency.loadMalaysiaToSingapore();
            loadLogistic.loadMalaysiaToSingapore();
            loadPlace.loadMalaysiaToSingapore();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("Vietnam") || lang_from.equals("มาเลเซีย") && lang_to.equals("เวียดนาม")) {
            loadConversation.loadMalaysiaToVietnam();
            loadThing.loadMalaysiaToVietnam();
            loadEmergency.loadMalaysiaToVietnam();
            loadLogistic.loadMalaysiaToVietnam();
            loadPlace.loadMalaysiaToVietnam();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Myanmar") && lang_to.equals("China") || lang_from.equals("พม่า") && lang_to.equals("จีน")) {
            loadConversation.loadMyanmarToChina();
            loadThing.loadMyanmarToChina();
            loadEmergency.loadMyanmarToChina();
            loadLogistic.loadMyanmarToChina();
            loadPlace.loadMyanmarToChina();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Myanmar") && lang_to.equals("Thai") || lang_from.equals("พม่า") && lang_to.equals("ไทย")) {
            loadConversation.loadMyanmarToThai();
            loadThing.loadMyanmarToThai();
            loadEmergency.loadMyanmarToThai();
            loadLogistic.loadMyanmarToThai();
            loadPlace.loadMyanmarToThai();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Myanmar") && lang_to.equals("Brunei") || lang_from.equals("พม่า") && lang_to.equals("บรูไน")) {
            loadConversation.loadMyanmarToBrunei();
            loadThing.loadMyanmarToBrunei();
            loadEmergency.loadMyanmarToBrunei();
            loadLogistic.loadMyanmarToBrunei();
            loadPlace.loadMyanmarToBrunei();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }


        if (lang_from.equals("Myanmar") && lang_to.equals("Cambodia") || lang_from.equals("พม่า") && lang_to.equals("กัมพูชา")) {
            loadConversation.loadMyanmarToCambodia();
            loadThing.loadMyanmarToCambodia();
            loadEmergency.loadMyanmarToCambodia();
            loadLogistic.loadMyanmarToCambodia();
            loadPlace.loadMyanmarToCambodia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }


        if (lang_from.equals("Myanmar") && lang_to.equals("Indonesia") || lang_from.equals("พม่า") && lang_to.equals("อินโดนีเซีย")) {
            loadConversation.loadMyanmarToIndonesia();
            loadThing.loadMyanmarToIndonesia();
            loadEmergency.loadMyanmarToIndonesia();
            loadLogistic.loadMyanmarToIndonesia();
            loadPlace.loadMyanmarToIndonesia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Myanmar") && lang_to.equals("Laos") || lang_from.equals("พม่า") && lang_to.equals("ลาว")) {
            loadConversation.loadMyanmarToLaos();
            loadThing.loadMyanmarToLaos();
            loadEmergency.loadMyanmarToLaos();
            loadLogistic.loadMyanmarToLaos();
            loadPlace.loadMyanmarToLaos();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Myanmar") && lang_to.equals("Malaysia") || lang_from.equals("พม่า") && lang_to.equals("มาเลเซีย")) {
            loadConversation.loadMyanmarToMalaysia();
            loadThing.loadMyanmarToMalaysia();
            loadEmergency.loadMyanmarToMalaysia();
            loadLogistic.loadMyanmarToMalaysia();
            loadPlace.loadMyanmarToMalaysia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Myanmar") && lang_to.equals("Myanmar") || lang_from.equals("พม่า") && lang_to.equals("พม่า")) {
            loadConversation.loadMyanmarToMyanmar();
            loadThing.loadMyanmarToMyanmar();
            loadEmergency.loadMyanmarToMyanmar();
            loadLogistic.loadMyanmarToMyanmar();
            loadPlace.loadMyanmarToMyanmar();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Myanmar") && lang_to.equals("Philippines") || lang_from.equals("พม่า") && lang_to.equals("ฟิลิปปินส์")) {
            loadConversation.loadMyanmarToPhilippines();
            loadThing.loadMyanmarToPhilippines();
            loadEmergency.loadMyanmarToPhilippines();
            loadLogistic.loadMyanmarToPhilippines();
            loadPlace.loadMyanmarToPhilippines();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }


        if (lang_from.equals("Myanmar") && lang_to.equals("Singapore") || lang_from.equals("พม่า") && lang_to.equals("สิงคโปร์")) {
            loadConversation.loadMyanmarToSingapore();
            loadThing.loadMyanmarToSingapore();
            loadEmergency.loadMyanmarToSingapore();
            loadLogistic.loadMyanmarToSingapore();
            loadPlace.loadMyanmarToSingapore();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Myanmar") && lang_to.equals("Vietnam") || lang_from.equals("พม่า") && lang_to.equals("เวียดนาม")) {
            loadConversation.loadMyanmarToVietnam();
            loadThing.loadMyanmarToVietnam();
            loadEmergency.loadMyanmarToVietnam();
            loadLogistic.loadMyanmarToVietnam();
            loadPlace.loadMyanmarToVietnam();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("China") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("จีน")) {
            loadConversation.loadPhilippinesToChina();
            loadThing.loadPhilippinesToChina();
            loadEmergency.loadPhilippinesToChina();
            loadLogistic.loadPhilippinesToChina();
            loadPlace.loadPhilippinesToChina();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("Thai") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("ไทย")) {
            loadConversation.loadPhilippinesToThai();
            loadThing.loadPhilippinesToThai();
            loadEmergency.loadPhilippinesToThai();
            loadLogistic.loadPhilippinesToThai();
            loadPlace.loadPhilippinesToThai();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("Brunei") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("บรูไน")) {
            loadConversation.loadPhilippinesToBrunei();
            loadThing.loadPhilippinesToBrunei();
            loadEmergency.loadPhilippinesToBrunei();
            loadLogistic.loadPhilippinesToBrunei();
            loadPlace.loadPhilippinesToBrunei();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("Cambodia") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("กัมพูชา")) {
            loadConversation.loadPhilippinesToCambodia();
            loadThing.loadPhilippinesToCambodia();
            loadEmergency.loadPhilippinesToCambodia();
            loadLogistic.loadPhilippinesToCambodia();
            loadPlace.loadPhilippinesToCambodia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("Indonesia") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("อินโดนีเซีย")) {
            loadConversation.loadPhilippinesToIndonesia();
            loadThing.loadPhilippinesToIndonesia();
            loadEmergency.loadPhilippinesToIndonesia();
            loadLogistic.loadPhilippinesToIndonesia();
            loadPlace.loadPhilippinesToIndonesia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("Laos") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("ลาว")) {
            loadConversation.loadPhilippinesToLaos();
            loadThing.loadPhilippinesToLaos();
            loadEmergency.loadPhilippinesToLaos();
            loadLogistic.loadPhilippinesToLaos();
            loadPlace.loadPhilippinesToLaos();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("Malaysia") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("มาเลเซีย")) {
            loadConversation.loadPhilippinesToMalaysia();
            loadThing.loadPhilippinesToMalaysia();
            loadEmergency.loadPhilippinesToMalaysia();
            loadLogistic.loadPhilippinesToMalaysia();
            loadPlace.loadPhilippinesToMalaysia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("Myanmar") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("พม่า")) {
            loadConversation.loadPhilippinesToMyanmar();
            loadThing.loadPhilippinesToMyanmar();
            loadEmergency.loadPhilippinesToMyanmar();
            loadLogistic.loadPhilippinesToMyanmar();
            loadPlace.loadPhilippinesToMyanmar();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("Philippines") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("ฟิลิปปินส์")) {
            loadConversation.loadPhilippinesToPhilippines();
            loadThing.loadPhilippinesToPhilippines();
            loadEmergency.loadPhilippinesToPhilippines();
            loadLogistic.loadPhilippinesToPhilippines();
            loadPlace.loadPhilippinesToPhilippines();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("Singapore") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("สิงคโปร์")) {
            loadConversation.loadPhilippinesToSingapore();
            loadThing.loadPhilippinesToSingapore();
            loadEmergency.loadPhilippinesToSingapore();
            loadLogistic.loadPhilippinesToSingapore();
            loadPlace.loadPhilippinesToSingapore();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("Vietnam") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("เวียดนาม")) {
            loadConversation.loadPhilippinesToVietnam();
            loadThing.loadPhilippinesToVietnam();
            loadEmergency.loadPhilippinesToVietnam();
            loadLogistic.loadPhilippinesToVietnam();
            loadPlace.loadPhilippinesToVietnam();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Singapore") && lang_to.equals("China") || lang_from.equals("สิงคโปร์") && lang_to.equals("จีน")) {
            loadConversation.loadSingaporeToChina();
            loadThing.loadSingaporeToChina();
            loadEmergency.loadSingaporeToChina();
            loadLogistic.loadSingaporeToChina();
            loadPlace.loadSingaporeToChina();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }


        if (lang_from.equals("Singapore") && lang_to.equals("Thai") || lang_from.equals("สิงคโปร์") && lang_to.equals("ไทย")) {
            loadConversation.loadSingaporeToThai();
            loadThing.loadSingaporeToThai();
            loadEmergency.loadSingaporeToThai();
            loadLogistic.loadSingaporeToThai();
            loadPlace.loadSingaporeToThai();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }


        if (lang_from.equals("Singapore") && lang_to.equals("Brunei") || lang_from.equals("สิงคโปร์") && lang_to.equals("บรูไน")) {
            loadConversation.loadSingaporeToBrunei();
            loadThing.loadSingaporeToBrunei();
            loadEmergency.loadSingaporeToBrunei();
            loadLogistic.loadSingaporeToBrunei();
            loadPlace.loadSingaporeToBrunei();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Singapore") && lang_to.equals("Cambodia") || lang_from.equals("สิงคโปร์") && lang_to.equals("กัมพูชา")) {
            loadConversation.loadSingaporeToCambodia();
            loadThing.loadSingaporeToCambodia();
            loadEmergency.loadSingaporeToCambodia();
            loadLogistic.loadSingaporeToCambodia();
            loadPlace.loadSingaporeToCambodia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Singapore") && lang_to.equals("Indonesia") || lang_from.equals("สิงคโปร์") && lang_to.equals("อินโดนีเซีย")) {
            loadConversation.loadSingaporeToIndonesia();
            loadThing.loadSingaporeToIndonesia();
            loadEmergency.loadSingaporeToIndonesia();
            loadLogistic.loadSingaporeToIndonesia();
            loadPlace.loadSingaporeToIndonesia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Singapore") && lang_to.equals("Laos") || lang_from.equals("สิงคโปร์") && lang_to.equals("ลาว")) {
            loadConversation.loadSingaporeToLaos();
            loadThing.loadSingaporeToLaos();
            loadEmergency.loadSingaporeToLaos();
            loadLogistic.loadSingaporeToLaos();
            loadPlace.loadSingaporeToLaos();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Singapore") && lang_to.equals("Malaysia") || lang_from.equals("สิงคโปร์") && lang_to.equals("มาเลเซีย")) {
            loadConversation.loadSingaporeToMalaysia();
            loadThing.loadSingaporeToMalaysia();
            loadEmergency.loadSingaporeToMalaysia();
            loadLogistic.loadSingaporeToMalaysia();
            loadPlace.loadSingaporeToMalaysia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Singapore") && lang_to.equals("Myanmar") || lang_from.equals("สิงคโปร์") && lang_to.equals("พม่า")) {
            loadConversation.loadSingaporeToMyanmar();
            loadThing.loadSingaporeToMyanmar();
            loadEmergency.loadSingaporeToMyanmar();
            loadLogistic.loadSingaporeToMyanmar();
            loadPlace.loadSingaporeToMyanmar();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Singapore") && lang_to.equals("Philippines") || lang_from.equals("สิงคโปร์") && lang_to.equals("ฟิลิปปินส์")) {
            loadConversation.loadSingaporeToPhilippines();
            loadThing.loadSingaporeToPhilippines();
            loadEmergency.loadSingaporeToPhilippines();
            loadLogistic.loadSingaporeToPhilippines();
            loadPlace.loadSingaporeToPhilippines();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Singapore") && lang_to.equals("Singapore") || lang_from.equals("สิงคโปร์") && lang_to.equals("สิงคโปร์")) {
            loadConversation.loadSingaporeToSingapore();
            loadThing.loadSingaporeToSingapore();
            loadEmergency.loadSingaporeToSingapore();
            loadLogistic.loadSingaporeToSingapore();
            loadPlace.loadSingaporeToSingapore();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);

        }

        if (lang_from.equals("Singapore") && lang_to.equals("Vietnam") || lang_from.equals("สิงคโปร์") && lang_to.equals("เวียดนาม")) {
            loadConversation.loadSingaporeToVietnam();
            loadThing.loadSingaporeToVietnam();
            loadEmergency.loadSingaporeToVietnam();
            loadLogistic.loadSingaporeToVietnam();
            loadPlace.loadSingaporeToVietnam();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Vietnam") && lang_to.equals("China") || lang_from.equals("เวียดนาม") && lang_to.equals("จีน")) {
            loadConversation.loadVietnamToChina();
            loadThing.loadVietnamToChina();
            loadEmergency.loadVietnamToChina();
            loadLogistic.loadVietnamToChina();
            loadPlace.loadVietnamToChina();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Vietnam") && lang_to.equals("Thai") || lang_from.equals("เวียดนาม") && lang_to.equals("ไทย")) {
            loadConversation.loadVietnamToThai();
            loadThing.loadVietnamToThai();
            loadEmergency.loadVietnamToThai();
            loadLogistic.loadVietnamToThai();
            loadPlace.loadVietnamToThai();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Vietnam") && lang_to.equals("Brunei") || lang_from.equals("เวียดนาม") && lang_to.equals("บรูไน")) {
            loadConversation.loadVietnamToBrunei();
            loadThing.loadVietnamToBrunei();
            loadEmergency.loadVietnamToBrunei();
            loadLogistic.loadVietnamToBrunei();
            loadPlace.loadVietnamToBrunei();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Vietnam") && lang_to.equals("Cambodia") || lang_from.equals("เวียดนาม") && lang_to.equals("กัมพูชา")) {
            loadConversation.loadVietnamToCambodia();
            loadThing.loadVietnamToCambodia();
            loadEmergency.loadVietnamToCambodia();
            loadLogistic.loadVietnamToCambodia();
            loadPlace.loadVietnamToCambodia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Vietnam") && lang_to.equals("Indonesia") || lang_from.equals("เวียดนาม") && lang_to.equals("อินโดนีเซีย")) {
            loadConversation.loadVietnamToIndonesia();
            loadThing.loadVietnamToIndonesia();
            loadEmergency.loadVietnamToIndonesia();
            loadLogistic.loadVietnamToIndonesia();
            loadPlace.loadVietnamToIndonesia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }


        if (lang_from.equals("Vietnam") && lang_to.equals("Laos") || lang_from.equals("เวียดนาม") && lang_to.equals("ลาว")) {
            loadConversation.loadVietnamToLaos();
            loadThing.loadVietnamToLaos();
            loadEmergency.loadVietnamToLaos();
            loadLogistic.loadVietnamToLaos();
            loadPlace.loadVietnamToLaos();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Vietnam") && lang_to.equals("Malaysia") || lang_from.equals("เวียดนาม") && lang_to.equals("มาเลเซีย")) {
            loadConversation.loadVietnamToMalaysia();
            loadThing.loadVietnamToMalaysia();
            loadEmergency.loadVietnamToMalaysia();
            loadLogistic.loadVietnamToMalaysia();
            loadPlace.loadVietnamToMalaysia();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Vietnam") && lang_to.equals("Myanmar") || lang_from.equals("เวียดนาม") && lang_to.equals("พม่า")) {
            loadConversation.loadVietnamToMyanmar();
            loadThing.loadVietnamToMyanmar();
            loadEmergency.loadVietnamToMyanmar();
            loadLogistic.loadVietnamToMyanmar();
            loadPlace.loadVietnamToMyanmar();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Vietnam") && lang_to.equals("Philippines") || lang_from.equals("เวียดนาม") && lang_to.equals("ฟิลิปปินส์")) {
            loadConversation.loadVietnamToPhilippines();
            loadThing.loadVietnamToPhilippines();
            loadEmergency.loadVietnamToPhilippines();
            loadLogistic.loadVietnamToPhilippines();
            loadPlace.loadVietnamToPhilippines();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Vietnam") && lang_to.equals("Singapore") || lang_from.equals("เวียดนาม") && lang_to.equals("สิงคโปร์")) {
            loadConversation.loadVietnamToSingapore();
            loadThing.loadVietnamToSingapore();
            loadEmergency.loadVietnamToSingapore();
            loadLogistic.loadVietnamToSingapore();
            loadPlace.loadVietnamToSingapore();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Vietnam") && lang_to.equals("Vietnam") || lang_from.equals("เวียดนาม") && lang_to.equals("เวียดนาม")) {
            loadConversation.loadVietnamToVietnam();
            loadThing.loadVietnamToVietnam();
            loadEmergency.loadVietnamToVietnam();
            loadLogistic.loadVietnamToVietnam();
            loadPlace.loadVietnamToVietnam();
            ArrayList<GroupHeader> list= new ArrayList<GroupHeader>();
            list.addAll(loadConversation.getGroupHeaderList());
            list.addAll(loadThing.getGroupHeaderList());
            list.addAll(loadEmergency.getGroupHeaderList());
            list.addAll(loadLogistic.getGroupHeaderList());
            list.addAll(loadPlace.getGroupHeaderList());
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, list,lang_from,lang_to);
            myList.setAdapter(listAdapter);
        }







    }
    private void initSearch(){
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        search = (SearchView)findViewById(R.id.searchText);
        search.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        search.setIconifiedByDefault(false);
        search.setOnQueryTextListener(this);
        search.setOnCloseListener((SearchView.OnCloseListener) this);
    }


    public boolean onClose() {
        listAdapter.filterData("");

        return false;
    }

    @Override
    public boolean onQueryTextChange(String query) {
        listAdapter.filterData(query);

        return false;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        listAdapter.filterData(query);

        return false;
    }




















    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_main_actions, menu);



        return super.onCreateOptionsMenu(menu);
        //return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_settings:
                Intent i;
                i = new Intent(getApplicationContext(), SettingActivity.class);
                startActivity(i);
                finish();
                return true;
            //break;
            case R.id.action_search:
                // search action
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
