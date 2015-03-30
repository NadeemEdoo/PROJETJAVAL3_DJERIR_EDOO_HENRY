package ForMod;

public class Module {
	public Module(){}
		
   private String nom;
   private String abbrev;//abbréviation 
   private String couleur;
   private int nbSeance;//En double pour faciliter les calcules des nb heures de chaque modules dans la class Formation 
   
   public Module(String nom,String abbrev,String couleur,int nbSeance){
	   this.nom = nom;
	   this.abbrev = abbrev;
	   this.couleur= couleur;
	   this.nbSeance=nbSeance;
   }
   
   //Gertters and Setters 

		public String getNom() {
			return nom;
		}
		
		public void setNom(String nom) {
			this.nom = nom;
		}
		
		public String getAbbrev() {
			return abbrev;
		}
		
		public void setAbbrev(String abbrev) {
			this.abbrev = abbrev;
		}
		
		public String getCouleur() {
			return couleur;
		}
		
		public void setCouleur(String couleur) {
			
			this.couleur = couleur;
		}
		
		public int getNbSeance() {
			return nbSeance;
		}
		
		public void setNbSeance(int nbSeance) {
			this.nbSeance = nbSeance;
		}
	 //Affichage    
		 public void afficherModule(){
			 System.out.println(" Le Module : "+getNom()+"\n L'abbréviation : "+ getAbbrev()+"\n la couleur : "+getCouleur()+"\n Nombre de seance : " +getNbSeance());
		 }
		 
}
