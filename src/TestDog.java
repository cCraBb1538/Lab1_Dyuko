import java.lang.System;

public class TestDog {
    public static void main(String[] args) {

        Dog d1 = new Dog("Masha", 7);
        Dog d2 = new Dog("Ham", 10);
        Dog d3 = new Dog("Dobby");

        d3.setAge(6);

        System.out.println(d1);

        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
