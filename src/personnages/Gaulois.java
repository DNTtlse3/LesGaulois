package personnages;

import equipements.Equipement;
public class Gaulois {
	
	private String nom;
	private int force;
	private int nb_trophees;
	private int effetPotion = 1;
	private Equipement[] trophees = new Equipement[100];
	private String texte;
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.texte = "Le gaulois " + nom + " : "; 
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole()+"<<"+texte+">>");
	}
	
	/*private String prendreParole() {
		return "Le Gaulois " + nom +":";
	}*/
	

	 private String prendreParole() { 
		 return texte; 
	 } 
	
	/*public void frapper(Romain romain) {
		System.out.println(nom+" envoie un grand coup dans la machoire de "+ romain.getNom());
		romain.recevoirCoup((force/3)*effetpotion);
	}*/
	 

	 public void frapper(Romain romain) {
		 System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom()); 
		 romain.recevoirCoup((force  /  3)  * effetPotion);
		 for(int  i  =  0;  trophees  !=  null  &&  i  <  trophees.length;  i++, nb_trophees++) { 
			 this.trophees[nb_trophees] = trophees[i]; 
	 	}  
	 } 

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetpotion=" + effetPotion + "]";
	}
	public void boirePotion(int forcePotion) {
		parler("Merci Druide je sens que ma force est "+forcePotion+" fois décuplée.");
		effetPotion *= forcePotion*10;
		
	}
	public static void main(String[] args) {
		
		Gaulois gaulois = new Gaulois("Astérix",80);
		System.out.println(gaulois.prendreParole());
		gaulois.parler("Bonjour les blérauds, vous aller bien les gens.");
		Romain romain = new Romain("Jules-Céard",150);
		gaulois.frapper(romain);
		gaulois.boirePotion(5);
		
		
		
	}
	
}