import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println("Reading from file : " + args[0]);
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("Fitxer no especificat!");
            System.exit(1);
        }

        try (BufferedReader b = new BufferedReader( new FileReader(args[0]))) {
            String s = null;
            while ((s = b.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("Fitxer no existent!!");
            System.exit(1);
        } catch (IOException ioe) {
            System.out.println("Error llegint el fitxer: " + ioe.getMessage());
            System.exit(1);
        }
    }
}