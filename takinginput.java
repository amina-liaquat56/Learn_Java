import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();   // Reads string input

        System.out.print("Enter your age: ");
        int age = sc.nextInt();        // Reads integer input

        System.out.println("Hello " + name + ", you are " + age + " years old!");
    }
}
