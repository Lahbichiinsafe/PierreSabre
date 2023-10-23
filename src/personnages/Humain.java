package personnages;

public class Humain {
	private String nom;
	private String fvboisson;
	protected int argent;
	
	
	
	public Humain(String nom, String fvboisson, int argent) {
		super();
		this.nom = nom;
		this.fvboisson = fvboisson;
		this.argent = argent;
	}
	
	
	public String getNom() {
		return nom;
	}
	public String getFvboisson() {
		return fvboisson;
	}
	public int getArgent() {
		return argent;
	}
	
	
	
	
	public void parler(String texte) {
		System.out.println("(" + this.nom + ")" + "-" + texte  );
	}
	public void direBonjour() {
		parler(" Bonjour! Je m'appelle " + this.nom + " et j'aime boire du " + this.fvboisson + ".");
	}	
	
	
	
	public void acheter(String bien , int prix) {
		
		if (this.argent >= prix) {
			parler(" J'ai " + this.argent +" sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
			perdreArgent(prix);
		}
		else {
			parler(" Je n'ai plus que " + this.argent + " sous en poche. Je ne peux meme pas m'offrir " + bien + " à " + prix + " sous.");
		}
	}
	
	
	public void boire() {
		parler(" Mmmm, un bon verre de "+ this.fvboisson + "! GLOUPS !" );
	}
	
	
	public void gagnerArgent(int gain) {
		argent += gain;
	}
	public void perdreArgent(int perte) {
		argent-= perte;
	}
	
	
	
	
	
}
