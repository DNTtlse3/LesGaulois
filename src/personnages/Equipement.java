package personnages;

public enum Equipement {
	
	CASQUE("casque"), BOULCIER("Bouclier");
	
	private String nom;

	private Equipement(String nom) {
		this.nom = nom;
	}
	public String toString() {
		return nom;
	}
	
	public static void main(String[] args) {
		Equipement c;
		c = Equipement.valueOf("CASQUE");
		System.out.println(c);
				
	}
}
