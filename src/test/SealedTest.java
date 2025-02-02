package test;

public class SealedTest {

    public static void main(String[] args) {
        System.out.println("Test Sealed class");
        A a = new A();
        B b = new B();
        C c = new C();
    }
}
// ----- Sealed Class -----
sealed class A permits B, C {

}

non-sealed class B extends A{

}

final class C extends A {

}

class D extends B {

}

// ----- Sealed Interface -----
sealed interface X permits Y {

}

non-sealed interface Y extends X {

}


