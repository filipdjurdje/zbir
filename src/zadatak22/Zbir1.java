


	package zadatak22;

	import java.util.Scanner;

	public class Zbir1 {
	    public static void main(String[] args) {
	        // Create an instance of the Broj class
	        Broj b = new Broj();

	        // Create a Scanner object to take input from the user
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter values for 'a' and 'b'
	        System.out.print("Enter the value for 'a': ");
	        int a = scanner.nextInt();
	        b.seta(a);

	        System.out.print("Enter the value for 'b': ");
	        int bb = scanner.nextInt();
	        b.setb(bb);

	        // Calculate the sum of 'a' and 'b'
	        int c = b.geta() + b.getb();

	        // Print the result
	        System.out.println("The sum of 'a' and 'b' is: " + c);

	        // Close the scanner to prevent resource leak
	        scanner.close();
	    }
	}
