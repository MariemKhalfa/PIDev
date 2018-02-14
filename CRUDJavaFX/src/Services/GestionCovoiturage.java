/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import ConnexionBD.DataSource;
import Entities.Covoiturage;
import Interfaces.ICovoiturage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Mariem
 */
public class GestionCovoiturage implements ICovoiturage{
	
	 public Connection con=DataSource.getInstance().getConnection();
     public Statement ste;
	 
    public GestionCovoiturage()
    {
        try {
            ste=con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(GestionCovoiturage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

	@Override
	public void AjouterCovoiturage(Covoiturage C) {
		try {
            String req1 = "INSERT INTO covoiturage(date,nbr_places,heure_dep,lieu_dep,lieu_dest,covoitureur)  VALUES (?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(req1);
			
            st.setDate(1,C.getDate() );
            System.out.println("jjj");
            st.setInt(2, C.getNbr_places());
            st.setInt(3, C.getHeure_dep());
            st.setString(4, C.getLieu_dep());
            st.setString(5, C.getLieu_dest());
            st.setInt(6,C.getCovoitureur());

            st.executeUpdate();
            System.out.println("Covoiturage Ajouté avec succès!");
            System.out.println(C.toString());
			
           
        } catch (SQLException ex) {
            System.out.println(C.toString());
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
            Logger.getLogger(GestionCovoiturage.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

	@Override
	public void ModifierCovoiturage(Covoiturage C, int id) {
		 try{
            
        String req2 = "UPDATE `covoiturage` SET `date`=?,`nbr_places`=?,`heure_dep`=?,`lieu_dep`=?,`lieu_dest`=?,`covoitureur`=? WHERE id=? ";
                PreparedStatement st = con.prepareStatement(req2);
		
            st.setDate(1, C.getDate());
            st.setInt(2, C.getNbr_places());
            st.setInt(3, C.getHeure_dep());
            st.setString(4, C.getLieu_dep());
            st.setString(5, C.getLieu_dest());
            st.setInt(6,C.getCovoitureur());
            st.setInt(7,id);
                st.executeUpdate();
                
                 System.out.println("Covoiturage mis à jour avec succès !");
                 System.out.println(C.toString());
        }catch (SQLException ex) {
            System.out.println(C.toString());
            System.out.println("erreur lors de la modification " + ex.getMessage());
            Logger.getLogger(GestionCovoiturage.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

	@Override
	public void SupprimerCovoiturage(int id) {
		 String req3 = "DELETE FROM `covoiturage` WHERE id=? ";
        try {
             PreparedStatement st = con.prepareStatement(req3);

            st.setInt(1, id);
            st.executeUpdate();
            System.out.println("Covoiturage supprimé avec succès !");

        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
	}

	@Override
	public void AfficherCovoiturage(int nbr) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
	 @Override
     public  ObservableList<Covoiturage> ListerCovoiturages() {
      try{
       ObservableList<Covoiturage> list= FXCollections.observableArrayList();    
            String req="SELECT * FROM covoiturage";
            PreparedStatement ste= con.prepareStatement(req);
            ResultSet rs=ste.executeQuery();
            
            while(rs.next())
            {
                Covoiturage C= new Covoiturage(rs.getInt("id"),rs.getDate("date"),rs.getInt("nbr_places"),
                        rs.getInt("heure_dep"),rs.getString("lieu_dep"),rs.getString("lieu_dest"),rs.getInt("covoitureur"));
            list.add(C);
            }
         
       return list;
      }  catch (SQLException ex) {
            Logger.getLogger(GestionCovoiturage.class.getName()).log(Level.SEVERE, null, ex);
        }
      return null;
	 }

	@Override
	public Covoiturage RechercheCovoiturage(int id) {
		Covoiturage C = null;

        try {
            String req5 = "SELECT * FROM covoiturage where id =? ";
            PreparedStatement st = con.prepareStatement(req5);
             st.setInt(1, id);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
             C = new Covoiturage();
			C.setId(rs.getInt(1));
            C.setDate( rs.getDate(2));
			C.setNbr_places(rs.getInt(3));
			C.setLieu_dep(rs.getString(4));
			C.setLieu_dest(rs.getString(5));
            C.setCovoitureur(rs.getInt(6));

                st.executeUpdate();
				
            }   
        } catch (SQLException ex) {
            Logger.getLogger(GestionCovoiturage.class.getName()).log(Level.SEVERE, null, ex);
        }
         return C;
	
	}
	
}
