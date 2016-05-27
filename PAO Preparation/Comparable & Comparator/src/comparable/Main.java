/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparable;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Comparable & Comparator
 * @author Adrian ISPAS
 */
public class Main {
    public static void main(String[] args){
        HDTV tv1 = new HDTV(55, "Samsung");
        HDTV tv2 = new HDTV(60, "Sony");
        HDTV tv3 = new HDTV(42, "Panasonic");
        
        ArrayList<HDTV> tvs = new ArrayList<>();
        tvs.add(tv1);
        tvs.add(tv2);
        tvs.add(tv3);
        
        //Collections.sort(tvs);
        Collections.sort(tvs,new SizeComparator());

        tvs.stream().forEach((a) -> {
            System.out.println(a.getBrand());
        });
    }

}
