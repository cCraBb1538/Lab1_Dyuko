import java.lang.System;

public class TestBall {
    public static void main(String[] args) {

        Ball b1 = new Ball("white", 15);
        Ball b2 = new Ball("Black", 11);
        Ball b3 = new Ball("Green");

        b3.setRadius(14);

        System.out.println(b1);

        b1.volumeOfBall();
        b2.volumeOfBall();
        b3.volumeOfBall();
    }
}
