  public class Ronin extends Humain {

	private int honneur = 1;
	private int force;
    
	public Ronin(String nom, String fvboisson, int argent) {
		this(nom, fvboisson, argent, 1);
	}
	
	public Ronin(String nom, String fvboisson, int argent, int force) {
		super(nom, fvboisson, argent);
		this.force = force;
	}

	public int getHonneur() { 
        return honneur; 
        }
	
	public void donner(Commercant beneficiaire) {
		int don = getArgent() / 10;
		parler(beneficiaire.getNom() + ", prends ces " + don + "sous");
		perdreArgent(don);
		beneficiaire.recevoir(don);
	}
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		
		if(force >= adversaire.getReputation()) {
			parler("Je t’ai eu petit yakusa!");
			adversaire.perdre();
		}
		else {
			int argent = getArgent();
			
			adversaire.gagner(argent);
			
			honneur--;
			perdreArgent(argent);
			
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
		}
	}
	
}
