package test;

import java.util.Arrays;

public class TypeInferenceTest {

    public static void main(String[] args) {
        var a = 10; // --> int a = 10;
        var nums = new int[]{10, 20, 30}; // --> int nums[] = new int[]{10, 20, 30}
        var user = new User("Samic"); // --> User user = new User();

        System.out.println(a);
        System.out.println(Arrays.toString(nums));
        System.out.println(user.getFullName());

    }

}

class User {
    private String fullName;

    public User(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
