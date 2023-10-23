package histoire;

import personnages.Commerçant;
import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		
	
	Humain humain = new Humain("Prof" , "kombucha" , 54);
	
	humain.direBonjour();
	humain.acheter("une boisson", 12);
	
	humain.boire();
	
	humain.acheter("un  jeu", 2);
	
	humain.acheter("un kimono", 50);
	
	
	
	Commerçant commercant = new Commerçant("Marco" , "thé" , 20);
	
	commercant.direBonjour();
	
	commercant.seFaireExtorquer();
	commercant.recevoir(15);
	commercant.boire();
	
	}
	
}
