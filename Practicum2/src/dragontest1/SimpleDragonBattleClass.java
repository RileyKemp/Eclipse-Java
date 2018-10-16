package dragontest1;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class SimpleDragonBattleClass {

	public boolean simpleBattle(SimpleDragonClass user1, SimpleDragonClass computer1) {
		boolean userWin = false;
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Our hero " + user1.getName() + " has health of: " + user1.getHealth());
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Our opponent " + computer1.getName() + " has health of: " + computer1.getHealth());
		try {
			TimeUnit.SECONDS.sleep(3/2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		while(user1.getHealth() > 0 && computer1.getHealth()> 0) {
			if(user1.getHealth() > 0 ) {

				System.out.println("The Hero, "+user1.getName()+" has taken damage.");
				user1.setDamage(computer1.attack());

				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				computer1.setDamage(user1.attack());
				System.out.println(user1.getName()+" now has "+ user1.getHealth() +" health");
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			if(computer1.getHealth() > 0 ) {

				System.out.println("The opponent, " + computer1.getName() +" has taken damage.");
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				computer1.setDamage(user1.attack());
				System.out.println(computer1.getName()+ " now has " + (computer1.getHealth()-1)+" health");
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}


		}
		if(user1.getHealth()>0) {
			userWin = true;
		}
		System.out.println("The battle is over...");
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\LAB\\Desktop\\Eclipse-Java\\Sounds\\Dinosaur Roar-SoundBible.com-605392672.wav").getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {

				e.printStackTrace();}
			return userWin;
		} catch(Exception ex) {
			System.out.println("Error with playing sound.");
			ex.printStackTrace();
		}


		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {

			e.printStackTrace();}
		return userWin;

	}

	public void printWinner(boolean userWin) {
		if(userWin) {
			System.out.println("Your dragon was victorious.");


		} else {
			System.out.println("The computer's Dragon was victorious.");
		}

	}


}