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
public class Covoiturage {
	
	private int id;
    private Date date;
    private int nbr_places;
    private Time heure_dep;
    private String lieu_dep;
    private String lieu_dest;
    private  int covoitureur; //User covoitureur
	private int enfant;
	
	
	
}
