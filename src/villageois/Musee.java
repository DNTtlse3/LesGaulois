package villageois;
import collection.Trophee;
import personnages.Gaulois;
import equipements.Equipement;

public class Musee {
	
	private Trophee[] pieceDeCollection = new Trophee[200];
	private int nbTrophee = 0;
	
	public void donnerTrophees(Gaulois gaulois, Equipement equipements){
		Trophee remiseObject = new Trophee(gaulois,equipements);
		if(nbTrophee < pieceDeCollection.length) {
			pieceDeCollection[nbTrophee] = remiseObject;
			nbTrophee++;
		}
		else {
			System.out.println("Le musée est déjà bondé de piece de collection");			
		}
		
	}
	
	public Trophee[] getPieceDeCollection() {
		return pieceDeCollection;
		
	
	}

	public int getNbTrophee() {
		return nbTrophee;
	}
}
