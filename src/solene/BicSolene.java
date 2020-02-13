package solene;

public class BicSolene {
	
	//Déclaration des attributs de la Classe BicSolene 
	private Couleur coul;
	private FormeTube trec;
	private CoulCapuche capBleu;
	
//Constructeur par défault
	
	public BicSolene() {}
	
//Constructeur avec des paramètres
	public BicSolene(Couleur encreBleu1,FormeTube trectangle1,CoulCapuche capucbonBleu1) {
		this.coul = encreBleu1;
		this.trec = trectangle1;
		this.capBleu=capucbonBleu1;
		
		}//fin constructeur avec paramètres
	
//Méthode pour Afficher 1 capuchon en fonction de sa couleur
	public void afficheCapuchon() {
		capBleu.coulCapuche();
	}//fin Méthode pour afficher le capuchon en fonction de sa couleur
	

		
//Méthode pour afficher 1 tube en fonction de sa forme
	
	public void afficheFormeTube() {
		trec.formetube();
		
	}//fin Méthode pour afficher 1 tube en fonction de sa forme
	

//Méthode pour afficher  1 encre à la couleur voulue
	public void afficheCouleurEncre() {
		coul.couleur();
		
	}//fin Méthode pour ajouter 1 encre de la couleur voulue
	

//je vais redefinir les méthodes pour fabriquer mon object BicSolene
	
	
	
	
	
	
	
	}//Fin class
	

