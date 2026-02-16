import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Asking user input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();  // Important (clears buffer)

        System.out.print("Enter your qualification: ");
        String qualification = sc.nextLine();

        // Printing output
        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Qualification: " + qualification);

        sc.close();
    }
}
