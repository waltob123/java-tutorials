public class Switch {
    public static void main (String args[]) {
        int day = 0;
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // String dayName = "Monday";
        // switch (dayName) {
        //     case "Saturday", "Sunday" -> System.out.println("It's the weekend!");
        //     default -> System.out.println("It's a weekday");
        // }
    }
}