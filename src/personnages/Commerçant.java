package personnages;

public class Commer�ant extends Humain {

	public Commer�ant(String nom, String fvboisson, int argent) {
		super(nom, "th�", argent);
	}
	
	public int seFaireExtorquer() {
		
	
		perdreArgent(this.getArgent());
		parler(" J'ai tout perdu! Le monde est trop injuste...");
		
		return argent;
		
	}
	
	public void recevoir (int argent) {
		gagnerArgent(argent);
		parler(" " + argent + " sous! Je te remercie g�n�reux donateur!");
	}


	
}
