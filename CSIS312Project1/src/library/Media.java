/* Media class as part of the Library program
 * @author bent3
 * @collaborator JSWILD
 */

package library;

public abstract class Media implements MediaUtility {
    protected String title;
    protected String publicationDate;
    
    public Media (String title, String publicationDate) {
        this.title = title;
        this.publicationDate = publicationDate;
    }
    
    public String getTitle() {
        return title;
    }
    
    int compareTo() {
        return 0;
    }
    
    String getPublicationDate() {
        return publicationDate;
    }

    public abstract double getCost();
}
