/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import ConnexionBD.DataSource;
import Entites.Babysitting;
import Iservices.IBabysitting;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mariem
 */
public class GestionBabysitting implements IBabysitting {
    
     public Connection con=DataSource.getInstance().getConnection();
     public Statement ste;
    
    public GestionBabysitting()
    {
        try {
            ste=con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(GestionBabysitting.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void AjouterBabysitting(Babysitting B) {

         try {
            String req1 = "INSERT INTO babysittings (date,heure_deb,duree,adresse,babysitteur,nbr_enfants)  VALUES (?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(req1);
            st.setDate(1, B.getDate());
            st.setTime(2, B.getHeure_deb());
            st.setInt(3, B.getDuree());
            st.setString(4, B.getAdresse());
            st.setInt(5, B.getBabysitteur());
            st.setInt(6,B.getNbr_enfants());

            st.executeUpdate();
            System.out.println("Babysitting Ajouté avec succès!");
            System.out.println(B.toString());
           
          }catch (SQLException ex) {
            System.out.println(B.toString());
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
            Logger.getLogger(GestionBabysitting.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void ModifierBabysitting(Babysitting B, int id) {
         try{
            
        String req2 = "UPDATE `babysittings` SET `date`=?,`heure_deb`=?,`duree`=?,`adresse`=?,`babysitteur`=?,`nbr_enfants`=? WHERE id=? ";
                PreparedStatement st = con.prepareStatement(req2);
           st.setDate(1, B.getDate());
            st.setTime(2, B.getHeure_deb());
            st.setInt(3, B.getDuree());
            st.setString(4, B.getAdresse());
            st.setInt(5, B.getBabysitteur());
            st.setInt(6,B.getNbr_enfants());
            st.setInt(7,id);
                st.executeUpdate();
                
                 System.out.println("Babysitting mis à jour avec succès !");
                 System.out.println(B.toString());
        }catch (SQLException ex) {
            System.out.println(B.toString());
            System.out.println("erreur lors de la modification " + ex.getMessage());
            Logger.getLogger(GestionBabysitting.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void SupprimerBabysitting(int id) {
          String req3 = "DELETE FROM `babysittings` WHERE id=? ";
        try {
             PreparedStatement st = con.prepareStatement(req3);

            st.setInt(1, id);
            st.executeUpdate();
            System.out.println("Babysitting supprimé avec succès !");

        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }

    @Override
    public void AfficherBabysitting(int nbr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List SelectBabysitting() {
         try{
       List<Babysitting> list=new ArrayList<>();
         
            String req="SELECT * FROM babysittings";
            PreparedStatement ste= con.prepareStatement(req);
            ResultSet rs=ste.executeQuery();
            
            while(rs.next())
            {
                Babysitting C= new Babysitting(rs.getInt("id"),rs.getDate("date"),rs.getTime("heure_deb"),
                        rs.getInt("duree"),rs.getString("adresse"),rs.getInt("babysitteur"),rs.getInt("nbr_enfants"));
            list.add(C);
            }
         
       return list;
      }  catch (SQLException ex) {
            Logger.getLogger(GestionBabysitting.class.getName()).log(Level.SEVERE, null, ex);
        }
      return null;
    }
   
    
}
