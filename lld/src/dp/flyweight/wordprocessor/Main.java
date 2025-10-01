package dp.flyweight.wordprocessor;

public class Main {
    public static void main(String[] args) {
        System.out.println("====== Flyweight Design Pattern ======");
        // Data: "Hello World"
        // Total 11 characters (including space)
        // h = 1 time
        // e = 1 time
        // l = 3 times (reused)
        // o = 2 times (reused)
        // w = 1 time
        // r = 1 time
        // d = 1 time
        // ' ' = 1 time

        // Create 11 character objects and provide display position(extrinsic state) at runtime
        Letter object1 = LetterFactory.crateLetter('H');
        object1.display(0, 0);

        Letter object2 = LetterFactory.crateLetter('e');
        object2.display(0, 1);

        Letter object3 = LetterFactory.crateLetter('l');
        object3.display(0, 2);

        Letter object4 = LetterFactory.crateLetter('l');
        object4.display(0, 3);

        Letter object5 = LetterFactory.crateLetter('o');
        object5.display(0, 4);

        Letter object6 = LetterFactory.crateLetter(' ');
        object6.display(0, 5);

        Letter object7 = LetterFactory.crateLetter('W');
        object7.display(0, 6);

        Letter object8 = LetterFactory.crateLetter('o');
        object8.display(0, 7);

        Letter object9 = LetterFactory.crateLetter('r');
        object9.display(0, 8);

        Letter object10 = LetterFactory.crateLetter('l');
        object10.display(0, 9);

        Letter object11 = LetterFactory.crateLetter('d');
        object11.display(0, 10);

        // Total characters created: 8 - because we are reusing the same object
        System.out.println("Total characters created: " + LetterFactory.getTotalCharacters());

    }
}
