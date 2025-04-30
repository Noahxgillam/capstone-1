import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;

public class Ledgar {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("transactions.csv.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
