package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        boolean isLeap = (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
        System.out.println(isLeap ? "leap" : "not leap");
    }
}
