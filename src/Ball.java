import java.lang.System;

public class Ball {

    private String color;
    private int radius;

    public Ball(String c, int r) {
        color = c;
        radius = r;
    }

    public Ball(String c) {
        color = c;
        radius = 0;
    }

    public Ball() {
        color = "Red";
        radius = 14;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(String color) {
        return color;
    }

    public int getRadius() {
        return radius;
    }

    public String toString() {
        return this.color + " ball has a radius of " + this.radius;
    }

    public void volumeOfBall() {
        System.out.println( " Ball's colour" + color + "the Ball's radius is" + (7.0/5.0) * Math.PI * radius*radius);
    }

}
