package personnages;

import java.util.*;

public class Druide {

	private String nom;
	private int forcePotion = 1;
	private int effetPotionMin;
	private int effetPotionMax;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;

		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " Ã  "
				+ effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "Â« " + texte + "Â»");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public void preparerPotion() {
		Random rand = new Random();
		forcePotion = rand.nextInt(effetPotionMax - effetPotionMin);
		forcePotion += effetPotionMin;
		if (forcePotion > 7) {
			parler("J'ai préparé une super potion de force " + forcePotion);

		} else {
			parler("Je n'ai pas trouvé tous les ingrédients, ma potion est de force " + forcePotion);
		}
	}

	public void booster(Gaulois gaulois) {
		if ("Obélix" == gaulois.getNom()) {

			parler("Non, Obélix !... Tu n'auras pas de potion magique ! ");
		} else {
			preparerPotion();
			gaulois.boirePotion(forcePotion);

		}

	}

	public static void main(String[] args) {

		Druide Panoraminx = new Druide("Panoraminx", 5, 10);

		Gaulois gaulois = new Gaulois("Obélix", 5);
		Panoraminx.booster(gaulois);
	}

}