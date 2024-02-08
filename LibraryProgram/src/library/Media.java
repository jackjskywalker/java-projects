/* Media class as part of the Library program
 * @author bent3
 * @collaborator JSWILD
 */

package library;

public abstract class Media implements Comparable<Media>, MediaUtility {

    // Declare protected instance variables
    protected String title;
    protected String publicationDate;

    // Constructor for media class
    public Media(String title, String publicationDate) {
        this.title = title;
        this.publicationDate = publicationDate;
    }

    public int compareTo(Media m) {
        return 0;
    }

    // Access title data
    public String getTitle() {
        return title;
    }

    // Access publicationDate data
    public String getPublicationDate() {
        return publicationDate;
    }

    // Declare abstract getCost method
    public abstract double getCost();

    // Declare abstract print method
    public abstract String print();

}
