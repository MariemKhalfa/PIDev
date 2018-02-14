/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author Mariem
 */
public class Covoiturage {
	private int id;
    private Date date;
    private int nbr_places;
    private int heure_dep;
    private String lieu_dep;
    private String lieu_dest;
    private  int covoitureur;

	public Covoiturage() {
	}

	public Covoiturage(int id, Date date, int nbr_places, int heure_dep, String lieu_dep, String lieu_dest, int covoitureur) {
		this.id = id;
		this.date = date;
		this.nbr_places = nbr_places;
		this.heure_dep = heure_dep;
		this.lieu_dep = lieu_dep;
		this.lieu_dest = lieu_dest;
		this.covoitureur = covoitureur;
	}

	public Covoiturage(Date date, int nbr_places, int heure_dep, String lieu_dep, String lieu_dest, int covoitureur) {
		this.date = date;
		this.nbr_places = nbr_places;
		this.heure_dep = heure_dep;
		this.lieu_dep = lieu_dep;
		this.lieu_dest = lieu_dest;
		this.covoitureur = covoitureur;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getNbr_places() {
		return nbr_places;
	}

	public void setNbr_places(int nbr_places) {
		this.nbr_places = nbr_places;
	}

	public int getHeure_dep() {
		return heure_dep;
	}

	public void setHeure_dep(int heure_dep) {
		this.heure_dep = heure_dep;
	}

	public String getLieu_dep() {
		return lieu_dep;
	}

	public void setLieu_dep(String lieu_dep) {
		this.lieu_dep = lieu_dep;
	}

	public String getLieu_dest() {
		return lieu_dest;
	}

	public void setLieu_dest(String lieu_dest) {
		this.lieu_dest = lieu_dest;
	}

	public int getCovoitureur() {
		return covoitureur;
	}

	public void setCovoitureur(int covoitureur) {
		this.covoitureur = covoitureur;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 53 * hash + this.id;
		hash = 53 * hash + Objects.hashCode(this.date);
		hash = 53 * hash + this.nbr_places;
		hash = 53 * hash + this.heure_dep;
		hash = 53 * hash + Objects.hashCode(this.lieu_dep);
		hash = 53 * hash + Objects.hashCode(this.lieu_dest);
		hash = 53 * hash + this.covoitureur;
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Covoiturage other = (Covoiturage) obj;
		if (this.id != other.id) {
			return false;
		}
		if (this.nbr_places != other.nbr_places) {
			return false;
		}
		if (this.heure_dep != other.heure_dep) {
			return false;
		}
		if (this.covoitureur != other.covoitureur) {
			return false;
		}
		if (!Objects.equals(this.lieu_dep, other.lieu_dep)) {
			return false;
		}
		if (!Objects.equals(this.lieu_dest, other.lieu_dest)) {
			return false;
		}
		if (!Objects.equals(this.date, other.date)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Covoiturage{" + "id=" + id + ", date=" + date + ", nbr_places=" + nbr_places + ", heure_dep=" + heure_dep + ", lieu_dep=" + lieu_dep + ", lieu_dest=" + lieu_dest + ", covoitureur=" + covoitureur + '}';
	}
	
}
