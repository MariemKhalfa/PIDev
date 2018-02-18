/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import com.jfoenix.controls.JFXButton;
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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author atoufa traore
 */
public class MainController implements Initializable {
    @FXML
    private Pane pane;
   private AnchorPane homePane;
    @FXML
    private AnchorPane anchor;
    @FXML
    private VBox vbox;
    @FXML
    private JFXButton liste;
    @FXML
    private JFXButton liste1;
    @FXML
    private JFXButton liste11;
    @FXML
    private JFXButton liste12;
    @FXML
    private JFXButton liste13;
    @FXML
    private JFXButton liste14;
    @FXML
    private JFXButton liste16;
    @FXML
    private JFXButton liste17;
    @FXML
    private JFXButton liste18;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
public void setNode(Node node){
    pane.getChildren().clear();
pane.getChildren().add((Node)node);}
public void createPage(AnchorPane Home,String loc) throws IOException{
    Home=FXMLLoader.load(getClass().getResource(loc));
    setNode(Home);
    
}
    @FXML
    private void loadAddBook(ActionEvent event) throws IOException {
        this.createPage(homePane, "scene2.fxml");
               
        
    }

  /*  @FXML
    private void loadMemberTable(ActionEvent event) throws IOException {
           this.createPage(homePane, "scene2.fxml");
    }*/

 /*   @FXML
    private void mYRIAM2(ActionEvent event) throws IOException {
             this.createPage(homePane, "exercice2.fxml");
    }
*/
    private void hELLO(ActionEvent event) throws IOException {
        this.createPage(homePane, "ajoutGarderie.fxml");
        
    }

    @FXML
    private void mYRIAM2(ActionEvent event) throws IOException {
            this.createPage(homePane, "garderie.fxml");
    }

    
    
    
   

  
    
}
