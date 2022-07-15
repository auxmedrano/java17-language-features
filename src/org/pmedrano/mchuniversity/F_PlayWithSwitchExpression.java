package org.pmedrano.mchuniversity;


public class F_PlayWithSwitchExpression {

    enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {

        oldSwitch();
//        switchUsingYield();
//        switchUsingDefault();

    }

    public static void oldSwitch() {
        //ol' reliable switch
        int quarter = 0;
        String quarterLabel;
        switch (quarter) {
            case 0: //using multiple cases
            case 1:
                quarterLabel = "Q1 - Winter";
                break;
            case 2:
                quarterLabel = "Q3 - Summer";
                break;
            case 3:
                quarterLabel = "Q4 - fall";
                break;
            default:
                quarterLabel = "Unknown quarter";
        }
        System.out.println("Old Switch: " + quarterLabel);
    }

    // SwitchExpression using yield instead of return
    public static void switchUsingYield() {
        DayOfWeek dayOfWeek = DayOfWeek.valueOf("FRIDAY");

        var message = switch (dayOfWeek) {
            case WEDNESDAY -> "Sports";  //doesn't need break
            case SATURDAY -> "Friends";
            case SUNDAY -> "Family";
            case MONDAY, TUESDAY, THURSDAY, FRIDAY -> { //multiple statements
                System.out.println("School printed");
                yield "School"; //instead of return
            }
        };
        System.out.println("SwitchExpression using Yield: " + message);
    }

    //adding default case to avoid compile errors
    public static void switchUsingDefault() {
        int day = 7;
        var message = switch (day) {
            case 1, 2, 5 -> {
                System.out.println("School");
                yield "School";
            }
            case 3 -> "Sports";
            case 6 -> "Friends";
            case 0 -> "Family";
            default -> "unknown day"; //default case needed
        };
        System.out.println("SwitchExpression Using default: " + message);
    }

}
