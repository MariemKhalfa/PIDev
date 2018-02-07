/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;

import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

/**
 *
 * @author Mariem
 */
public class Babysitting {
    
    private int id;
    private Date date;
    private  Time heure_deb;
    private int	duree;
    private String adresse;
    private int babysitteur;
    private int nbr_enfants;

    public Babysitting() {}

    public Babysitting(int id) {
        this.id = id;
    }

    public Babysitting(int id, Date date) {
        this.id = id;
        this.date = date;
    }

    public Babysitting(int id, Date date, Time heure_deb) {
        this.id = id;
        this.date = date;
        this.heure_deb = heure_deb;
    }

    public Babysitting(int id, Date date, Time heure_deb, int duree) {
        this.id = id;
        this.date = date;
        this.heure_deb = heure_deb;
        this.duree = duree;
    }

    public Babysitting(int id, Date date, Time heure_deb, int duree, String adresse) {
        this.id = id;
        this.date = date;
        this.heure_deb = heure_deb;
        this.duree = duree;
        this.adresse = adresse;
    }

    public Babysitting(int id, Date date, Time heure_deb, int duree, String adresse, int babysitteur) {
        this.id = id;
        this.date = date;
        this.heure_deb = heure_deb;
        this.duree = duree;
        this.adresse = adresse;
        this.babysitteur = babysitteur;
    }

    public Babysitting(Date date, Time heure_deb, int duree, String adresse, int babysitteur, int nbr_enfants) {
        this.date = date;
        this.heure_deb = heure_deb;
        this.duree = duree;
        this.adresse = adresse;
        this.babysitteur = babysitteur;
        this.nbr_enfants = nbr_enfants;
    }

    public Babysitting(int id, Date date, Time heure_deb, int duree, String adresse, int babysitteur, int nbr_enfants) {
        this.id = id;
        this.date = date;
        this.heure_deb = heure_deb;
        this.duree = duree;
        this.adresse = adresse;
        this.babysitteur = babysitteur;
        this.nbr_enfants = nbr_enfants;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setHeure_deb(Time heure_deb) {
        this.heure_deb = heure_deb;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setBabysitteur(int babysitteur) {
        this.babysitteur = babysitteur;
    }

    public void setNbr_enfants(int nbr_enfants) {
        this.nbr_enfants = nbr_enfants;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public Time getHeure_deb() {
        return heure_deb;
    }

    public int getDuree() {
        return duree;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getBabysitteur() {
        return babysitteur;
    }

    public int getNbr_enfants() {
        return nbr_enfants;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.date);
        hash = 67 * hash + Objects.hashCode(this.heure_deb);
        hash = 67 * hash + this.duree;
        hash = 67 * hash + Objects.hashCode(this.adresse);
        hash = 67 * hash + this.babysitteur;
        hash = 67 * hash + this.nbr_enfants;
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
        final Babysitting other = (Babysitting) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.duree != other.duree) {
            return false;
        }
        if (this.babysitteur != other.babysitteur) {
            return false;
        }
        if (this.nbr_enfants != other.nbr_enfants) {
            return false;
        }
        if (!Objects.equals(this.adresse, other.adresse)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (!Objects.equals(this.heure_deb, other.heure_deb)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Babysitting{" + "id=" + id + ", date=" + date + ", heure_deb=" + heure_deb + ", duree=" + duree + ", adresse=" + adresse + ", babysitteur=" + babysitteur + ", nbr_enfants=" + nbr_enfants + '}';
    }
    
    
    
    
}
