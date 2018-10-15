package D20;
import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many sides do you want on the die?");
		int numberOfSides = scan.nextInt();
		GenDice die20 = new GenDice(numberOfSides, "D"+numberOfSides);

		System.out.println("Test for rolling correct numbers.");
		for(int i = 1; i<=die20.getSideCount(); i++) {
			die20.testRoll(i);
		}

		System.out.println("Let's Test again.");

		for(int i = 1; i<=die20.getSideCount() + 1; i++) {
			die20.testRoll(i);
		}
	}
}
