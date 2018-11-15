package entites;

public class AdressePostale {

	public int numero = 0;
	public String adresse = "";
	public int codePostal = 0;
	public String ville = "";
	
	public AdressePostale(int numero, String adresse, int codePostal, String ville) {
		
		this.numero = numero;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		
	}
	
}
