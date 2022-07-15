package org.pmedrano.mchuniversity;

public class H_PlayWithRecords {

    public static void main(String[] args) {

        record Range(int start, int end) {

            public Range { //compact constructor
                if (end <= start) {
                    throw new IllegalArgumentException("End cannot be lesser than start");
                }
            }
        }

        var range = new Range(0, 5);
//        var range = new Range(5,0);
        System.out.println("range: " + range);
        System.out.println("start: " + range.start);
        System.out.println("end: " + range.end);

//      range.start = 3; // immutable

        //calling toString
//       var toString = range.toString();
//        System.out.println(toString);

        //legacyRecord
//        var legacy = new LegacyRecord(0,5);
//        System.out.println(legacy);
    }

}
