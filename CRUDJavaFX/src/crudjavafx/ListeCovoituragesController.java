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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Mariem
 */
public class ListeCovoituragesController implements Initializable {
	
	ObservableList<Covoiturage> listCov = FXCollections.observableArrayList();
	@FXML
	private AnchorPane anchor;
	@FXML
	private TableColumn<?, ?> lieuDest;
	@FXML
	private TableColumn<?, ?> idCov;
	@FXML
	private TableColumn<?, ?> dateCov;
	@FXML
	private TableColumn<?, ?> nbrPlaces;
	@FXML
	private TableColumn<?, ?> heurDep;
	@FXML
	private TableColumn<?, ?> lieuDep;
	@FXML
	private TableColumn<?, ?> covoitureur;
	@FXML
	private Button btnAjout;
	@FXML
	private Button btnSupp;
	@FXML
	private TableView<Covoiturage> tableCovoiturages;

	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
		initColumns();
		loadCovList();
	}	
	
	private void initColumns(){
	 
		idCov.setCellValueFactory(new PropertyValueFactory<>("id"));
		dateCov.setCellValueFactory(new PropertyValueFactory<>("date"));
		nbrPlaces.setCellValueFactory(new PropertyValueFactory<>("nbr_places"));
		heurDep.setCellValueFactory(new PropertyValueFactory<>("heure_dep"));
		lieuDep.setCellValueFactory(new PropertyValueFactory<>("lieu_dep"));
		lieuDest.setCellValueFactory(new PropertyValueFactory<>("lieu_dest"));
		covoitureur.setCellValueFactory(new PropertyValueFactory<>("covoitureur"));		
	}
	 private void loadCovList() {
        //listCov.clear();
        GestionCovoiturage GC=new GestionCovoiturage();
       listCov=GC.ListerCovoiturages();
       tableCovoiturages.setItems(listCov);

    }	

	@FXML
	private void PageAjout(ActionEvent event) {
	}

	@FXML
	private void SupprimerCovoiturage(ActionEvent event) {
	}

	@FXML
	private void SelectIdCov(MouseEvent event) throws IOException {
		Covoiturage g=tableCovoiturages.getSelectionModel().getSelectedItem();
		Stage primaryStage=new Stage();
        FXMLLoader loader=new FXMLLoader();
        Pane root=loader.load(getClass().getResource("ModifCovoiturage.fxml").openStream());
        ModifCovoiturageController  m =(ModifCovoiturageController )loader.getController();
        System.out.println(g.getId());
        m.getUser(g);
        Scene scene=new Scene(root);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
	}
	
}
