package Enum;

public class CheckingDay implements Verify{
    @Override
    public void verify(DaysOfWeek day) {
        switch (day) {
            case MONDAY:
                if (day.getName().equals("Понедельник")) {
                    System.out.println(day.getName() + " - Текст корректный");
                } else {
                    System.out.println(day.getName() + " - Текст некорректный");
                }
                break;
            case TUESDAY:
                if (day.getName().equals("Вторник")) {
                    System.out.println(day.getName() + " - Текст корректный");
                } else {
                    System.out.println(day.getName() + " - Текст некорректный");
                }
                break;
            case WEDNESDAY:
                if (day.getName().equals("Среда")) {
                    System.out.println(day.getName() + " - Текст корректный");
                } else {
                    System.out.println(day.getName() + " - Текст некорректный");
                }
                break;
            case THURSDAY:
                if (day.getName().equals("Четверг")) {
                    System.out.println(day.getName() + " - Текст корректный");
                } else {
                    System.out.println(day.getName() + " - Текст некорректный");
                }
                break;
            case FRIDAY:
                if (day.getName().equals("Пятница")) {
                    System.out.println(day.getName() + " - Текст корректный");
                } else {
                    System.out.println(day.getName() + " - Текст некорректный");
                }
                break;
            case SATURDAY:
                if (day.getName().equals("Суббота")) {
                    System.out.println(day.getName() + " - Текст корректный");
                } else {
                    System.out.println(day.getName() + " - Текст некорректный");
                }
                break;
            case SUNDAY:
                if (day.getName().equals("Воскресенье")) {
                    System.out.println(day.getName() + " - Текст корректный");
                } else {
                    System.out.println(day.getName() + " - Текст некорректный");
                }
                break;
            default:
                System.out.println("Не день");
        }

    }
}
