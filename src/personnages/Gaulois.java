package personnages;

public class Gaulois {
	
	private String nom;
	private int force;
	private int effetpotion = 1;
	
	public Gaulois(String nom, int force, int effetpotion) {
		super();
		this.nom = nom;
		this.force = force;
		this.effetpotion = effetpotion;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole()+"<<"+texte+">>");
	}
	
	private String prendreParole() {
		return "Le Gaulois " + nom +":";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom+" envoie un grand coup dans la mâchoire de "+ romain.getNom());
		romain.recevoirCoup(force/3);
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetpotion=" + effetpotion + "]";
	}
	public static void main(String[] args) {
		
		Gaulois gau1;
		Romain rom1;
		gau1 = new Gaulois("clement",25,1);
		rom1 = new Romain ("alex",15);
		
		gau1.frapper(rom1);
		System.out.println("Voila la force de "+rom1.getNom()+"aprés le coups de "+gau1.getNom());
		System.out.println(rom1.getForce());
		
	}
	
}