enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    private Days() {
        System.out.println("Constructor called for: " + this.toString());
    }

    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}


public class Enum {
    public static void main(String[] args) {
        Days day = Days.SUNDAY;
        System.out.println(day.isWeekend());

        for (Days d : Days.values()) {
            System.out.println(d);
        }

        if (day == Days.SUNDAY) {
            System.out.println("Sunday");
        }

        switch (day) {
            case SUNDAY:
                System.out.println("Sunday");
                break;
            case MONDAY:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Other day");
        }
    }
}
