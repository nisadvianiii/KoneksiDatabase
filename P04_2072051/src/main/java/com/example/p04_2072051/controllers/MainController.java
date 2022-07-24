package com.example.p04_2072051.controllers;

import com.example.p04_2072051.HelloApplication;
import com.example.p04_2072051.entity.Items;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    public MenuItem tampil;
    public MenuItem tutup;
    public TextField txtId;
    public TextField txtName;
    public TextField txtPrice;
    public TextField txtDesc;
    public ComboBox cmbCategory;
    public Button btnSave;
    public Button btnReset;
    public TableView table1;
    public TableColumn kolom1;
    public TableColumn kolom2;
    public TableColumn kolom3;
    public TableColumn kolom4;


    private Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        stage = new Stage();
    }
    public void onShow(ActionEvent actionEvent) throws IOException {
            FXMLLoader loader;
            loader = new FXMLLoader(HelloApplication.class.getResource("layout2.fxml"));
            Scene scene = new Scene(loader.load());
            stage.setTitle("Supplier Management");
            stage.setScene(scene);
            stage.show();
        }
    }
