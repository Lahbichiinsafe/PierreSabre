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
	
	
	public void extorquer(Commer�ant victime) {
		parler(" Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		parler(" " + victime.getNom() + ", si tu tiens � la vie donne moi ta bourse !" );
		parler(" J'ai piqu� les " + victime.seFaireExtorquer() + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !" );
	}


	
	
}
