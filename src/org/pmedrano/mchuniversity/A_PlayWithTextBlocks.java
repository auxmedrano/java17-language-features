package org.pmedrano.mchuniversity;

public class A_PlayWithTextBlocks {


    public static void main(String[] args) {
        String traditionalMultiLine =" {\n"
            + "            \"data\":\n"
            + "            {\n"
            + "                \"anotherId\": 254987,\n"
            + "                \"ndi\": 23425f,\n"
            + "                \"nit\": 45217869,\n"
            + "                \"firstName\": \"Test\",\n"
            + "               \"lastName\": \"One\",\n"
            + "                \"middleInitial\": null,\n"
            + "                \"preferredName\": null,\n"
            + "                \"npi\": \"1254856965\"\n"
            + "            }\n"
            + "        }";

        System.out.println(traditionalMultiLine);

        System.out.println("------------------------------------");

        //starts and ends with three double quotes
        String textBlock = """
                {
                "data": {
                    "anotherId": 254987,
                    "ndi": 23425f,
                    "nit": 45217869,
                    "firstName": "Test",
                    "lastName": "One",
                    "middleInitial": null,
                    "preferredName": null,
                    "npi": "1254856965"
                }
            }
            
       """;

        System.out.println(textBlock);

        System.out.println("------------------------------------");

        String anotherBlock = """
                    this is a multiline      \s
                  "text block" 3 '' '''      \
                 a     $hello world  \s
                """;
        anotherBlock.lines().map(s -> "|" + s + "|").forEach(System.out::println);
//
//        //incidental whitespace and essential whitespace
//        // \s is a space and preserves leading space on the line
//        // \ omits new line
//        //the contents don't need to be escaped \"
//

    }


}
