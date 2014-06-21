package oVANILLAz.happytalk;

import android.widget.ImageView;

/**
 * Created by oVANILLAz on 6/8/14 AD.
 */
public class Child {

    private String wordFrom = " ";
    private String wordEN =" ";
    private String wordTo =" ";
    private String karaokeTH = " ";
    private String karaokeEN = " ";
    private ImageView sound ;
    private ImageView favorite;
    private int soundPath = -1;

    public String getKaraokeEN() {
        return karaokeEN;
    }

    public void setKaraokeEN(String karaokeEN) {
        this.karaokeEN = karaokeEN;
    }

    public String getKaraokeTH() {
        return karaokeTH;
    }

    public void setKaraokeTH(String karaokeTH) {
        this.karaokeTH = karaokeTH;
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

    public String getWordTo() {
        return wordTo;
    }

    public void setWordTo(String wordTo) {
        this.wordTo = wordTo;
    }

    public ImageView getSound() {
        return sound;
    }

    public void setSound(ImageView sound) {
        this.sound = sound;
    }

    public ImageView getFavorite() {
        return favorite;
    }

    public void setFavorite(ImageView favorite) {
        this.favorite = favorite;
    }

    public int getSoundPath(){return this.soundPath;}
    public void setSoundPath(int soundPath){this.soundPath = soundPath;}

    public Child(String karaokeEN, String karaokeTH, String wordFrom, String wordEN, String wordTo, ImageView sound, ImageView favorite) {
        super();
        this.karaokeEN = karaokeEN;
        this.karaokeTH = karaokeTH;
        this.wordFrom = wordFrom;
        this.wordEN = wordEN;
        this.wordTo = wordTo;
        this.sound = sound;
        this.favorite = favorite;
       // this.soundPath = soundPath;
    }
}
