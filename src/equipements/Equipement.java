package equipements;

public enum Equipement {
	
	BOUCLIER("Bouclier"),CASQUE("Casque");
	
	private String nom;

	private Equipement(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return nom;
	}
}
