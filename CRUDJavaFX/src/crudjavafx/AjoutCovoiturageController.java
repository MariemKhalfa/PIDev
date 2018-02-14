/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudjavafx;

import Entities.Covoiturage;
import Services.GestionCovoiturage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Mariem
 */
public class AjoutCovoiturageController implements Initializable {
	
	
	@FXML
	private TextField nbrPlacesTxt;
	@FXML
	private DatePicker datecovoiturageTxt;
	@FXML
	private TextField heureDepartTxt;
	@FXML
	private TextArea adresseDepartTxt;
	@FXML
	private TextArea adresseDestinationTxt;
	@FXML
	private TextField cinTxt;
	@FXML
	private Button btnAjout;
	@FXML
	private Button btnList;

	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}	
	 public void initField() {
       
        datecovoiturageTxt.setValue(null);
        nbrPlacesTxt.clear();
	    heureDepartTxt.clear();
	    adresseDepartTxt.clear();
		adresseDestinationTxt.clear();;
	    cinTxt.clear();
	 }

	@FXML
	private void AjoutCovoiturage(ActionEvent event) {
		
		int nbr_places=Integer.parseInt(nbrPlacesTxt.getText());
        int heure_dep=Integer.parseInt(heureDepartTxt.getText());
        int cin=Integer.parseInt(cinTxt.getText());
        java.sql.Date ladate = java.sql.Date.valueOf( datecovoiturageTxt.getValue() );
		String depart=adresseDepartTxt.getText();
		String destination=adresseDestinationTxt.getText();
		
		Covoiturage C=new Covoiturage(ladate,nbr_places,heure_dep,depart,destination,cin);
       GestionCovoiturage G=new GestionCovoiturage();
       G.AjouterCovoiturage(C);
	  
	   Alert alerte = new Alert(Alert.AlertType.INFORMATION);
        alerte.setTitle("Information Dialogs");
        alerte.setHeaderText(null);
		alerte.setContentText("Ajout effectué avec succès");

        alerte.showAndWait();
		
		initField();
	}

	@FXML
	private void ListeCov(ActionEvent event) throws IOException {
		Parent list_page_parent = FXMLLoader.load(getClass().getResource("ListeCovoiturages.fxml"));
        Scene list_page_scene = new Scene(list_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                app_stage.hide(); //optional
                app_stage.setScene(list_page_scene);
                app_stage.show();  	
	}
	
}
