package villages;
import personnages.Chef;
import personnages.Gaulois;

public class Village {
	
	private String nom;
	private Gaulois[] villageois;
	private int nbVillageois;
	private Chef chef;
	
	public Village(String nom,int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageois = 0;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
		
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois){
		if(nbVillageois < villageois.length) {
			villageois[nbVillageois++] = gaulois;
		}
		else {
			System.out.println("On ne peut plus ajouter de Gaulois.");
		}
		
	}
	
	public Gaulois trouverHabitant(int numeroHabitant) {
		if(numeroHabitant < villageois.length) {
			return villageois[numeroHabitant];
		}
		else
		{
			return null;
		}
	}
	
	public void afficherVillageois(Chef chef) {
		System.out.println("Dans le village du chef "+chef.getNom()+" vivent les légendaires gaulois ");
		for(int k =0 ;k < nbVillageois; k++) {
			System.out.println("-> "+villageois[k].getNom());
		}
		
	}
	
	public static void main(String[] args) {
		
		Village V1 = new Village("Village des Irréductibles",30);
		Chef C1 = new Chef("Abraracourcix",6,V1);
		
		Gaulois Asterix = new Gaulois("Asterix",6);
		Gaulois Obelix = new Gaulois("Obelix",25);
				
		V1.ajouterHabitant(Asterix);
		V1.ajouterHabitant(Obelix);
		V1.afficherVillageois(C1);
		
		
		
		
		
	}
	
}