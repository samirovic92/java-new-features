package test;

public class SwitchTest {

    public static void main(String[] args) {
        String day = "Monday";
        switch (day) {
            case "Saturday" -> System.out.println("Samedi");
            case "Sunday" -> System.out.println("Dimanche");
            case "Monday" -> System.out.println("Lundi");
            case "Tuesday" -> System.out.println("Mardi");
            case "Wednesday" -> System.out.println("Mercredi");
            case "Thursday" -> System.out.println("Jeudi");
            default -> System.out.println("Vendredi");
        }
    }
}
