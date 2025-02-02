package test;

public class RecordTest {

    public static void main(String[] args) {
        Alien a1 = new Alien(1, "Samic");
        Alien a2 = new Alien(1, "Samic");

        System.out.println(a1.name());
        System.out.println(a1.equals(a2));
        a1.age = 10;

        System.out.println("The age of alien1 is " + a1.age);
        Alien a3 = new Alien(0, "Samic");
    }
}

record Alien(int id, String name) {
    static int age; // we can create a static variable

    public Alien {
        if(id == 0)
            throw new IllegalArgumentException("Id cannot be equal to zero");
    }
}
