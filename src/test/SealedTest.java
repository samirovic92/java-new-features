package test;

public class SealedTest {

    public static void main(String[] args) {
        System.out.println("Test Sealed class");
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Bike bike = new Bike();
    }
}
// ----- Sealed Class -----
sealed class Vehicle permits Car, Bike {

}

non-sealed class Car extends Vehicle {

}

final class Bike extends Vehicle {

}

class D extends Car {

}

// ----- Sealed Interface -----
sealed interface X permits Y {

}

non-sealed interface Y extends X {

}


