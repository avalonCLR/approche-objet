package essais;

import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		
		AdressePostale adr1 = new AdressePostale();
		adr1.numero = 5;
		adr1.adresse = "rue du test";				
		adr1.codePostal = 55000;
		adr1.ville = "Lalande";
		
		AdressePostale adr2 = new AdressePostale();
		adr2.numero = 2;
		adr2.adresse = "rue test aussi";
		adr2.codePostal = 12345;
		adr2.ville = "Turing";
		
		
	}

}
