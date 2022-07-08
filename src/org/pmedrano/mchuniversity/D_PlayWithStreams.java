package org.pmedrano.mchuniversity;

import java.util.ArrayList;
import java.util.List;

public class D_PlayWithStreams {

    public static void main(String[] args) {
        List<String> strings = List.of("one", "two", "three", "four");

        //ignores the consumer because it has a terminal operation
//        var count = strings.stream().peek(System.out::println)
//            //.filter(s -> s.startsWith("t"))
//            .count();
//
//        System.out.println("count elements:" + count);

        // again because the terminal operation the intermediate operation is not processed
        var list = new ArrayList<String>();
        var count = strings.stream().map(s -> {
            list.add(s);
            return s.toUpperCase();
        }).count();
        System.out.println("count = " + count);
        System.out.println("list = " + list);

        // because it has the filter intermediate operation there is no longer sized stream, so it will execute the map
//        var listOf =
//                List.of("one", "two", "three", "four", "five");
//
//        var list = new ArrayList<String>();
//
//        var count = listOf.stream()
//                .skip(2)
//                .limit(2)
//                //.filter(s -> true)
//                .map(s -> {
//                    list.add(s);
//                    return s.toUpperCase();
//                })
//                .count();
//        System.out.println("count = " + count);
//        System.out.println("list = " + list);

    }
}
