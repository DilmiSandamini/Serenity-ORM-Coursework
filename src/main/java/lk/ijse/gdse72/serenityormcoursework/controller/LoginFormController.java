package lk.ijse.gdse72.serenityormcoursework.controller;

import com.jfoenix.controls.JFXButton;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import lk.ijse.gdse72.serenityormcoursework.bo.BOFactory;
import lk.ijse.gdse72.serenityormcoursework.bo.custom.UserBO;
import lk.ijse.gdse72.serenityormcoursework.tm.UserTM;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class LoginFormController implements Initializable {

    @FXML
    private AnchorPane ancLogin;

    @FXML
    private JFXButton btnSignUp;

    @FXML
    private JFXButton btnSignin;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;

    private String selectedUserId;
    private final ObservableList<UserTM> userList = FXCollections.observableArrayList();
    private UserBO userBO;

    @FXML
    void btnSignUpOnAction(ActionEvent event) throws IOException {
        ancLogin.getChildren().clear();
        AnchorPane load = FXMLLoader.load(getClass().getResource("/view/RegisterForm.fxml"));
        ancLogin.getChildren().add(load);
    }

    @FXML
    void btnSigninOnAction(ActionEvent event) throws IOException {
        String username = txtUsername.getText();
        String password = txtPassword.getText();

        try {
            boolean isValid = userBO.isValidUser(username, password);

            if (isValid) {
                new Alert(Alert.AlertType.INFORMATION, "Login Success!").showAndWait();
                ancLogin.getChildren().clear();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Dashboard-form.fxml"));
                AnchorPane load = loader.load();
                ancLogin.getChildren().add(load);
            } else {
                new Alert(Alert.AlertType.ERROR, "Invalid Username or Password!").showAndWait();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

}
