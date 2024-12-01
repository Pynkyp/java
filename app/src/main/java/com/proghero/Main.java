//filename:Example.java
import java.util.Scanner;

class Example {
    public static void main(String args[]) {
        String name;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = userInput.nextLine();
        System.out.println("Hi, " + name);
        userInput.close();
    }
}