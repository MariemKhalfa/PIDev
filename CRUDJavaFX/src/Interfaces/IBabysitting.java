/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entities.Babysitting;
import java.util.List;

/**
 *
 * @author Mariem
 */
public interface IBabysitting {
	
	 public void AjouterBabysitting(Babysitting B);
     public void ModifierBabysitting(Babysitting B,int id);
     public void SupprimerBabysitting(int id);
     public void AfficherBabysitting(int nbr);
     public List ListerBabysittings();
	 public Babysitting RechercheCovoiturage(int id);
	
}
