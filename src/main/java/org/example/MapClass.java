package org.example;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
@Test
public class MapClass {
    public static void mapTest() {
        Map<String, Integer> StudentsAge = new HashMap<>();
        StudentsAge.put("Tomi",39);
        StudentsAge.put("Sheyi",28);
        StudentsAge.put("Remi",34);
        StudentsAge.put("Mark",24);
        StudentsAge.put("Mark",33);
        StudentsAge.put("Duke",15);
        StudentsAge.put("Mark", 28);
            System.out.println(StudentsAge.get("Remi"));

        }
    }

