package org.pmedrano.mchuniversity;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class E_PlayWithMapMulti {

    public static void main(String[] args) {

        String ints = """
            1
            2
            3
            4
            5
            # something
            """;

//        var intsToList = ints.lines()
//            .map(Integer::parseInt)
//            //.collect(Collectors.toList());
//           .toList(); // optimization for .collect(Collectors.toList()) creates the ArrayList of the exact needed size
//        //is more efficient because .collect(Collectors.toList()) creates an ArrayList and will fill it with the elements coming from the stream if the ArrayList
//        // is too small at some point it will copy the ArrayList to a bigger ArrayList and the smaller one goes to garbage collector
//
//        System.out.println("ToList: = " + intsToList);

 //       usingFilter(ints);
  //      usingFlatMap(ints);
      usingMapMulti(ints);

    }

    public static void usingFilter(String ints) {
        //filtering the good ints (not recommended way)
        List<Integer> toList = ints.lines() //you can use var here
            .filter(
                s -> {
                    try {
                        Integer.parseInt(s);
                        return true;
                    } catch (NumberFormatException e) {
                        return false;
                    }
                }
            )
            .map(Integer::parseInt)
            .toList();

        System.out.println("toList using filter = " + toList);

    }

    public static void usingFlatMap(String ints) {
        //if you are using java 8 this could be a better solution
        List<Integer> toList = ints.lines()
            .flatMap(
                s -> {
                    try {
                        return Stream.of(Integer.parseInt(s));
                    } catch (NumberFormatException e) {
                        return Stream.of();
                    }
                }
            )
            .toList();
        System.out.println("toList using flatMap = " + toList);
    }

    public static void usingMapMulti(String ints) {
        // best solution using java 17
        List<Integer> toList = ints.lines()
            .<Integer>mapMulti((s, consumer) -> { //it takes a BiConsumer
                try {
                    consumer.accept(Integer.parseInt(s)); //if this can be done it will add the result to the downstream
                } catch (NumberFormatException e) {
                   // System.out.println("error: " + e.getMessage()); // if is not possible it will not add nothing
                }
            }).toList(); //returns an immutable list

        System.out.println("ToList using Map Multi = " + toList);
    }

}
