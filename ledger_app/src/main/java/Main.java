import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static <elif> void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome user \n What would you like to do? " +
                "\n D) Add Deposit \n P) Make payment (Debit) \n L) Ledger" +
                "\n X) Exit");
        String choice = System.in("pick an option: ").strip().upper;

        if (choice == "D");
            new add_deposit();

        elif choice == "P";
           new make_payment();

            elif choice == "L";
           new Ledgar();

            elif choice == "X"
        System.out.println("Exiting application...");

            break;
        else
        System.out.println("Invalid choice, try again.");


}


    }

