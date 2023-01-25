import java.io.IOException;
import java.util.List;

/**
 * @author Brandon Fain
 * @author Owen Astrachan
 * @author Jerone Samari
 * Finds all people near the query Person201, 
 * and prints them according to building and floor
 * Near identical to Person201Demo.java, but includes
 * the people.txt data set instead of the small.txt data set
 */
public class Person201Finder {
    public static void main(String[] args)  throws IOException {
        Person201 query = new Person201("Jerone", "Physics", 1);
        Person201[] people = Person201Utilities.readFile("data/people.txt");
        System.out.println("\nSearching for people near " + query.getName() + "\n");
        
        System.out.println("People on the same floor: ");
        List<Person201> sameFloor = Person201Utilities.sameFloor(people, query);
        Person201Utilities.printPeople(sameFloor);

        System.out.println("People in the same building: ");
        List<Person201> sameBuilding = Person201Utilities.sameBuilding(people, query);
        for (Person201 p : sameFloor) {
            if (sameBuilding.contains(p)) {
                sameBuilding.remove(p);
            }
        }    
        Person201Utilities.printPeople(sameBuilding);
    }
}
