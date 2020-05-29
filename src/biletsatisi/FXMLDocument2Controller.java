/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biletsatisi;

import dao.biletDao;
import dao.seferlerDao;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import patterns.Context;
import patterns.InsertionSort;
import patterns.SelectionSort;
import patterns.biletTipi;
import patterns.biletTipiFactory;

/**
 *
 * @author Hanifi
 */
public class FXMLDocument2Controller implements Initializable {

    @FXML
    private RadioButton Tren;
    @FXML
    private RadioButton Ucak;
    @FXML
    private RadioButton Otobus;
    @FXML
    private ComboBox<String> nereden;
    @FXML
    private ComboBox<String> nereye;
    @FXML
    private ComboBox<String> zaman;
    @FXML
    private Label satinAlindimi;

    private biletDao bDao = new biletDao();

    private RadioButton Secim;
    private biletTipi bilettipi;  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        seferlerDao s = new seferlerDao();
        s.read().iterator().forEachRemaining((t) -> {
            nereye.getItems().add(t.getNereye());

        });
        s.read().iterator().forEachRemaining((t) -> {
            nereden.getItems().add(t.getNereden());

        });

    }

    @FXML
    private void trenTiklama(ActionEvent event) {
        Ucak.setSelected(false);
        Otobus.setSelected(false);
        Tren.setSelected(true);
        Secim = Tren;
    }

    @FXML
    private void ucakTiklama(ActionEvent event) {
        Ucak.setSelected(true);
        Otobus.setSelected(false);
        Tren.setSelected(false);
        Secim = Ucak;
    }

    @FXML
    private void OtobusTiklama(ActionEvent event) {
        Ucak.setSelected(false);
        Otobus.setSelected(true);
        Tren.setSelected(false);
        Secim = Otobus;
    }

    @FXML
    private void satinAl(ActionEvent event) {

        seferlerDao sdao = new seferlerDao();
        String neredenS = nereden.getValue();
        String nereyeS = nereye.getValue();
        String zamanS = zaman.getValue();
        sdao.update(neredenS, nereyeS, zamanS);
        satinAlindimi.setText("Bilet satın alma işlemi başarılı!");
        Random random = new Random();
        bilettipi= (biletTipi)biletTipiFactory.getBiletTipi(Secim.getText(),random.nextInt(40)+1 ,String.valueOf(random.nextInt(15)+1) ,neredenS, nereyeS);
        
        // factory methodu kullanıldı ihtiyaca göre bilettipi dönderiyor. 
      
    }

   
    @FXML
    private void biletBul(ActionEvent event) {
        seferlerDao sdao = new seferlerDao();
        String neredenS = nereden.getValue();
        String nereyeS = nereye.getValue();
        sdao.readSefer(neredenS, nereyeS).iterator().forEachRemaining((t) -> {
            zaman.getItems().add(String.valueOf(t.getNezaman()));

        });
    }

    
      @FXML
     private void UcuzBul(ActionEvent event){
         
      Context context = new Context() ;
      context.setStrategy(new InsertionSort());
      
     // context.setStrategy(new SelectionSort());
  // ikisinden birini kullanabiliriz ikiside sıralma yaptıryor.
     // sıralma algortimasıları var bunlar biletleri sıralayıp algortimaları farklı sıraldıktan sonra uygun olanı buluyor.Hangi method uygunsa onu seçyor
      
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
         Ucak.setSelected(false);
        Otobus.setSelected(false);
        Tren.setSelected(true);
        Secim = Tren; 
     }
}
