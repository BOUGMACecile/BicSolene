package solene;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		/**	
		 * Pour les lignes suivantes le code permet de cr�er mes objets sans interactions avec l'utilisateur	
		**
//cr�ation des  objets bic rect ou bic ovale
			
//Cr�ation d'encre bleu
			
			Couleur encreBleu = new EncreBleu();
			
//Cr�ation de forme du tube
			FormeTube trectang = new Trectangle();
			
// Cr�aton d'1 tube ovale
			FormeTube tovale = new TOvale();
//Cr�ation de capuche bleu
			
			CoulCapuche capuBleu1 = new CapucbonBleu();

//Cr�ation d'1 BicSolene rectanguaire avec  1 encre et une capuche bleue
			
			BicSolene bicRectangulaire = new BicSolene(encreBleu,trectang,capuBleu1);
			
//Cr�ation d'1 BicSolene ovale avec  1 encre et une capuche bleue
			BicSolene bicOvale = new BicSolene(encreBleu,tovale,capuBleu1);
			
			 * Dans 1 premier temps, je cr�e mon bic sans inter actions avec 1 utilisateur

//Mantenant appeler les fonctions pour afficher les propri�t�s de mes objets
			
			System.out.print("Je suis 1 bic � l\'" );
		bicRectangulaire.afficheCouleurEncre();
		bicRectangulaire.afficheCapuchon();
		bicRectangulaire.afficheFormeTube();
			System.out.println("***************************");
			System.out.print("Je suis 1 bic � l\'" );	
			bicOvale.afficheCouleurEncre();
			bicOvale.afficheCapuchon();
			bicOvale.afficheFormeTube();
			
	*/
//fin du code qui  permet de cr�er mes objets sans interactions avec l'utilisateur
		
// 2�me partie, je vais essayer d'inter agir avec l'utilisateur//La saisie de caract�re crache le programmme,
		//cela n'est pas encore g�r�
		
		Couleur couleurEncre = null;
		FormeTube tubeForme =null;
		CoulCapuche couleurCapuchon = null;
		
//Choisir la couleur de l'encre
	System.out.println("Choisir: 1- Encre Bleu,"
			+ "2- Encre Noir" );
		Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
				if(i==1)
				{
					 couleurEncre = new EncreBleu ();	
				
				}	else{if(i==2) {
					 couleurEncre = new EncreNoir ();
				}else {
						System.out.println("Erreurchoix!");
						System.exit(0);
				}
					
				}
    
	//Choisir la forme du tube
				System.out.println("Choisir: 1- Tube rectangulaire,"
						+ "2- Tube Ovale" );
					Scanner sc2 = new Scanner(System.in);
						int i2 = sc.nextInt();
							if(i2==1)
							{
								tubeForme = new Trectangle ();	
							
							}	else{if(i2==2) {
								tubeForme = new TOvale ();
							}else {
									System.out.println("Erreurchoix!");
									System.exit(0);
							}
								
							}  
		
//Choisir la couleur du capuchon
							System.out.println("Choisir: 1- Capuchon Bleu,"
									+ "2- Capuchon Noir" );
								Scanner sc3 = new Scanner(System.in);
									int i3 = sc.nextInt();
										if(i3==1)
										{
											couleurCapuchon = new CapucbonBleu();	
										
										}	else{if(i3==2) {
											couleurCapuchon = new CapuchonNoir();
										}else {
												System.out.println("Erreurchoix!");
												System.exit(0);
										}
											
										}  
		if(couleurEncre!=null && tubeForme!=null && couleurCapuchon!= null ) {
// Cr�ation r�lle de mon objet BicSolene
										
			BicSolene bicsolene = new BicSolene(couleurEncre,tubeForme,couleurCapuchon);

//Afficher le BicSolene cr��

//Mantenant appeler les fonctions pour afficher les propri�t�s de mes objets

			System.out.print("Je suis 1 bic � l\'" );
			bicsolene.afficheCouleurEncre();
			bicsolene.afficheCapuchon();
			bicsolene.afficheFormeTube();
	}	else {
		System.out.println("Votre choix est mauvais!");
	}
	}// fin m�thode main


}//fin class
