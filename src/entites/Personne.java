package entites;

public class Personne {

	public String nom = "";
	public String prenom = "";
	public String adressePostale = "";

	public Personne(String nom, String prenom, String adresse) {
		this.nom = nom;
		this.prenom = prenom;
		setAdressePostale(adresse);
	}

//	public Personne(String nom, String prenom, String adressePostale) {
//		this.nom = nom;
//		this.prenom = prenom;
//		this.adressePostale = adressePostale;
//	}

	public String toString() {
		return " Nom "+nom.substring(0,1).toUpperCase()+nom.substring(1).toLowerCase()+" Prenom "+prenom+adressePostale;
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

	
	
	
}
