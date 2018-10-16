package dragontest1;
import java.util.Scanner; 

public class TestSimpleDragonBattleClass {

	public static void main(String[] args) {

		// start by making the CPU dragon
		SimpleDragonClass computer1 = new SimpleDragonClass();

		// User made Dragon.
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a name for your dragon: ");
		String name = input.nextLine();

		SimpleDragonClass user1 = new SimpleDragonClass(name);

		// Create a SimpleDragonBattleClass object called first battle.
		SimpleDragonBattleClass firstBattle = new SimpleDragonBattleClass();

		// use the battle class, determine the outcome.
		boolean userWin;
		userWin = firstBattle.simpleBattle(user1, computer1);
		firstBattle.printWinner(userWin);

		input.close();

	}}

