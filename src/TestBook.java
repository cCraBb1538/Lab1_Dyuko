import java.lang.System;

public class TestBook {
    public static void main(String[] args) {

        Book b1 = new Book("Black", 159);
        Book b2 = new Book("Blue", 708);
        Book b3 = new Book("Green");

        b3.setPages(56);

        System.out.println(b1);

        b1.numberOfCharacters();
        b2.numberOfCharacters();
        b3.numberOfCharacters();
    }

}
