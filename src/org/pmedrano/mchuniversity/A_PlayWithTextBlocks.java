package org.pmedrano.mchuniversity;

public class A_PlayWithTextBlocks {


    public static void main (String[] args){
        String traditionalMultiLine = "hello this \"" + "\n" //escaped characters and new line
            + " is a multi line string";

        System.out.println(traditionalMultiLine);

        System.out.println("------------------------------------");

        //starts and ends with three double quotes
//        String textBlock = """
//            this is a multiline
//            text block
//            hello world""";
//
//       System.out.println(textBlock);

//        System.out.println("------------------------------------");

//        String anothertextBlock = """
//                 this is a multiline   \s
//               "text block"      \s
//              a     $hello world  \s
//             """;
//        anothertextBlock.lines().map(s -> "|" + s + "|").forEach(System.out::println);
//
//        //incidental whitespace and essential whitespace
//        // \s is a space and preserves leading space on the line
//        // \ omits new line
//        //the contents don't need to be escaped \"
//


    }



}
