package donnee;
import collection.*;
import villageois.Musee;

public class TraitementDonnees {
	
	public String extraireInstructionsCaml(Musee musee) {
		int i = 0;
		
		Trophee[] collection = musee.getPieceDeCollection();
		
		StringBuilder texteoOcaml = new StringBuilder();
	
		texteoOcaml.append("let musee = [");
		
		for(int k=0; k < musee.getNbTrophee()-1;k++)
		{
			texteoOcaml.append("\""+collection[k].donnerNom()+"\""+","+"\""+collection[k].getEquipements()+"\""+";");
			
		}
		
		texteoOcaml.append("\""+collection[musee.getNbTrophee()-1].donnerNom()+"\""+","+"\""+collection[musee.getNbTrophee()-1].getEquipements()+"\""+"]");
		return texteoOcaml.toString();
	}
	
}
