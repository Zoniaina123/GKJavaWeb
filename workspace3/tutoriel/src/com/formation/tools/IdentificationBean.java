package com.formation.tools;

import java.io.Serializable;

public class IdentificationBean implements Serializable {
	private String nom;
	private String prenom;
	private String email;
	private String login;
	private String mdp;
	
	public IdentificationBean() {
		
	};
	public IdentificationBean(String nom, String prenom,String email,String login, String mpd) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.login = login;
		this.mdp = mpd;
		
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	

}
