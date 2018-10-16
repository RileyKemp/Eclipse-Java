package dragontest1;
import java.util.Random;

public class SimpleDragonClass {
	private String name;
	private int health;
	/* Construct a Simple default dragon*/
	public SimpleDragonClass() {
		this.name = "Jim";
		this.health = getInitialHealth();

	}

	public SimpleDragonClass(String name2) {
		this.name = name2;
		this.health = getInitialHealth();
	}
	private int getInitialHealth() {
		Random random1 = new Random();
		int health = 0;

		for(int i = 1; i<=7; i++) {
			health = health + random1.nextInt(20)+1;

		}

		return health;
	}


	public String getName() {
		return this.name;
	}

	public int attack() {
		Random random2 = new Random();
		int attack = random2.nextInt(20)+1;
		return attack;
	}

	public void setDamage(int attack) {
		this.health = this.health - attack;

	}
	public int getHealth() {
		return this.health;
	}
}