package com.formation.tools;

public class Utilisateur {
	private String nom;
	private String mdp;
	
	public Utilisateur(String nom, String mdp) {
		this.nom = nom;
		this.mdp = mdp;
	}
	

	public Utilisateur() {
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	
}
