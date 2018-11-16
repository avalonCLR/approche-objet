package essais;

import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		Personne p1 = new Personne("Duruc", "Jean-Michel","rue Alan Turing");

		Personne p2 = new Personne("Gildas", "Philippe", "rue du Pantheon");
		
		System.out.println(p1.toString());
		
		Personne p3 = new Personne();
		p3.setNom("Doe");
		p3.setPrenom("John");
		p3.setAdressePostale("test adresse");
		p3.setAnneeNaissance(1980);
		
		System.out.println(p3.toString());
		
		System.out.println(p3.toStringAge());
		
		System.out.println(p3.getAge());
		
		
	}

}
