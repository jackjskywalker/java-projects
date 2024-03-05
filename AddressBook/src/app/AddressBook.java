/* CSIS312 - Assignment 4: Address Book Program
** By Ben Turner & Jack Skywalker (Baijun Jiang)
** Resources: https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/TableView.html
*/

package app;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.io.FileOutputStream;
import java.io.IOException;

public class AddressBook {

    public class Contact {
        private StringProperty firstName;
        public void setFirstName(String value) { firstNameProperty().set(value); }
        public String getFirstName() { return firstNameProperty().get(); }
        public StringProperty firstNameProperty() {
            if (firstName == null) firstName = new SimpleStringProperty(this, "firstName");
            return firstName;
        }

        private StringProperty lastName;
        public void setLastName(String value) { lastNameProperty().set(value); }
        public String getLastName() { return lastNameProperty().get(); }
        public StringProperty lastNameProperty() {
            if (lastName == null) lastName = new SimpleStringProperty(this, "lastName");
            return lastName;
        }
    }



}
