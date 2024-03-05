package app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    AddressBook AD;
    @Override
    public void initialize(URL url, ResourceBundle rb) { AD = new AddressBook(); }

    // Table Content Elements

    @FXML
    private TableView<?> addressBookTable;

    @FXML
    private TableColumn<?, ?> firstNameColumn;

    @FXML
    private TableColumn<?, ?> lastNameColumn;

    @FXML
    private TableColumn<?, ?> birthdayColumn;

    @FXML
    private TableColumn<?, ?> addressColumn;

    @FXML
    private TableColumn<?, ?> cityColumn;

    @FXML
    private TableColumn<?, ?> stateColumn;

    @FXML
    private TableColumn<?, ?> zipColumn;

    // Entry Input Elements

    @FXML
    private TextField firstNameInputField;

    @FXML
    private TextField lastNameInputField;

    @FXML
    private TextField birthdayInputField;

    @FXML
    private TextField addressInputField;

    @FXML
    private TextField cityInputField;

    @FXML
    private TextField stateInputField;

    @FXML
    private TextField zipInputField;

    // Button Elements

    @FXML
    private Button clearButton;

    @FXML
    private Button findButton;

    @FXML
    private Button updateButton;

    @FXML
    private Button deleteButton;

    // Action Elements

    @FXML
    void clearEntry(ActionEvent event) {

    }

    @FXML
    void deleteEntry(ActionEvent event) {

    }

    @FXML
    void findEntry(ActionEvent event) {

    }

    @FXML
    void updateEntry(ActionEvent event) {

    }

}

