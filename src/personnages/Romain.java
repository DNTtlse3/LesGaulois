package personnages;

import equipements.Equipement;

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
		System.out.println(prendreParole() + "<< " + texte + " >>");

	}

	public int getForce() {

		return force;
	}

	private String prendreParole() {
		return "Le romain " + nom + ": ";
	}

	/*
	 * public void recevoirCoup(int forceCoup) {
	 * 
	 * assert forceCoup > 0;
	 * 
	 * int forceInitial = force; force -= forceCoup; if(force > 0) { parler("aîe");
	 * } else { parler("j'abandonne..."); } assert forceInitial > force; }
	 */

	private void mesEquipements(Equipement equipements) {

		if (nbEquipement < 1) {
			ajouterEquipement(equipements);
		} else {
			if (equipement[nbEquipement - 1] == equipements) {
				parler("posséde déjà un " + equipements);
			} else {
				ajouterEquipement(equipements);
			}
		}
	}

	private void ajouterEquipement(Equipement equipements) {
		parler("s'équipe avec un " + equipements);
		equipement[nbEquipement] = equipements;
		nbEquipement++;
	}

	public void sEquiper(Equipement equipements) {

		switch (nbEquipement) {

		case 0:
			mesEquipements(equipements);
			break;

		case 1:
			mesEquipements(equipements);
			break;
		default:
			parler("Le soldat " + getNom() + " est bien protégé");
			break;
		}

	}

	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;
		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup;
		// if (force > 0) {
		// parler("Aïe");
		// } else {
		// equipementEjecte = ejecterEquipement();
		// parler("J'abandonne...");
		// }
		switch (force) {
			case 0:
					parler("Aïe");
					break;
			case 1:
					parler("Bon dié, out zot li sont dans bonne condition, mayday");
					break;
			case 2:
					parler("Oh nooooon mon coeur saigne!");
					break;
			default:
				equipementEjecte = ejecterEquipement();
				parler("J'abandonne...");
				break;
		}
		// post condition la force à diminuer
		assert force < oldForce;
		return equipementEjecte;

	}

	private int calculResistanceEquipement(int forceCoup) {
		String texte = "Ma force est  de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if ((nbEquipement != 0)) {
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
			for (int i = 0; i < nbEquipement;i++) {
				if ((equipement[i] != null && equipement[i].equals(Equipement.BOUCLIER))) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}
			}
			texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
	}

	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement  de  " + nom.toString() + "s'envole sous la force du coup.");
		// TODO
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {

			if (equipement[i] == null) {
				continue;
			} else {
				equipementEjecte[nbEquipementEjecte] = equipement[i];
				nbEquipementEjecte++;
				equipement[i] = null;
			}
		}
		return equipementEjecte;
	}

	public static void main(String[] args) {
		Romain romain = new Romain("Vantouse", 46);
		System.out.println(romain.prendreParole());
		romain.parler("Ne parlez point de cette fripouille, son change m'indigne.");
		romain.recevoirCoup(23);
		Equipement c1;
		Equipement c2;
		c1 = Equipement.BOUCLIER;
		c2 = Equipement.CASQUE;
		romain.sEquiper(c1);
		romain.sEquiper(c1);
		romain.sEquiper(c2);
		romain.sEquiper(c2);

	}

}