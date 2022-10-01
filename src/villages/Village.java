package villages;

public class Village {
	
	private String Nom;
	private int numeroVillage;
	
	public Village(String nom, int numeroVillage) {
		super();
		Nom = nom;
		this.numeroVillage = numeroVillage;
	}
	
	public String getNom() {
		return Nom;
	}


	public void setNom(String nom) {
		Nom = nom;
	}

	public int getNumeroVillage() {
		return numeroVillage;
	}
	
	public void setNumeroVillage(int numeroVillage) {
		this.numeroVillage = numeroVillage;
	}

	@Override
	public String toString() {
		return "Village [Nom=" + Nom + ", numeroVillage=" + numeroVillage + "]";
	}
	
	
	
	
	
	
	

}