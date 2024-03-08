/* CSIS312 - Assignment 4: Address Book Program
 ** By Ben Turner & Jack Skywalker (Baijun Jiang)
 ** Resources:
 ** https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/TableView.html
 ** https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/TableColumn.html
 */

package app;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    ObservableList<AddressBook> list = FXCollections.observableArrayList(
            new AddressBook("Ben", "Turner", "02/17/04", "551 Slish Rd", "Honesdale", "PA", 18431),
            new AddressBook("Ben", "Turner", "02/17/04", "551 Slish Rd", "Honesdale", "PA", 18431),
            new AddressBook("Ben", "Turner", "02/17/04", "551 Slish Rd", "Honesdale", "PA", 18431)
    );
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<AddressBook, String>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<AddressBook, String>("lastName"));
        birthdayColumn.setCellValueFactory(new PropertyValueFactory<AddressBook, String>("birthday"));
        addressColumn.setCellValueFactory(new PropertyValueFactory<AddressBook, String>("address"));
        cityColumn.setCellValueFactory(new PropertyValueFactory<AddressBook, String>("city"));
        stateColumn.setCellValueFactory(new PropertyValueFactory<AddressBook, String>("state"));
        zipColumn.setCellValueFactory(new PropertyValueFactory<AddressBook, Integer>("zip"));

        addressBookTable.setItems(list);
    }

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
    private TableView<AddressBook> addressBookTable;

    @FXML
    private TableColumn<AddressBook, String> firstNameColumn;

    @FXML
    private TableColumn<AddressBook, String> lastNameColumn;

    @FXML
    private TableColumn<AddressBook, String> birthdayColumn;

    @FXML
    private TableColumn<AddressBook, String> addressColumn;

    @FXML
    private TableColumn<AddressBook, String> cityColumn;

    @FXML
    private TableColumn<AddressBook, String> stateColumn;

    @FXML
    private TableColumn<AddressBook, Integer> zipColumn;

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

