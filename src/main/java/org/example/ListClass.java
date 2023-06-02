package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListClass {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tomi");
        names.add("Sheyi");
        names.add("Remi");
        names.add("Mark");
        names.add("Mark");
        names.add("");
        names.add("Mark");
        for(String i: names){
            System.out.println(i);
        }
    }
}
