package elderscrolls;

public class Weapon {
	public String Type = "Mace";
	public boolean IsWeaponEquipped = false;
	
	public void ToggleEquip() {
		if (IsWeaponEquipped == false) {
			IsWeaponEquipped = true;
		}
		else if (IsWeaponEquipped == true) {
			IsWeaponEquipped = false;
		}
	}

}
