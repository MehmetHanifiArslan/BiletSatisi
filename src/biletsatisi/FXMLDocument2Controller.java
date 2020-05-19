/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biletsatisi;

import biletsatisi.*;
import dao.biletDao;
import dao.seferlerDao;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Hanifi
 */
public class FXMLDocument2Controller implements Initializable {

    @FXML
    private ComboBox<String> nereden;
    @FXML
    private ComboBox<String> nereye;
    @FXML
    private ComboBox<String> zaman;
    @FXML
    private Label satinAlindimi;
    
    private biletDao bDao = new biletDao();
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        seferlerDao s= new seferlerDao();
        s.read().iterator().forEachRemaining((t) -> {
            nereye.getItems().add(t.getNereye()); 
         
        });
        s.read().iterator().forEachRemaining((t) -> {
            nereden.getItems().add(t.getNereden()); 
         
        });     
       
    }    


    @FXML
    private void ucakbilet(ActionEvent event) {
    }

    @FXML
    private void otobusbilet(ActionEvent event) {
    }

    @FXML
    private void trenbilet(ActionEvent event) {
    }

    @FXML
    private void satinAl(ActionEvent event) {
        seferlerDao sdao= new seferlerDao();
        String neredenS=nereden.getValue();
        String nereyeS=nereye.getValue();
        String zamanS= zaman.getValue(); 
        sdao.update(neredenS, nereyeS, zamanS);
        satinAlindimi.setText("Bilet satın alma işlemi başarılı!");
        
    }

    @FXML
    private void biletBul(ActionEvent event) {
        seferlerDao sdao=new seferlerDao();
        String neredenS=nereden.getValue();
        String nereyeS=nereye.getValue();
        sdao.readSefer(neredenS, nereyeS).iterator().forEachRemaining((t) -> {
            zaman.getItems().add(String.valueOf(t.getNezaman()));  
            
        });  
    }
    
}
