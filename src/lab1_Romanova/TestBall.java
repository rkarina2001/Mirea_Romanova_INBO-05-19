package lab1_Romanova;

import java.lang.*;
public class TestBall {
    public static void main(String[]args){
        Ball b1 = new Ball("Red",2);
        Ball b2 = new Ball("Yellow",3);
        Ball b3 = new Ball("Black");
        //b3.setDiametr(1);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        b1.totals();
        b2.totals();
        b3.totals();
    }
}
