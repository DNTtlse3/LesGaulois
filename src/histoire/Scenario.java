package histoire;
import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;
public class Scenario {

	public static void main(String[] args) {
		
		Druide Panoraminx = new Druide("Panoraminx",5,10);
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
	}

}
