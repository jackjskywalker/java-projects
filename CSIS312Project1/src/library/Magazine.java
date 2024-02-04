/* Magazine class as part of the Library program
 * @author bent3
 * @collaborator JSWILD
 */

package library;

public class Magazine extends Media {

    double issueCost;
    int issuesPerYear;
    
    public Magazine(String title, String publicationDate, double issueCost, int issuesPerYear) {
        
        super(title, publicationDate);
        
        this.issueCost = issueCost;
        this.issuesPerYear = issuesPerYear;
    }

    @Override
    public String print() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getCost() {
        return issueCost;
    }
}
