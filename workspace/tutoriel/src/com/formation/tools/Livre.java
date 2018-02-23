package com.formation.tools;

public class Livre {
	private String titre;
	private String categorie;
	
	public Livre(String titre, String categorie) {
		this.titre = titre;
		this.categorie = categorie;
	}

	public Livre() {
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	

}
