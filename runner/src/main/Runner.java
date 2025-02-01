package main;

import com.samic.Calculate;

public class Runner {
    public static void main(String[] args) {
        Calculate c = new Calculate();
        var total = c.add(1, 7);
        System.out.println(total);
    }
}
