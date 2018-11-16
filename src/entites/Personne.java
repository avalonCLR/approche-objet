package entites;

import java.util.Calendar;

public class Personne {

	public String nom = "";
	public String prenom = "";
	public String adressePostale = "";

	public int anneeNaissance = 0;
	
	public Personne() {
		
	}

	public Personne(String nom, String prenom, String adressePostale) {
		this.nom = nom;
		this.prenom = prenom;
		this.adressePostale = adressePostale;
	}

	public Personne(int anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}

	public String toString() {
		return " Nom " + nom.toUpperCase()+ " Prenom " + prenom + " "	+ adressePostale;
	}

	public String toStringAge() {
		return anneeNaissance+" "+getAge();
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdressePostale() {
		return adressePostale;
	}

	public void setAdressePostale(String adressePostale) {
		this.adressePostale = adressePostale;
	}

	public int getAnneeNaissance() {
		return anneeNaissance;
	}

	public void setAnneeNaissance(int anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}

	public int getAge() {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int age = year - getAnneeNaissance();
		return age;
	}
}
