package solene;

public class BicSolene {
	
	//D�claration des attributs de la Classe BicSolene 
	private Couleur coul;
	private FormeTube trec;
	private CoulCapuche capBleu;
	
//Constructeur par d�fault
	
	public BicSolene() {}
	
//Constructeur avec des param�tres
	public BicSolene(Couleur encreBleu1,FormeTube trectangle1,CoulCapuche capucbonBleu1) {
		this.coul = encreBleu1;
		this.trec = trectangle1;
		this.capBleu=capucbonBleu1;
		
		}//fin constructeur avec param�tres
	
//M�thode pour Afficher 1 capuchon en fonction de sa couleur
	public void afficheCapuchon() {
		capBleu.coulCapuche();
	}//fin M�thode pour afficher le capuchon en fonction de sa couleur
	

		
//M�thode pour afficher 1 tube en fonction de sa forme
	
	public void afficheFormeTube() {
		trec.formetube();
		
	}//fin M�thode pour afficher 1 tube en fonction de sa forme
	

//M�thode pour afficher  1 encre � la couleur voulue
	public void afficheCouleurEncre() {
		coul.couleur();
		
	}//fin M�thode pour ajouter 1 encre de la couleur voulue
	

//je vais redefinir les m�thodes pour fabriquer mon object BicSolene
	
	
	
	
	
	
	
	}//Fin class
	

