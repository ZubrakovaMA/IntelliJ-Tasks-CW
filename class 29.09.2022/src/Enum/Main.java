package Enum;

public class Main {
    public static void main(String[] args) {
        Verify verifyDay = new Verify();
        DaysOfWeek[] weekDays = DaysOfWeek.values();
        for (DaysOfWeek weekday : weekDays) {
            verifyDay.verifyDay(weekday);
        }
    }
}
