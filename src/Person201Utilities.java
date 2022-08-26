import java.io.*;
import java.util.*;
import java.net.*;

/**
 * Read from files provided in assignment
 * to illustrate reading, parsing strings from
 * lines, and creating Person201 objects
 * @author Brandon Fain
 * @author Owen Astrachan
 */

public class Person201Utilities {

    public static List<Person201> sameBuilding(Person201[] people, Person201 person) {
        List<Person201> sameDorm = new ArrayList<>();
        for (Person201 p : people) {
            if (!p.equals(person) && p.sameBuilding(person)) {
                sameDorm.add(p);
            }
        }
        return sameDorm;
    }

    /* 
     * TODO: Fix to return a List of all people who are not equal to 
     * person but are on the same floor in the same building
    */
    public static List<Person201> sameFloor(Person201[] people, Person201 person) {
        List<Person201> sameFloor = new ArrayList<>();

        return sameFloor;
    }

    public static Person201[] readFile(String fname) throws IOException {
        Scanner s = new Scanner(new File(fname));
        ArrayList<Person201> list = new ArrayList<>();

        while (s.hasNextLine()) {
            String line = s.nextLine();
            String[] data = line.split(", ");
            Person201 p = new Person201(data[0], data[1], Integer.parseInt(data[2]));
            list.add(p);
        }

        s.close();
        return list.toArray(new Person201[0]);
    }

    public static Person201[] readURL(String url) throws IOException {

        BufferedInputStream input = new BufferedInputStream(new URL(url).openStream());
        Scanner s = new Scanner(input);
        ArrayList<Person201> list = new ArrayList<>();

        while (s.hasNextLine()) {
            String line = s.nextLine();
            String[] data = line.split(", ");
            Person201 p = new Person201(data[0], data[1], Integer.parseInt(data[2]));
            list.add(p);
        }

        s.close();
        return list.toArray(new Person201[0]);
    }

    public static void printPeople(List<Person201> people) {
        for (Person201 p : people) {
            System.out.println("\t-" + p);
        }
        System.out.println();
    }

}
