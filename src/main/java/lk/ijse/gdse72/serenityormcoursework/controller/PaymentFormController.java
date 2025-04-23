package lk.ijse.gdse72.serenityormcoursework.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class PaymentFormController {

    @FXML
    private JFXButton btnDelete;

    @FXML
    private JFXButton btnReset;

    @FXML
    private JFXButton btnSave;

    @FXML
    private JFXButton btnUpdate;

    @FXML
    private TableColumn<?, ?> colAmont;

    @FXML
    private TableColumn<?, ?> colPatientID;

    @FXML
    private TableColumn<?, ?> colPaymenetDate;

    @FXML
    private TableColumn<?, ?> colPaymentId;

    @FXML
    private TableColumn<?, ?> colPaymentTime;

    @FXML
    private TableColumn<?, ?> colProgramId;

    @FXML
    private ComboBox<?> comPatientId;

    @FXML
    private ComboBox<?> comProgramId;

    @FXML
    private Label lblAmont;

    @FXML
    private Label lblPaymentDate;

    @FXML
    private Label lblPaymentID;

    @FXML
    private Label lblPaymentTime;

    @FXML
    private AnchorPane pagePayment;

    @FXML
    private TableView<?> tblPayemnt;

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
