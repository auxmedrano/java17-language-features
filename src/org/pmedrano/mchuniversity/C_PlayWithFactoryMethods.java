package org.pmedrano.mchuniversity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class C_PlayWithFactoryMethods {

    public static void main(String[] args) {

        var mutableList = new ArrayList<String>(); //mutable list
        mutableList.add("one");
        mutableList.add("two");
        mutableList.add("three");
        mutableList.add("four");
        mutableList.add("five");
        mutableList.add(null);
        System.out.println("mutableList    = " + mutableList);
        System.out.println("--------------------------------------------------");

        var immutableList =
                Arrays.asList("one", "two", "three", "four", "five");  // returns an immutable list
        //immutableList.add("six"); // you cannot add or remove elements
        immutableList.replaceAll(String::toUpperCase); //but the items can be modified

        System.out.println("immutableList = " + immutableList);
        System.out.println("--------------------------------------------------");

        var completeImmutableList =
                List.of("one", "two", "three", "four", "five", "six"); // complete immutable list - can't add null
        //completeImmutableList.replaceAll(String::toUpperCase); // you cannot modify the elements
        System.out.println("completeImmutableList = " + completeImmutableList);
        System.out.println("--------------------------------------------------");

        mutableList.removeIf(Objects::isNull);
        var copyOfMutable = List.copyOf(mutableList); // if the copy is from a mutable it does the copy

        System.out.println("copyOfMutable = " + copyOfMutable);
        System.out.println("Equals = " + (mutableList == copyOfMutable)); //false
        System.out.println("--------------------------------------------------");

        var copyOfImmutable = List.copyOf(completeImmutableList); // if the copy is from an immutable it points to the same reference

        System.out.println("copyOfImmutable = " + copyOfImmutable);
        System.out.println("Equals = " + (completeImmutableList == copyOfImmutable)); // true

        var mapTenEntries =
                Map.of(1, "1", 2, "2"); //map k,v up to 10

        var mapMoreEntries =
                Map.ofEntries(
                        Map.entry(1, "1"),
                        Map.entry(2, "2")); // map if you need more than 10 entries

    }
}
