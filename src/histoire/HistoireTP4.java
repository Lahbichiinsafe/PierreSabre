package histoire;

import personnages.Commer�ant;
import personnages.Humain;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		
	
	Humain humain = new Humain("Prof" , "kombucha" , 54);
	
	humain.direBonjour();
	humain.acheter("une boisson", 12);
	
	humain.boire();
	
	humain.acheter("un  jeu", 2);
	
	humain.acheter("un kimono", 50);
	
	
	
	Commer�ant commercant = new Commer�ant("Marco" , "th�" , 20);
	
	commercant.direBonjour();
	
	//commercant.seFaireExtorquer();
	//commercant.recevoir(15);
	//commercant.boire();
	
	
	
	
	Yakuza yakuza = new Yakuza("Yaku Le Noir" , "whisky" , 30 , "Warsong" );
	
	
	yakuza.direBonjour();
	
	yakuza.extorquer(commercant);
	
	}
	
}
