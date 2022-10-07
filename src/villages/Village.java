package villages;
import personnages.Chef;
import personnages.Gaulois;

public class Village {
	
	private String nom;
	private int nbVillageoisMaximum;
	private int nbVillageois = 0;
	private Gaulois[] villageois;
	private Chef chef;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;
		this.villageois = new Gaulois[nbVillageoisMaximum];
		
	}
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		if( nbVillageois < villageois.length){
			villageois[nbVillageois++] = gaulois;
		}
		else {
			System.out.println("Vous ne pouvez plus ajouter de villageois.");
		}
	}
	
	public Gaulois trouverHabitant(int numeroVillageois) {
		if(numeroVillageois < nbVillageoisMaximum) {
			return villageois[numeroVillageois];
		}
		else{
			return null;
		}
	
	}
	
	public void afficherVillageois() {
		
	}
	
	public static void main(String[] args) {
		Village v1;
		v1 = new Village("Village des Irréductibles",30);
		
		/*Gaulois gaulois = village.trouverHabitant(30);*/
		//Gaulois gaulois permet de faire une instance de classe, d'ou création d'un objet.
		//village n'est pas compatible avec Village car se sont deux classe différent.
		Chef c1 = new Chef("Abraracourcix",500,7,v1);
		Gaulois g1 = new Gaulois("gaulois Astérix",5,30);
		
		v1.ajouterHabitant(g1);
		Gaulois gaulois = v1.trouverHabitant(0);
		
		System.out.println(gaulois);
		
		//Il y a affichage des valeurs du constructeurs gaulois.
		
		
	}
	
	
}