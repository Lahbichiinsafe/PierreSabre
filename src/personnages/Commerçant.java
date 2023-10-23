package personnages;

public class Commerçant extends Humain {

	public Commerçant(String nom, String fvboisson, int argent) {
		super(nom, "thé", argent);
	}
	
	public int seFaireExtorquer() {
		
		argent = this.getArgent();
		perdreArgent(argent);
		parler(" J'ai tout perdu! Le monde est trop injuste...");
		
		return argent;
		
	}
	
	public void recevoir (int argent) {
		gagnerArgent(argent);
		parler(" " + argent + " sous! Je te remercie généreux donateur!");
	}


	
}
