package D20;
import java.util.Random;
public class GenDice {
	int numberOfSides;
	String dieName;

	GenDice(){
		numberOfSides = 6;
		dieName = "D6";
	}

	public void testRoll(int i) {
		int current = 0;
		int counter = 1;
		int counterLimit = 1000000;
		while(true){
			current = getRoll();
			counter++;
			if (i == getRoll()) {
				System.out.println("We rolled a " + i);
				break;
			} 
			if (counter == counterLimit) {
				System.out.println(i+ " was not rolled");
				break;
			}

		}

	}

	public int getRoll() {
		int rollResult = 0;
		Random random1 = new Random();
		rollResult = random1.nextInt(numberOfSides)+1;
		return rollResult;
	}

	GenDice(int newSideCount){
		numberOfSides = newSideCount;
		dieName = "Name";
	}

	GenDice(int newSideCount, String newName){
		numberOfSides = newSideCount;
		dieName = newName;
	}

	public String getName() {
		return dieName;
	}

	public int getSideCount() {
		return numberOfSides;
	}

}
