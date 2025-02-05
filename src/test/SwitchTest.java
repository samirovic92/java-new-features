package test;

public class SwitchTest {

    public static void main(String[] args) {
        String day = "Monday";

        // switch statement
        switch (day) {
            case "Saturday" -> System.out.println("Samedi");
            case "Sunday" -> System.out.println("Dimanche");
            case "Monday" -> System.out.println("Lundi");
            case "Tuesday" -> System.out.println("Mardi");
            case "Wednesday" -> System.out.println("Mercredi");
            case "Thursday" -> System.out.println("Jeudi");
            default -> System.out.println("Vendredi");
        }

        // switch expression
        String wakeUpTime = switch (day) {
            case "Saturday", "Sunday" -> "9am";
            case "Monday" -> "7am";
            default -> "8am";
        };

        System.out.println(String.format("Wake Up time in %s is %s", day, wakeUpTime));
    }
}
