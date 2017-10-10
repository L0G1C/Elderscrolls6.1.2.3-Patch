package elderscrolls;
import java.io.IOException;
import java.util.Scanner;
public class program {

	public static void main(String[] args) {		
		Weapon myWeapon = new Weapon();	
		Map battleMap = new Map();
		Scanner userInputScanner = new Scanner(System.in);
		
		System.out.println("Main Program started! Welcome to the world of Elder Scolls 6!\n");
		
		// We're starting a While Loop here to do everything that follows over and over forever (until the suer presses 3 to quit and exit).
        while (true) {
        	// For extra credit, you can get this description of the field we're exploring from the Map class you will create (see below).
        	// Maybe put a couple different descriptions in an array, and get a different description every time we call the Explore() method?
    		System.out.println("You see a wide open field with remnants of a large-scale battle littered throughout.\n"
    				+"What do you do?\n"
    				+" 1. Explore\n"
    				+" 2. Toggle Weapon\n"
    				+" 3. Quit\n"
    				+"------------------------------------------------------------------------\n\n"
    				);
    		
    		// This scanner is where we get the user input from
        	String input = userInputScanner.nextLine();                  	
        	
        	// Switch statements let you read a variable (input, in this case) and do something depending on what's in it.
        	// In our program, "input" will either be 1, 2, or 3, so that is our 3 cases.
        	switch(input) {
			case "1": 
				System.out.println(battleMap.Explore(myWeapon.IsWeaponEquipped));
				// Note: Use our Weapon class and how I use it below (if the user input is "2") as an example.
				break;
				
			case "2": 
				myWeapon.ToggleEquip();
				
				if (myWeapon.IsWeaponEquipped == true) {
					System.out.println("Your weapon is equipped\n");
				}
				else if (myWeapon.IsWeaponEquipped == false) {
					System.out.println("Your weapon is not equipped\n");
				}
				break;
				
			case "3": 
				System.exit(1);
				
			default:
				System.out.println("Incorrect input, must be 1, 2, or 3!\n");
				break;
			}
        }
	      
	}

}