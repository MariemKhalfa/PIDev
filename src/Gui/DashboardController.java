/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 *
 * @author atoufa traore
 */
public class DashboardController implements Initializable {
    
    private Label label;
    @FXML
    private Pane pane;
    private AnchorPane homePane;
    
   
    
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
        this.createPage(homePane, "ajoutGarderie.fxml");
               
        
    }

    @FXML
    private void loadMemberTable(ActionEvent event) throws IOException {
           this.createPage(homePane, "scene2.fxml");
    }

    
}
