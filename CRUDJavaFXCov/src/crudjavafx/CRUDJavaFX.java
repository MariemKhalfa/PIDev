/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Mariem
 */
public class CRUDJavaFX extends Application {
	
	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("AjoutCovoiturage.fxml"));
		stage.setTitle("All For Kids");
		Scene scene = new Scene(root);
		//stage.setScene(new Scene(root,500,500));
		
		stage.setScene(scene);
		stage.show();
	}
	

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}
	
}
