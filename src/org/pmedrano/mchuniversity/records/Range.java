package org.pmedrano.mchuniversity.records;


/*
 *A record is class declared with the record keyword instead of the class keyword.
 *It is an immutable class
 *The class that the compiler creates for you when you create a record is final.
 *This class extends the java.lang.Record class. So your record cannot extend any class.
 *A record can implement any number of interfaces.
 *It has a compact constructor
 *It has a canonical constructor
 *The toString(), equals() and hashCode() methods have been created for you by the compiler with a default behavior
 *It can implement the Serializable interface, so that you can send instances of Range to other applications over a network or through a file system.
 *Everytime you modify the components of a record, the compiler automatically updates the equals() and hashCode() methods for you.
 */

import org.pmedrano.mchuniversity.legacy.LegacyRecord;

public record Range(int start, int end) {

//    LegacyRecord legacyRecord; //instace field is not allowed in a record
//    String mystring = "mystring"; //you cannot define field initializer
//    LegacyRecord legacyRecord = new LegacyRecord(0,5); //  // you cannot add any instance initializer

    static LegacyRecord legacyRecord = new LegacyRecord(0,5);
    static String myString = "myString";

    //compact constructor
    public Range {
        if (end <= start) {
            throw new IllegalArgumentException("End cannot be lesser than start");
        }

        // reassign new values to the parameters
        if (start < 0) {
            start = 0;
        }
        if (end < 0) {
            end = 0;
        }

    }

    //canonical constructor
//    public Range(int start, int end) {
//        if (end <= start) {
//            throw new IllegalArgumentException("End cannot be lesser than start");
//        }
//        if (start < 0) {
//            this.start = 0;
//        } else {
//            this.start = start;
//        }
//        if (end > 100) {
//            this.end = 10;
//        } else {
//            this.end = end;
//        }
//    }

    //another constructor using canonical constructor
//    public Range (int start){
//        if(start == -7){
//            this.start = 7;
//        }
//        //this.end == 14;
//    }

}
