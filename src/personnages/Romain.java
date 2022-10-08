package personnages;

public class Romain {
	
	private String nom;
	private int force;
	private Equipement[] equipement;
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.equipement = new Equipement[2];
		
		assert force > 0;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole()+"<< " + texte + " >>");
		
	}
	
	public int getForce() {
	
		return force;
	}
	
	private String prendreParole() {
		return "Le romain "+ nom + ": ";
	}
	
	public void recevoirCoup(int forceCoup) {
		
		assert forceCoup > 0;
		
		int forceInitial = force;
		force -= forceCoup;
		if(force > 0) {
			parler("aïe");
		}
		else {
			parler("j'abandonne...");
		}
		assert forceInitial > force;	
	}
	
	private void mesEquipements(Equipement equipements) {
		
		if(nbEquipement > 1) {
			parler("Le soldat "+getNom()+" est bien protégé");
		}
		else {
			if(nbEquipement < 1) {
				parler("s'équipe avec un "+equipements);
				equipement[nbEquipement++] = equipements;
			}
			else {
				if(equipement[nbEquipement-1] == equipements) {
					parler("possède déjà un "+equipements);
				}
				else {
					parler("s'équipe avec un "+equipements);
					equipement[nbEquipement++] = equipements; 
				}
			}
		}
	}
		
	public void sEquiper(Equipement equipements) {
		
			switch(nbEquipement) {
			
				case 0:
						mesEquipements(equipements);
						break;
					
				case 1:
						mesEquipements(equipements);
						break;
				default:
						parler("est déjà bien equipé");
						break;
			}
		
	}

	public static void main(String[] args){
		Romain romain = new Romain("Vantouse",46);
		System.out.println(romain.prendreParole());
		romain.parler("Ne parlez point de cette fripouille, son change m'indigne.");
		romain.recevoirCoup(23);
		Equipement c1;
		Equipement c2;
		c1 = Equipement.BOULCIER;
		c2 = Equipement.CASQUE;
		romain.sEquiper(c1);
		romain.sEquiper(c1);
		romain.sEquiper(c2);
		romain.sEquiper(c2);
		
		
	}
	
}