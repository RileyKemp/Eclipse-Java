package dragontest1;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class SimpleDragonBattleClass {

public boolean simpleBattle(SimpleDragonClass user1, SimpleDragonClass computer1) {
boolean userWin = false;
String cname = computer1.getName();
System.out.println("Our hero " + user1.getName() + " has health of: " + user1.getHealth());
System.out.println("Our opponent " + computer1.getName() + " has health of: " + computer1.getHealth());
try {
	TimeUnit.SECONDS.sleep(3/2);
} catch (InterruptedException e) {
	e.printStackTrace();
}
while(user1.getHealth() > 0 && computer1.getHealth()> 0) {
if(user1.getHealth() > 0 ) {
	int comattack = user1.attack();
	System.out.println("The Hero, "+user1.getName()+" has taken "+comattack+" damage.");
computer1.setDamage(comattack);
System.out.println(user1.getName()+" now has "+user1.getHealth());
try {
	TimeUnit.SECONDS.sleep(3/2);
} catch (InterruptedException e) {
	e.printStackTrace();
}
}

if(computer1.getHealth() > 0) {
	int heroattack = computer1.attack();
	System.out.println("The opponent, " + computer1.getName() +" has taken " + heroattack + " damage.");
	
user1.setDamage(heroattack);
System.out.println(computer1.getName()+ " now has " + computer1.getHealth());
try {
	TimeUnit.SECONDS.sleep(3/2);
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
    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("F:\\Eclipse - Java\\Sounds\\Laser_Gun-Mike_Koenig-1975537935.wav").getAbsoluteFile());
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
} catch(Exception ex) {
    System.out.println("Error with playing sound.");
    ex.printStackTrace();
}


try {
	TimeUnit.SECONDS.sleep(3/2);
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