import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day;

        String[] strWeekdays = {"Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday"};
        //System.out.println(strWeekdays);
        System.out.println("Weekdays:");
        for (int i = 0; i < strWeekdays.length; i++) {
            System.out.println(strWeekdays[i]);
        }
        System.out.println("Please select a day of the week 1-7.");
        day = scan.nextInt() - 1;
        System.out.println(strWeekdays[day]);
    }
}