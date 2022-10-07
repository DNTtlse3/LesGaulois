package personnages;

public class Romain {
	
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole()+"<< "+ texte +" >>");
		
	}
	
	public int getForce() {
	
		return force;
	}
	
	private String prendreParole() {
		return "Le romain "+ nom + ": ";
	}
	
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if(force > 0) {
			parler("aîe");
		}
		else {
			parler("j'abandonne...");
		}
	}
	
}