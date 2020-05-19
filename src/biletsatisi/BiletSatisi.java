/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biletsatisi;

import entity.seferler;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import patterns.Context;
import patterns.SelectionSort;

/**
 *
 * @author Hanifi
 */
public class BiletSatisi extends Application {
    public static Stage stage;
    @Override
    public void start(Stage stage) throws Exception {
        BiletSatisi.stage=stage;
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
        
        List<seferler> aList = new ArrayList<>();
        Context deneme = new Context();
        deneme.setStrategy(new SelectionSort());
        deneme.BiletSec(aList);
    }

  
    
}
