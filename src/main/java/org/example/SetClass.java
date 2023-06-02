package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetClass {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
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
