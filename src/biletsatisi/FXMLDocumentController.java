/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biletsatisi;

import dao.kGirisDao;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Hanifi
 */
public class FXMLDocumentController extends Application implements Initializable {

    @FXML
    private TextField KullaniciAdi;
    @FXML
    private TextField Sifre;
    @FXML
    private Button Giris;
    @FXML
    private Label hata;

    private boolean control = false;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument2.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    private void girisYap(ActionEvent event)  {

        if (girisControl()) {
            kGirisDao kGiris = new kGirisDao();
            kGiris.read().listIterator().forEachRemaining((t) -> {
                if (t.getKullaniciadi() == Long.valueOf(KullaniciAdi.getText()) && t.getSifre().equals(Sifre.getText())) {
                    
                        control = true;                      
                        girisYolla();
                } 
            });
            if (!control) {
                hata.setText("Kullanıcı adı veya şifre hatalı!");

            }
        } else {
            hata.setText("Lütfen boş alan bırakmayınız!");

        }
    }
    public static void girisYolla(){
        try {
            Parent root = FXMLLoader.load(biletsatisi.BiletSatisi.class.getResource("/biletsatisi/FXMLDocument2.fxml"));
                        Scene scene = new Scene(root);
                        biletsatisi.BiletSatisi.stage.setScene(scene);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    

    private boolean girisControl() {
        return (KullaniciAdi.getText() != null) && !"".equals(KullaniciAdi.getText()) && (Sifre.getText() != null) && !"".equals(Sifre.getText());
    }

}
