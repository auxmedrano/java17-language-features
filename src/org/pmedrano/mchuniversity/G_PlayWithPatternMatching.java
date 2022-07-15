package org.pmedrano.mchuniversity;

public class G_PlayWithPatternMatching {

    public static void main(String[] args) {
        Object object = 4;

        //old way
        if (object instanceof Integer) {
            int i = (int) object; //do casting
            System.out.println("integer legacy: " + i);
        }

        //using pattern variable
        //flow scoping the variable is only in scope when the compiler can determine its type
        //the pattern variable cannot be the same type as the left side of the expression
        // bad practice reassigning a pattern variable
        // avoid reassignment using final modifier
        //Integer o = 0;
        if (object instanceof final Integer patternVariable) {
            //patternVariable = 5; //does not compile
            System.out.println("Pattern variable: " + patternVariable);
        }

        // including expressions
        if (object instanceof Integer patternVariable && patternVariable == 4) {
            System.out.println("integer after && >: " + patternVariable);
        }

    }

}
