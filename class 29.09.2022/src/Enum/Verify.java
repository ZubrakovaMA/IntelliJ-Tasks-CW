package Enum;

public class Verify implements CheckingDay {


    @Override
    public void verifyDay(DaysOfWeek weekDay) {
        switch (weekDay) {
            case MONDAY: {
                System.out.println(weekDay.getDay());
                break;
            }
            case TUESDAY: {
                System.out.println(weekDay.getDay());
                break;
            }
            case WEDNESDAY: {
                System.out.println(weekDay.getDay());
                break;
            }
            case THURSDAY: {
                System.out.println(weekDay.getDay());
                break;
            }
            case FRIDAY: {
                System.out.println(weekDay.getDay());
                break;
            }
            case SATURDAY: {
                System.out.println(weekDay.getDay());
                break;
            }
            case SUNDAY: {
                System.out.println(weekDay.getDay());
                break;
            }

        }
    }
}
