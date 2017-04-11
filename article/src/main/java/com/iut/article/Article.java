package com.iut.article;

import java.util.*;

public class Article {

	private int id;
	private String nom;
	private String description;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public List<String> getInfo() {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Processeur");
		list.add("Disque dur");
		
		return list;
		
	}
}
