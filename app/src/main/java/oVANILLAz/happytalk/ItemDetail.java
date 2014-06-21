package oVANILLAz.happytalk;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by oVANILLAz on 6/6/14 AD.
 */
public class ItemDetail implements Serializable {
    private long id;
    private int imgSound;
    private int imgFavorite ;
    private String wordEN;
    private String wordTH;
    private String wordFrom;
    private String karaokeTH;
    private String karaokeEN;
    private String wordTo ;
    public ArrayList<Category> catList ;

    public ItemDetail(long id, int imgSound, int imgFavorite, String wordEN, String wordTH, String wordFrom, String karaokeTH, String karaokeEN) {
        this.id = id;
        this.imgSound = imgSound;
        this.imgFavorite = imgFavorite;
        this.wordEN = wordEN;
        this.wordTH = wordTH;
        this.wordFrom = wordFrom;
        this.karaokeTH = karaokeTH;
        this.karaokeEN = karaokeEN;
    }

    public ItemDetail(int imgSound, int imgFavorite, String wordEN, String wordTH, String wordFrom, String karaokeTH, String karaokeEN) {
        this.imgSound = imgSound;
        this.imgFavorite = imgFavorite;
        this.wordEN = wordEN;
        this.wordTH = wordTH;
        this.wordFrom = wordFrom;
        this.karaokeTH = karaokeTH;
        this.karaokeEN = karaokeEN;
    }

    public String getWordTo() {
        return wordTo;
    }

    public void setWordTo(String wordTo) {
        this.wordTo = wordTo;
    }

    public ArrayList<Category> getCatList() {
        return catList;
    }

    public void setCatList(ArrayList<Category> catList){
        this.catList = catList;
    }

    //ArrayList to store child obj
    public ArrayList<Category> getCategory(){
        return catList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getImgSound() {
        return imgSound;
    }

    public void setImgSound(int imgSound) {
        this.imgSound = imgSound;
    }

    public int getImgFavorite() {
        return imgFavorite;
    }

    public void setImgFavorite(int imgFavorite) {
        this.imgFavorite = imgFavorite;
    }

    public String getWordEN() {
        return wordEN;
    }

    public void setWordEN(String wordEN) {
        this.wordEN = wordEN;
    }

    public String getWordTH() {
        return wordTH;
    }

    public void setWordTH(String wordTH) {
        this.wordTH = wordTH;
    }

    public String getWordFrom() {
        return wordFrom;
    }

    public void setWordFrom(String wordFrom) {
        this.wordFrom = wordFrom;
    }

    public String getKaraokeTH() {
        return karaokeTH;
    }

    public void setKaraokeTH(String karaokeTH) {
        this.karaokeTH = karaokeTH;
    }

    public String getKaraokeEN() {
        return karaokeEN;
    }

    public void setKaraokeEN(String karaokeEN) {
        this.karaokeEN = karaokeEN;
    }
}
