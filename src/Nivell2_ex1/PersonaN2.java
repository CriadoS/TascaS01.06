package Nivell2_ex1;


public class PersonaN2 {
	
	private String nom; 
	private String cognom;
	private int edat;
	
	public PersonaN2(String nom, String cognom, int edat) {
		
		this.nom = nom;
		this.cognom = cognom;
		this.edat = edat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom() {
		return cognom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	@Override
	public String toString() {
		return "Persona [nom=" + this.nom + ", cognom=" + this.cognom + ", edat=" + this.edat + "]";
	} 
	

}
