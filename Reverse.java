import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input
        System.out.println("Enter a string:"); 
        String input = sc.nextLine(); 
        String reversed = ""; // Initialize an empty string 

        // Loop through the string in reverse order
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); // Append the characters in reverse order
        }

        System.out.println("Reversed string: " + reversed); // Output the reversed string
        sc.close(); 
    }
}
