package Enum;

public class Main {
    public static void main(String[] args) {
        Verify startCheck = new CheckingDay();
        DaysOfWeek[] array = DaysOfWeek.values();
        for (DaysOfWeek day : array
        ) {
            startCheck.verify(day);
        }

    }
}
