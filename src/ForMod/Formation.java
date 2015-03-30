package ForMod;


import ForMod.Module;
   public class Formation {
	
	public Formation (){}
	   
		private String nom;
		private Double  dureeSeance;
		private Module[] tabModule;
		private Double[] tabNbHeure; //Utilisation du Double 0,5 = 30mn !!! pas la bonne solution (Time)
		int nbSeance;
	     
    public Formation(String nom,Double  dureeSeance,Module[] tabModule,Double[] tabNbHeure){
	  
		  this.nom = nom;
		  this.dureeSeance=dureeSeance;
		  this.tabModule=tabModule;
		  this.tabNbHeure=tabNbHeure;
	  }
	//Gertters and Setters 
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Double getDureeSeance() {
		return dureeSeance;
	}
	
	public void setDureeSeance(Double dureeSeance) {
		this.dureeSeance = dureeSeance;
	}
	
	public Module[] getTabModule() {
		return tabModule;
	}
	
	public void setTabModule(Module[] tabModule) {
		this.tabModule = tabModule;
	}
	
	public Double[] getTabNbHeure() {
		for (int i = 0;i<tabModule.length;i++){
			nbSeance = getTabModule()[i].getNbSeance();
			tabNbHeure[i] = ( (double) nbSeance) * getDureeSeance();
		}
		return tabNbHeure;
	}
	
	public void setTabNbHeure(Double[] tabNbHeure) {
		this.tabNbHeure = tabNbHeure;
	}
	  
   //Affichage des Modules 
	public void afficherLesModules(Module[] tabModule,Double[] tabNbHeure){
		for (int i = 0;i<tabModule.length;i++){
			System.out.println("\nle module "+ (i+1));
			tabModule[i].afficherModule();
			double j = tabNbHeure[i];
			System.out.println(" Durée du module "+ j);
			
		}
	
		
	}
	//Affichage de la formation:
	public void afficherFormation(){
		System.out.println(" \nLa Formation : "+getNom());
		System.out.println(" Durée type d'une seance "+getDureeSeance());
		System.out.println(" Les Module :");
		afficherLesModules(getTabModule(),getTabNbHeure());
		
	}
  
  
}