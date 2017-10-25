/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private TextField nama;
    @FXML
    private TextField alamat;
    @FXML
    private TextField absen;
    @FXML
    private TextField telp;
    @FXML
    private TextArea TA;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnproses(ActionEvent event) {
        String namaa = nama.getText();
        String aalamat = alamat.getText();
        String aabsen = absen.getText();
        String ttelp = telp.getText();
        
        TA.setText("Nama : "+namaa+"\nAlamat : "+aalamat+"\nAbsen : "+aabsen+"\nNo Telp : "+ttelp);
    }
    
    @FXML
    void hapuss(ActionEvent event) {
        TA.setText("");
        nama.setText("");
        alamat.setText("");
        absen.setText("");
        telp.setText("");
    }
    
}
