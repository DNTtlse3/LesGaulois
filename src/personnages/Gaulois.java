package personnages;

public class Gaulois {
	
	private String nom;
	private int force;
	private int effetpotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
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
		System.out.println(nom+" envoie un grand coup dans la machoire de "+ romain.getNom());
		romain.recevoirCoup((force/3)*effetpotion);
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetpotion=" + effetpotion + "]";
	}
	public void boirePotion(int forcePotion) {
		parler("Merci Druide je sens que ma force est "+forcePotion+" fois décuplée.");
		effetpotion *= forcePotion*10;
		
	}
	public static void main(String[] args) {
		
		Gaulois gaulois = new Gaulois("Astérix",80);
		System.out.println(gaulois.prendreParole());
		gaulois.parler("Bonjour les blérauds, vous allez bien les gens.");
		Romain romain = new Romain("Jules-Césard",150);
		gaulois.frapper(romain);
		gaulois.boirePotion(5);
		
		
		
	}
	
}