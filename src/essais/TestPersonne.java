package essais;

import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		Personne p1 = new Personne();
		p1.nom = "Duruc";
		p1.prenom = "Jean-Michel";
		p1.adressePostale = "rue Alan Turing";

		Personne p2 = new Personne();
		p2.nom = "Gildas";
		p2.prenom = "Philippe";
		p2.adressePostale = "rue du panthéon";
		
	}

}
