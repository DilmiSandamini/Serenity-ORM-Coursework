package lk.ijse.gdse72.serenityormcoursework.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class TherapistFormController {

    @FXML
    private RadioButton RNo;

    @FXML
    private RadioButton RYes;

    @FXML
    private AnchorPane TherapistsPage;

    @FXML
    private JFXButton btnDelete;

    @FXML
    private JFXButton btnReset;

    @FXML
    private JFXButton btnSave;

    @FXML
    private JFXButton btnUpdate;

    @FXML
    private TableColumn<?, ?> colSpecialization;

    @FXML
    private TableColumn<?, ?> colTherapistsAvailability;

    @FXML
    private TableColumn<?, ?> colTherapistsEmail;

    @FXML
    private TableColumn<?, ?> colTherapistsID;

    @FXML
    private TableColumn<?, ?> colTherapistsName;

    @FXML
    private TableColumn<?, ?> colTherapistsPhone;

    @FXML
    private ComboBox<?> comSpecialization;

    @FXML
    private Label lblID;

    @FXML
    private TableView<?> tblTherapists;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPhone;

    @FXML
    void btnDeleteOnAcion(ActionEvent event) {

    }

    @FXML
    void btnResetOnAction(ActionEvent event) {

    }

    @FXML
    void btnSaveOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

}
