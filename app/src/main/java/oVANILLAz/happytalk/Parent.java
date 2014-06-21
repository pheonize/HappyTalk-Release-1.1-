package oVANILLAz.happytalk;

import java.util.ArrayList;

/**
 * Created by oVANILLAz on 6/8/14 AD.
 */
public class Parent {

    private String wordFrom;
    private String wordEN;

    //ArrayList to store child objects
    private ArrayList<Child> children;



    public ArrayList<Child> getChildren(){

        return children;
    }

    public void setChildren(ArrayList<Child> children){
        this.children = children;
    }

    public String getWordFrom(){
        return wordFrom;
    }

    public void setWordFrom(String wordFrom){
        this.wordFrom = wordFrom;
    }

    public String getWordEN(){
        return wordEN;
    }

    public void setWordEN(String wordEN){
        this.wordEN = wordEN;
    }



}
