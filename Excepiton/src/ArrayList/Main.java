package ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(1);
        liste.add(1);
        liste.add(2);
        liste.add(null);
        liste.add(6);

        System.out.println(liste.size());
        System.out.println(liste.get(1));
        System.out.println(liste.contains(122));
        System.out.println(liste.subList(2,5));

        liste.set(0,111);
        System.out.println(liste);

        System.out.println(liste.indexOf(1));

        ArrayList<Integer> liste2 = new ArrayList<>();
        liste2=liste;
        System.out.println(liste2);

        liste.clear();
        System.out.println(liste);

    }
}
