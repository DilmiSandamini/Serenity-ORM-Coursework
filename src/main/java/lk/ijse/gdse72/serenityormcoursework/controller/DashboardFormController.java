package lk.ijse.gdse72.serenityormcoursework.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DashboardFormController {

    @FXML
    private JFXButton btnAppointments;

    @FXML
    private JFXButton btnLogOut;

    @FXML
    private JFXButton btnPatients;

    @FXML
    private JFXButton btnPayment;

    @FXML
    private JFXButton btnTherapists;

    @FXML
    private JFXButton btnTherapyPrograms;

    @FXML
    private JFXButton btnTherapySessions;

    @FXML
    private JFXButton btnUsers;

    @FXML
    private AnchorPane dashboardLodingPage;

    @FXML
    private AnchorPane pageDashboard;

    private void navigateTo(String fxmlPath) {
        try {
            dashboardLodingPage.getChildren().clear();
            AnchorPane load = FXMLLoader.load(getClass().getResource(fxmlPath));
            load.prefWidthProperty().bind(dashboardLodingPage.widthProperty());
            load.prefHeightProperty().bind(dashboardLodingPage.heightProperty());
            dashboardLodingPage.getChildren().add(load);
        } catch (IOException e) {
            e.printStackTrace();
            new Alert(Alert.AlertType.ERROR, "Fail to load page!").show();
        }
    }

    @FXML
    void btnAppointmentsOnAction(ActionEvent event) {
    }

    @FXML
    void btnLogOutOnAction(ActionEvent event) throws IOException {

    }

    @FXML
    void btnPatientsOnAction(ActionEvent event) {
        navigateTo("/view/PatientsForm.fxml");
    }

    @FXML
    void btnPaymentOnAction(ActionEvent event) {
        navigateTo("/view/PaymentForm.fxml");

    }

    @FXML
    void btnTherapistsOnAction(ActionEvent event) {
        navigateTo("/view/TherapistForm.fxml");

    }

    @FXML
    void btnTherapyProgramsOnAction(ActionEvent event) {
        navigateTo("/view/TherapyProgramsForm.fxml");
    }

    @FXML
    void btnTherapySessionsOnAction(ActionEvent event) {

    }

    @FXML
    void btnUsersOnAction(ActionEvent event) {
        navigateTo("/view/UserForm.fxml");
    }

}
