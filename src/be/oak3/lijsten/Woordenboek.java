package be.oak3.lijsten;

import java.util.Map;
import java.util.TreeMap;

public class Woordenboek {

    private Map<String,String> woordenboek = new TreeMap<>();

    public Woordenboek(String key, String value){
        voegWoordToe(key, value);
    }

    public void voegWoordToe(String key, String value){
        woordenboek.put(key, value);
    }

    public int getGrootte(){
      return woordenboek.size();
    }


    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        for (String key :woordenboek.keySet()) {
            builder.append(key);
            builder.append(":\t");
            builder.append(woordenboek.get(key) + "\n");
        }


        return builder.toString();
    }
}
