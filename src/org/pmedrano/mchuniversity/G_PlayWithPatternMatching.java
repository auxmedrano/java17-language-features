package org.pmedrano.mchuniversity;

public class G_PlayWithPatternMatching {

    public static void main(String[] args) {
        Object o = 4;

        //old way
        if (o instanceof Integer) {
            int i = (int) o; //do casting
            System.out.println("integer legacy: " + i);
        }

        //using pattern variable
        if (o instanceof Integer p) {
            System.out.println("integer pattern variable: " + p);
        }

        //flow scoping the variable is only in scope when the compiler determine its type
        if (o instanceof String p) {
            System.out.println("string pattern: " + p);
        }

      // System.out.println("integer: "+ p);

        // the pattern variable cannot be the same type as the left side of the expression
//        Integer myInteger = 5;
//        if( myInteger instanceof  Integer otherInt){ //does not compile
//            System.out.println(otherInt);
//        }

        // bad practice to reassign a pattern variable
        if (o instanceof Integer p) {
            p = 8;
            System.out.println("integer reassigned: " + p);
        }

        // avoid reassignment using final modifier
        if (o instanceof final Integer p) {
             //p = 5; //does not compile
            System.out.println("integer final: " + p);
        }

        // including expressions
        if (o instanceof Integer p && p.compareTo(3) > 0) {
            System.out.println("integer after && >: " + p);
        }

        if (o instanceof Integer p && p.compareTo(10) < 0) {
            System.out.println("integer after && <: " + p);
        }


    }

}
