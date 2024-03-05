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
    public void initialize(URL url, ResourceBundle rb) {
        AD = new AddressBook();
    }
    @FXML
    private TableView<?> addressBookTable;

    @FXML
    private TableColumn<?, ?> addressColumn;

    @FXML
    private TextField addressInputField;

    @FXML
    private TableColumn<?, ?> birthdayColumn;

    @FXML
    private TextField birthdayInputField;

    @FXML
    private TableColumn<?, ?> cityColumn;

    @FXML
    private TextField cityInputField;

    @FXML
    private Button clearButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Button findButton;

    @FXML
    private TableColumn<?, ?> firstNameColumn;

    @FXML
    private TextField firstNameInputField;

    @FXML
    private TableColumn<?, ?> lastNameColumn;

    @FXML
    private TextField lastNameInputField;

    @FXML
    private TableColumn<?, ?> stateColumn;

    @FXML
    private TextField stateInputField;

    @FXML
    private Button updateButton;

    @FXML
    private TableColumn<?, ?> zipColumn;

    @FXML
    private TextField zipInputField;

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

