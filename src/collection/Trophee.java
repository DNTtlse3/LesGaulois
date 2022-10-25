package collection;

import equipements.Equipement;
import personnages.Gaulois;

public class Trophee {
	
	private Gaulois gaulois;
	private Equipement equipements;
	
	public Trophee(Gaulois gaulois, Equipement equipements) {
		this.gaulois = gaulois;
		this.equipements = equipements;
	}

	public Gaulois getGaulois() {
		return gaulois;
	}

	public Equipement getEquipements() {
		return equipements;
	}
	
	public String donnerNom() {
		return gaulois.getNom();
	}
	
}
