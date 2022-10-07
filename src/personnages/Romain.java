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
			parler("aïe");
		}
		else {
			parler("j'abandonne...");
		}
	}
	public static void main(String[] args){
		Romain romain = new Romain("Vantouse",50);
		System.out.println(romain.prendreParole());
		romain.parler("Ne parlez point de cette fripouille, son change m'indigne.");
		romain.recevoirCoup(23);
		
	}
	
}