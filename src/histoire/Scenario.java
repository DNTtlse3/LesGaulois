package histoire;
import personnages.Druide;
import equipements.Equipement;
import personnages.Gaulois;
import personnages.Romain;
import villageois.Musee;

public class Scenario {

	public static void main(String[] args) {
		
		
		
		Druide druide = new Druide("Panoramix", 5, 10);
		druide.parler("Je vais aller préparer une petite potion...");
		druide.preparerPotion();
		Gaulois obelix = new Gaulois("Obélix", 25);
		Gaulois asterix = new Gaulois("Astérix", 8);
		druide.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		druide.booster(asterix);
		asterix.parler("Bonjour");
		Romain minus = new Romain("Minus", 6);
		Romain milexcus = new Romain("Milexcus", 8);
		
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		milexcus.sEquiper(Equipement.CASQUE);
		
		minus.parler("UN GAU... UN GAUGAU...");
		do {
			asterix.frapper(minus);
		} while (minus.getForce() > 0);
		milexcus.parler("UN GAU... UN GAUGAU...");
		do {
			asterix.frapper(milexcus);
			
		} while (milexcus.getForce() > 0);
		//Musee musee = new Musee();
		//asterix.faireUneDonnation(musee);
		
		/*Druide Panoraminx = new Druide("Panoraminx",5,10);
		Gaulois Asterix = new Gaulois("Astèrix",8);
		Gaulois Obelix = new Gaulois("Obélix",50); 
		Romain romain = new Romain("Minus",6);
		
		Panoraminx.parler("Je vais aller préparer une petite potion...");
		Panoraminx.preparerPotion();
		Panoraminx.booster(Obelix);
		Obelix.parler("Par Bélénos, ce n'est pas juste");
		Panoraminx.booster(Asterix);
		Asterix.parler("Bonjour à toutes et à tous...");
		romain.parler("Oooooh un Gau... Un GauGau..");
		for(int k =0; k < 3; k++)
		{
			Asterix.frapper(romain);
		}
	}*/

	}
	
}
