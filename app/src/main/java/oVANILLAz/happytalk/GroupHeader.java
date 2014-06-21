package oVANILLAz.happytalk;

import java.util.ArrayList;

/**
 * Created by oVANILLAz on 6/9/14 AD.
 */
public class GroupHeader {

    private String wordFrom;
    private String wordEN;

    private ArrayList<Child> childList = new ArrayList<Child>();



    public String getWordFrom() {
        return wordFrom;
    }

    public void setWordFrom(String wordFrom) {
        this.wordFrom = wordFrom;
    }

    public String getWordEN() {
        return wordEN;
    }

    public void setWordEN(String wordEN) {
        this.wordEN = wordEN;
    }

    public ArrayList<Child> getChildList() {
        return childList;
    }

    public void setChildList(ArrayList<Child> childList) {
        this.childList = childList;
    }

    public GroupHeader(String wordFrom,String wordEN, ArrayList<Child> childList) {
        super();

        this.wordFrom = wordFrom;
        this.wordEN = wordEN;
        this.childList = childList;
    }
}
