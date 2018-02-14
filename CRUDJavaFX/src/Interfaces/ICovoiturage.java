/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entities.Covoiturage;
import java.util.List;

/**
 *
 * @author Mariem
 */
public interface ICovoiturage {
	 public void AjouterCovoiturage(Covoiturage C);
     public void ModifierCovoiturage(Covoiturage C,int id);
     public void SupprimerCovoiturage(int id);
     public void AfficherCovoiturage(int nbr);
     public List ListerCovoiturages();
	 public Covoiturage RechercheCovoiturage(int id);
	
}
