import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;

public class Ledgar {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("transactions.csv.txt");
            System.out.println("\n Ledger accessing");
        } catch (FileNotFoundException e) {
            System.out.println("no file found");
            throw new RuntimeException(e);
        }
    }
}
