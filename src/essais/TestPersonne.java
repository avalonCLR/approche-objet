package essais;

import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		Personne p1 = new Personne("Duruc", "Jean-Michel","rue Alan Turing");

		Personne p2 = new Personne("Gildas", "Philippe", "rue du Pantheon");
		
		System.out.println(p1.toString());
		
		
	}

}
