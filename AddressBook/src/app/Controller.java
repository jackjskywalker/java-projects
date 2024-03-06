/* CSIS312 - Assignment 4: Address Book Program
 ** By Ben Turner & Jack Skywalker (Baijun Jiang)
 ** Resources:
 ** https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/TableView.html
 ** https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/TableColumn.html
 */

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

    // Action Elements

    @FXML
    void clearEntry(ActionEvent event) {
        firstNameInputField.clear();
        lastNameInputField.clear();
        birthdayInputField.clear();
        addressInputField.clear();
        cityInputField.clear();
        stateInputField.clear();
        zipInputField.clear();
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

    // Table Content Elements

    @FXML
    private TableView<AddressBook.Contact> addressBookTable;

    @FXML
    private TableColumn<AddressBook.Contact, String> firstNameColumn;

    @FXML
    private TableColumn<AddressBook.Contact, String> lastNameColumn;

    @FXML
    private TableColumn<AddressBook.Contact, String> birthdayColumn;

    @FXML
    private TableColumn<AddressBook.Contact, String> addressColumn;

    @FXML
    private TableColumn<AddressBook.Contact, String> cityColumn;

    @FXML
    private TableColumn<AddressBook.Contact, String> stateColumn;

    @FXML
    private TableColumn<AddressBook.Contact, Integer> zipColumn;

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

}

