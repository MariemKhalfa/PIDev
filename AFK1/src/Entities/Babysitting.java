/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.sql.Date;
import java.sql.Time;

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
    private User babysitteur; // User
    private int nbr_enfants;
	private User parent;//tableau
	private Enfant enfant;//tableau
	
}
