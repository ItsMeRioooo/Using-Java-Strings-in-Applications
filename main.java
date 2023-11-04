import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Greeting
        System.out.print("Please enter your initials: ");
        String initials = sc.nextLine();
        System.out.println("Hello " + initials + "!");
        
        // Task 2: Equal or Not Equal
        System.out.print("Please enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Please enter the second number: ");
        int num2 = sc.nextInt();
        
        if (num1 == num2) {
            System.out.println(num1 + " and " + num2 + " are equal.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not equal.");
        }
        // do not forget the closing to prevent memory leak :)
        sc.close();
    }
}
