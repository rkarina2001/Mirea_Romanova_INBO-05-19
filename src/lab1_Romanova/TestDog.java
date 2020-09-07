package lab1_Romanova;

import java.lang.*;
public class TestDog {
    public static void main(String[]args)
    {
        dog d1 = new dog("Mike",2);
        dog d2 = new dog("Helen",7);
        dog d3 = new dog("Bob");
        d3.setAge(1);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
