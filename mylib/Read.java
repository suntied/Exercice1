package mylib;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Read {
    HashMap<String, Integer> map = new HashMap<>();

    public int average(ArrayList arrayList){
        return 0;
    }
    Integer score(String mail){
        Integer score = null;
        if(map != null){
            score = map.entrySet().stream().filter(x -> mail.equals(x.getKey())).mapToInt(Map.Entry::getValue).sum();
        }
        return score;
    }
    void reader(){
        try (FileReader reader = new FileReader("C:\\Users\\marco\\Desktop\\TP L3\\text.txt");
             BufferedReader br = new BufferedReader(reader)){
            String line;
            while ((line = br.readLine()) != null) {
                if(!line.isEmpty()) {
                    String[] lineTab = line.split(":");
                    map.put(lineTab[0], Integer.parseInt(lineTab[1]));
                }
            }
        } catch (IOException e){
            System.err.println("Error"+ e);
        }
    }
}
