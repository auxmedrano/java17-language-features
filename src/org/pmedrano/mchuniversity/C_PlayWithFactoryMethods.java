package org.pmedrano.mchuniversity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class C_PlayWithFactoryMethods {
    public static void main(String[] args) {

        //ArrayList<String> arrayList = new ArrayList<>();
        var arrayList = new ArrayList<String>(); //mutable list
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.add("four");
        arrayList.add("five");
        arrayList.add(null);


        var arraysAsList =
            Arrays.asList("one", "two", "three", "four", "five");  // returns an immutable list
        //arraysAsList.add("six");
      arraysAsList.replaceAll(String::toUpperCase); //but the items can be modified


        var listOf =
            List.of("one", "two", "three", "four", "five","six"); // complete immutable list - can't add null
        //listOf.replaceAll(String::toUpperCase);


//        System.out.println("arrayList    = " + arrayList);
//        System.out.println("arraysAsList = " + arraysAsList);
//        System.out.println("listOf       = " + listOf);
//
        arrayList.removeIf(Objects::isNull);
        var copyOf1 = List.copyOf(arrayList); // if the copy is from a mutable it does the copy
        System.out.println("copyOf1 = " + copyOf1);
        System.out.println("Equals = " + (arrayList == copyOf1)); //false

        var copyOf2 = List.copyOf(listOf); // if the copy ies from an immutable it points to the same reference
        System.out.println("copyOf2 = " + copyOf2);
        System.out.println("Equals = " + (listOf == copyOf2)); // true

        var map =
            Map.of(1, "1", 2, "2"); //map k,v up to 10
        var map2 =
            Map.ofEntries(Map.entry(1, "1"), Map.entry(2,"2")); // map if you need more than 10 entries

    }
}
