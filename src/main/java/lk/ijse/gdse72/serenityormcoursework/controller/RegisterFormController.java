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
import lk.ijse.gdse72.serenityormcoursework.dto.UserDTO;
import lk.ijse.gdse72.serenityormcoursework.tm.UserTM;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RegisterFormController implements Initializable {

    @FXML
    private AnchorPane ancRegister;

    @FXML
    private JFXButton btnSignIn;

    @FXML
    private JFXButton btnSignUp;

    @FXML
    private PasswordField txtConfirmPassword;

    @FXML
    private TextField txtEmail;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtPhone;

    @FXML
    private TextField txtUsername;

    private String selectedUserId;
    private final ObservableList<UserTM> userList = FXCollections.observableArrayList();
    private UserBO userBO;

    @FXML
    void btnSignInOnAction(ActionEvent event) throws IOException {
        ancRegister.getChildren().clear();
        AnchorPane load = FXMLLoader.load(getClass().getResource("/view/LoginForm.fxml"));
        ancRegister.getChildren().add(load);
    }

    @FXML
    void btnSignUpOnAction(ActionEvent event) throws IOException {
        try {
            String name = txtUsername.getText();
            String email = txtEmail.getText();
            int phone = Integer.parseInt(txtPhone.getText());
            int password = Integer.parseInt(txtPassword.getText());
            int confirmPassword = Integer.parseInt(txtConfirmPassword.getText());

            if (password != confirmPassword) {
                new Alert(Alert.AlertType.WARNING, "Passwords do not match!").show();
                return;
            }

            UserDTO userDTO = new UserDTO(name, email , phone, password);

            boolean isSaved = userBO.saveUser(userDTO);

            if (isSaved) {
                new Alert(Alert.AlertType.INFORMATION, "User registered successfully!").show();
                refreshPage();
            } else {
                new Alert(Alert.AlertType.ERROR, "Failed to registered user!").show();
            }
        } catch (NumberFormatException e) {
            new Alert(Alert.AlertType.ERROR, "Phone number or password must be numeric!").show();
        } catch (Exception e) {
            e.printStackTrace();
            new Alert(Alert.AlertType.ERROR, "Error occurred while saving user!").show();
        }
    }

    private void refreshPage() {
        selectedUserId = null;
        txtUsername.clear();
        txtEmail.clear();
        txtPhone.clear();
        txtPassword.clear();
        txtConfirmPassword.clear();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        userBO = (UserBO) BOFactory.getBoFactory().getBO(BOFactory.BOType.USER);
    }
}
