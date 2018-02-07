/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudpidev;

import Entites.Babysitting;
import Entites.Covoiturage;
import Services.GestionBabysitting;
import Services.GestionCovoiturage;
import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Mariem
 */
public class CRUDPIDev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        GestionCovoiturage C=new GestionCovoiturage();
        GestionBabysitting B=new GestionBabysitting();
           Date d1 = new Date(2018-02-10);
           Date d2 = new Date(2018-02-2);
           Date d3 = new Date(2018-02-21);
           Time T1=new Time(14,30,0);
           Time T2=new Time(19,30,0);
           Time T3=new Time(18,15,0);
        Covoiturage C1=new Covoiturage(d1,3,10,"Cité Les Roses-Tunis","Garderie LPA",2);
        Covoiturage C2=new Covoiturage(2,d2,4,17,"27,Rue LaFoie-Cité L'indépendance-Ariana","Garderie L'Espoir",1);
        Covoiturage C3=new Covoiturage(d3,1,15,"Immeuble Prestige,Cité Ennasr","Garderie El Maarefa",3);
        Covoiturage C4=new Covoiturage(d3,1,14,"Immeuble Prestige,Cité Ennasr","Garderie El Maarefa",4);
       // C.AjouterCovoiturage(C2);
       // C.ModifierCovoiturage(C4, 3);
       //C.SupprimerCovoiturage(2);
     // C.AfficherCovoiturage(2);
      //C.SelectCovoiturage().forEach(System.out::println);
        Babysitting B1=new Babysitting(d2,T1,4,"27,Rue LaFoie-Cité L'indépendance-Ariana",4,4);
        B.AjouterBabysitting(B1);
       // B.ModifierBabysitting(B1, 1);
      // B.SupprimerBabysitting(1);
      // B.SelectBabysitting().forEach(System.out::println);
     
  
        
    }
    
}
