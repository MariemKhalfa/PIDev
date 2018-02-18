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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author atoufa traore
 */
public class AjoutGarderieController implements Initializable {
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private TextField inputName;
    @FXML
    private TextField Adresse;
    @FXML
    private TextField propriétaire;
    @FXML
    private TextField email;
    @FXML
    private TextField Telephone;
    @FXML
    private Button img;
    @FXML
    private TextArea descriptif;
    @FXML
    private DatePicker date_deb;
    @FXML
    private DatePicker date_fin;
    @FXML
    private ImageView ImageView1;
    @FXML
    private RadioButton r1;
    @FXML
    private RadioButton r2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void newPersonButtonPushed(ActionEvent event) throws IOException {
       
 
        Parent tableView = FXMLLoader.load(getClass().getResource("scene1.fxml"));
        
        
        Scene tableViewScene= new Scene(tableView);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
         
    
    
    }

    @FXML
    private void showImg(ActionEvent event) {
    }
    
    
}
