import java.util.Scanner; // imports entire java.util package

public class console_app {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); //create scanner object
		System.out.println("Enter name: "); // asks for name input
		
		String name = input.nextLine(); // assigns input to variable
				
		System.out.println("Enter a noun (doesn't start with a vowel): "); // asks for noun input
				
		String noun = input.nextLine(); // assigns input to variable
		System.out.println(name + " is a " + noun + "."); // prints final sentence
		
	}

}
