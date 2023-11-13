package personnages;

public class Yakuza extends Humain {
	
	private String clan;
	private int reputation = 0;

	
	
	public Yakuza(String nom, String fvboisson, int argent, String clan, int reputation) {
		super(nom, fvboisson, argent);
		this.clan = clan;
		this.reputation = reputation;
	}



	public Yakuza(String nom, String fvboisson, int argent , String clan ) {
		super(nom, fvboisson, argent);
	}
	
	
	public String getClan() {
		return clan;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	
	public void extorquer(Commerçant victime) {
		parler(" Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(" " + victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !" );
		parler(" J'ai piqué les " + victime.seFaireExtorquer() + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !" );
	}
	
	public int perdre() {
		int arg = getArgent();
		perdreArgent(arg);
		reputation = reputation-1;
		
		parler("J’ai perdu mon duel et mes " + arg + " sous, snif... J'ai déshonoré le clan de " + getClan());
		
		return getReputation();
	}
	
	public void gagner(int gain) {
		gagnerArgent(gain);
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + getClan() + " ? Je l'ai dépouillé de ses " + gain + "sous");
	}
	
	//


	
	
}
