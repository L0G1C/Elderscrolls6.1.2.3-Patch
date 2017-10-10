package elderscrolls;
import java.util.Random;

public class Map {
	public String Explore(boolean isWeaponEquipped) {
		String travel[] = new String[4];
		travel[0] = "You explore the battlefield and find a dead wood elf bearing a high ranking officer's symbol. \n";
		travel[1] = "You run into an angry Hoarvor, but your weapon is unequipped so it kills you. \n";
		travel[2] = "You run into a group of bandits, luckily you have your sword out and you slay them. \n";
		travel[3] = "You find a dying Bosmer soldier, he looks to be in great pain and is begging you to help him. \n";
		
		Random rand = new Random();
		
		if(isWeaponEquipped == false) {
			int ranNum = rand.nextInt(3);
			if(ranNum == 1) {
				return travel[1];
			}
			if(ranNum == 2) {
				return travel[0];
			}
		}
		
		if(isWeaponEquipped == true) {
			int ranNum = rand.nextInt(3);
			if(ranNum == 1) {
				return travel[2];
			}
			if(ranNum == 2) {
				return travel[3];
			}
			
		}
		
		return "";
		
	}

}
