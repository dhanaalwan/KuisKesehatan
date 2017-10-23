/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis5;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author Dna
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private JFXTextField editnama;
    @FXML
    private JFXTextField edittinggi;
    @FXML
    private JFXTextField editberat;
    @FXML
    private RadioButton rdLaki;
    @FXML
    private ToggleGroup jk;
    @FXML
    private RadioButton rdPerempuan;
    @FXML
    private JFXButton buttonProses;
    @FXML
    private JFXButton buttonReset;
    @FXML
    private TextArea hasil;
    @FXML
    private TextField beratideal;
    @FXML
    private TextArea saran;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    String nama, jenis, idealnya;
    int tinggi, berat, ideal;
    @FXML
    private void proses(ActionEvent event) {
        if (rdLaki.isSelected()) {
            jenis = "Laki-laki";
            ideal = tinggi - 105;
        } else if (rdPerempuan.isSelected()) {
            jenis = "Perempuan";
            ideal = tinggi - 110;
        } else {
            jenis = "";
        }
         idealnya=String.valueOf(ideal);
         beratideal.setText(idealnya);
         nama = editnama.getText();
         tinggi = Integer.parseInt(edittinggi.getText());
         berat = Integer.parseInt(editberat.getText());
         hasil.setText("Nama Pasien: " + nama + "\n" + "Tinggi : "  + tinggi +"\n"
                 + "Berat Badan : " + berat + "\n" + "Jenis Kelamin : " + jenis + "\n" );
    }

    @FXML
    private void reset(ActionEvent event) {
    }
    
}
