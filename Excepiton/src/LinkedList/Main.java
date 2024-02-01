package LinkedList;

import java.util.*;


public class Main {
    public static void main(String[] args){

        TreeMap<String , String> map = new TreeMap<String, String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        }.reversed());
        map.put("A","Ankara");
        map.put("B","Bursa");
        map.put("D","Denizli");
        map.put("E","Edirne");
        map.put("D","Diyarbakır");

        for (String values : map.values()){
            System.out.println(values);
        }

    }
}
