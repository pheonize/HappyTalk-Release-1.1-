package oVANILLAz.happytalk;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by oVANILLAz on 6/6/14 AD.
 */
public class Category implements Serializable {
    private long id;
    private String wordFrom , wordEN;
    public List<ItemDetail> itemList = new ArrayList<ItemDetail>();

    public Category(long id, String wordFrom, String wordEN) {
        this.id = id;
        this.wordFrom = wordFrom;
        this.wordEN = wordEN;
    }

    public Category(String wordFrom, String wordEN) {
        this.wordFrom = wordFrom;
        this.wordEN = wordEN;
    }

    public List<ItemDetail> getItemList() {
        return itemList;
    }

    public void setItemList(List<ItemDetail> itemList) {
        this.itemList = itemList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
}
