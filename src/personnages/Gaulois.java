package personnages;

import villageois.Musee;
import equipements.Equipement;
import histoire.Scenario;


public class Gaulois {
	
	private String nom;
	private int force;
	private int nbtrophees;
	private int effetPotion = 1;
	private Equipement[] trophees = new Equipement[100];
	private String texte;
	
	
	public Gaulois(String nom, int force) {
		super();
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
		 
		 parler("J'envoie un grand coup dans la mâchoire de " + romain.getNom()); 
		 
		 Equipement[] equipementEjecte = romain.recevoirCoup((force  /  3)  * effetPotion);
		 
		 for(int  i  =  0;  equipementEjecte  !=  null  &&  i  <  equipementEjecte.length;  i++, nbtrophees++) { 
			 
			 this.trophees[nbtrophees] = equipementEjecte[i]; 
	 	}
	 } 

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetpotion=" + effetPotion + "]";
	}
	
	
	public void boirePotion(int forcePotion) {
		parler("Merci Druide je sens que ma force est "+forcePotion+" fois décuplée.");
		effetPotion *= forcePotion;
		
	}
	
	public void faireUneDonnation(Musee musee) {
		if(nbtrophees > 0) {
			
			parler("Je donne au musee tous mes trophées");
			
			for(int k=0;k<nbtrophees;k++) {
				
				if(trophees[k] != null) {
					
					parler("- "+this.trophees[k]);
					
					musee.donnerTrophees(this,trophees[k]);
					
					trophees[k] = null;
				}
			}
			
		}
		else {
			parler("Actuellement, je ne peux faire de donnation d'objets");
		}
	}
	
	public static void main(String[] args) {
		
		Gaulois gaulois = new Gaulois("Astérix",80);
		System.out.println(gaulois.prendreParole());
		gaulois.parler("Bonjour les blérauds, vous aller bien les gens.");
		Romain romain = new Romain("Jules-Césard",150);
		gaulois.frapper(romain);
		gaulois.boirePotion(5);
		
		
		
		
	}
	
}