package D20;
import java.util.Scanner;
public class D20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many sides do you want on the die?");
		int numberOfSides = scan.nextInt();
		GenDice die20 = new GenDice(numberOfSides, "D"+numberOfSides);

		System.out.println("Our die, " + die20.getName() + " has " + die20.getSideCount() + " sides.");

		System.out.println("Lets roll for initiive.");

		System.out.println("Our die " + die20.getName() + " has rolled a " + die20.getRoll() + ".");
	}
}