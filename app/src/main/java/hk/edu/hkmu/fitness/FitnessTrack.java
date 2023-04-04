package hk.edu.hkmu.fitness;

import java.util.ArrayList;
import java.util.HashMap;

// A utility class for creating fitness list
public class FitnessTrack {
    public static String TITLE = "title"; // used in "new String []..." in MainActivity program
    public static String DISTRICT = "district"; // used in "new String []..." in MainActivity program
    public static String ROUTE = "route"; // used in "new String []..." in MainActivity program
    public static String HOW_TO_ACCESS = "HowToAccess"; // used in "new String []..." in MainActivity program
    public static String MAP_URL = "MapURL";

    // "fitnessList" variable used for storing all fitness that retrieved from JSON
    // it is used in JsonHandlerThread and also MainActivity program
    public static ArrayList<HashMap<String, String>> fitnessList = new ArrayList<>();

    // addContact is a function
    // Creates and add fitness to fitness list
    // x4 input, representing name, email, address and mobile
    public static void addFitness (String title, String district, String route, String HowToAccess, String MapURL) {
        // Create fitness
        HashMap<String, String> fitness = new HashMap<>();
        fitness.put(TITLE, title);
        fitness.put(DISTRICT, district);
        fitness.put(ROUTE, route);
        fitness.put(HOW_TO_ACCESS, HowToAccess);
        fitness.put(MAP_URL, MapURL);

        // Add fitness to fitnesslist
        fitnessList.add(fitness);
    }
    public static void emptyFitness (){
        // Clear the array in case of infinite accumulative tracks
        fitnessList.clear();
    }
}
