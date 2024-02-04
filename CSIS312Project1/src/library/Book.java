/* Book class as part of the Library program
 * @author JSWILD
 * @collaborator bent3
 */

package library;
public class Book extends Media {

    // Initialize private instance variables
    String author;
    double cost;

    // Declare a constructor for Book class
    public Book(String title, String publicationDate, String author, double cost) {
        super(title, publicationDate);
        this.author = author;
        this.cost = cost;
    }

    // Convert Book to specified String format
    public String print() {
        return String.format("b, %s , %s, %s, %s", title, publicationDate, author, cost);
    }

    // Access cost value
    @Override
    public double getCost() {
        return cost;
    }

    // Access author data
    public String getAuthor() {
        return author;
    }
}
