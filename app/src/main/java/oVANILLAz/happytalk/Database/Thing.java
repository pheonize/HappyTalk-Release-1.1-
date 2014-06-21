package oVANILLAz.happytalk.Database;

/**
 * Created by oVANILLAz on 5/29/14 AD.
 */
public class Thing {
    int id;
    String langFrom;
    String langTo;
    String wordFrom;
    String wordTo;
    String karaokeTH;
    String karaokeEN;
    String sound;
    String wordEN;

    public Thing(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLangFrom() {
        return langFrom;
    }

    public void setLangFrom(String langFrom) {
        this.langFrom = langFrom;
    }

    public String getLangTo() {
        return langTo;
    }

    public void setLangTo(String langTo) {
        this.langTo = langTo;
    }

    public String getWordFrom() {
        return wordFrom;
    }

    public void setWordFrom(String wordFrom) {
        this.wordFrom = wordFrom;
    }

    public String getWordTo() {
        return wordTo;
    }

    public void setWordTo(String wordTo) {
        this.wordTo = wordTo;
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

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getWordEN() {
        return wordEN;
    }

    public void setWordEN(String wordEN) {
        this.wordEN = wordEN;
    }

    public Thing(String langFrom, String langTo, String wordFrom, String wordTo, String karaokeTH, String karaokeEN, String sound, String wordEN) {

        this.langFrom = langFrom;
        this.langTo = langTo;
        this.wordFrom = wordFrom;
        this.wordTo = wordTo;
        this.karaokeTH = karaokeTH;
        this.karaokeEN = karaokeEN;
        this.sound = sound;
        this.wordEN = wordEN;
    }

    public Thing(int id, String langFrom, String langTo, String wordFrom, String wordTo, String karaokeTH, String karaokeEN, String sound, String wordEN) {

        this.id = id;
        this.langFrom = langFrom;
        this.langTo = langTo;
        this.wordFrom = wordFrom;
        this.wordTo = wordTo;
        this.karaokeTH = karaokeTH;
        this.karaokeEN = karaokeEN;
        this.sound = sound;
        this.wordEN = wordEN;
    }
}
