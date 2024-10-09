import java.util.Scanner;

public class Int_opt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user to input values
        System.out.println("Enter the first integer (a): ");
        int a = sc.nextInt();
        
        System.out.println("Enter the second integer (b): ");
        int b = sc.nextInt();
        
        System.out.println("Enter the third integer (c): ");
        int c = sc.nextInt();
        
        // Displaying results with clear explanations
        System.out.println("Results:");
        System.out.println("(a + b * c) = " + (a + b * c));
        System.out.println("(a * b + c) = " + (a * b + c));
        System.out.println("(c + a / b) = " + (c + a / b));
        System.out.println("(a % b + c) = " + (a % b + c));
        
       

    }

}
