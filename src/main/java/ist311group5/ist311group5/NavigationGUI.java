/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist311group5.ist311group5;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

        
    
        
public class NavigationGUI{
    
    private final GridPane rootPane;  
    
    public NavigationGUI(Stage navStage) {
        rootPane = new GridPane();
        rootPane.setAlignment(Pos.CENTER);
        rootPane.setHgap(10);
        rootPane.setVgap(10);
        rootPane.setPadding(new Insets(25, 25, 25, 25));
        
        
        var scene = new Scene(rootPane, 630, 480);
        navStage.setScene(scene);      
        
        Text sceneTitle = new Text("Navigation");
        rootPane.add(sceneTitle, 0, 0, 2, 1);
    }
    
    public Pane getRootPane() {
        return rootPane;
    }




}


