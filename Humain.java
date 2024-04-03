package iut.bad;

public class Humain implements Consommation {

	protected String nom;
	protected String prenom;
	protected int age;
	
	

	public Humain() {
		super();
	}
	
	public Humain(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void details() {
        System.out.println("Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age);
    }

	 @Override
	 public String toString() {
	        return "Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age;
	    }

	public void ami( Humain h, int dure) {
		System.out.println(this.getNom() + " et " + h.getNom() + " sont amis pour une duréé de"+dure+"jours");
	}
	
	public void ami(Humain h) {
		ami(h,100);
	}

	@Override
	public void manger() {
				
	}

	@Override
	public void boire() {
		
	}
	 
}