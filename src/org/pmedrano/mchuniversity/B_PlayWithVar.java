package org.pmedrano.mchuniversity;

import java.nio.file.Path;
import java.util.List;

public class B_PlayWithVar {
//    cannot be used for fields
//    private var name = "Pablo";
//
//    cannot be used for constructor or parameters
//    public void setName(var name) {
//        this.name = name;
//    }

    public static void main (String[] args){
        String message = "Hello world!";
        Path path = Path.of("debug.log");
//
//        var message = "Hello world!";
//        var path = Path.of("debug.log");
//
//        System.out.println(message);
//        System.out.println(path.getFileName());
//
//        var list = List.of("one", "two", "three", "four");
//        for (var element: list) {
//            System.out.println(element);
//        }

        System.out.println( B_PlayWithVar.greetings(0));
    }

    public static String greetings(int message) {
        var greetings  = ""; //needs an initializer
        //var var = "hello";
        if (message == 0) {
            greetings = "morning";
        } else {
            greetings = "afternoon";
        }
        return "Good " + greetings;
    }
}
