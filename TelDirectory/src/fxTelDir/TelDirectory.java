package fxTelDir;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TelDirectory {

    Map<String, String> telDirMap = new HashMap<>();

    public TelDirectory(String number){
        get(number);
    }

    public TelDirectory(String number, String name){
        add(number, name);
    }


    public void add(String number, String name){
        telDirMap.put(number, name);
    }

    public String get(String name){
        String resualtOfserch = " ";
        for(Map.Entry<String,String> entry : telDirMap.entrySet()){
            if(entry.getValue().equals(name)){
                resualtOfserch = name + " " + entry.getKey();
            }
        }
        return resualtOfserch;
    }

}
