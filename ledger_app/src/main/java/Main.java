import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Transaction> ledger = new ArrayList<Transaction>();

    static Scanner scanner = new Scanner(System.in);
    static String filePath = "src/main/resources/transactions.csv";

    public static void main(String[] args) throws IOException {
        loadTransactions();

        boolean running = true;
        while(running) {
            System.out.println("Welcome user \n What would you like to do? " +
                    "\n D) Add Deposit \n P) Make payment (Debit) \n L) Ledger" +
                    "\n X) Exit");
            String choice = scanner.nextLine().strip().toUpperCase();

            switch (choice) {
                case "D":
                    addDeposit();
                    break;

                case "P":
                    addPayment();
                    break;

                case "L":
                    viewLedger();
                    break;

                case "X":
                    System.out.println("Exiting application");
                    scanner.close();
                    running = false;
                    saveLedger();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void loadTransactions() throws IOException {

        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while((line = bufferedReader.readLine()) != null) {
            String[] lineParts = line.split("\\|");

            Transaction newLedgerEntry = new Transaction();

            LocalDate date = LocalDate.parse(lineParts[0]);
            newLedgerEntry.setDate(date);

            LocalTime time = LocalTime.parse(lineParts[1]);
            newLedgerEntry.setTime(time);

            newLedgerEntry.setDescription(lineParts[2]);

            newLedgerEntry.setVendor(lineParts[3]);

            double amount  = Double.parseDouble(lineParts[4]);
            newLedgerEntry.setAmount(amount);
            ledger.add(newLedgerEntry);
        }
    }

    static void saveLedger() {
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(filePath))) {
            for (Transaction t : ledger) {
                fileWriter.write(t.getDate() + "|" + t.getTime() + "|" + t.getDescription() + "|" + t.getVendor() + "|" + t.getAmount());
                fileWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("File saved");
    }

    static void addDeposit() {
        System.out.print("Enter deposit description: ");
        String description = scanner.nextLine();

        System.out.print("Enter vendor: ");
        String vendor = scanner.nextLine();

        System.out.print("Enter deposit amount: ");
        double amount = Double.parseDouble(scanner.nextLine());

        LocalDate date = LocalDate.now();

        LocalTime time = LocalTime.now();

        Transaction deposit = new Transaction();
        deposit.setAmount(amount);
        deposit.setDescription(description);
        deposit.setVendor(vendor);
        deposit.setDate(date);
        deposit.setTime(time);

        ledger.add(deposit);
    }


    static void addPayment() {
        System.out.print("Enter payment description: ");
        String description = scanner.nextLine();

        System.out.print("Enter vendor: ");
        String vendor = scanner.nextLine();

        System.out.print("Enter payment amount: ");
        double amount;
        amount = Double.parseDouble(scanner.nextLine());
        amount = -1 * amount;

        LocalDate date = LocalDate.now();

        LocalTime time = LocalTime.now();

        Transaction payment = new Transaction();
        payment.setAmount(amount);
        payment.setDescription(description);
        payment.setVendor(vendor);
        payment.setDate(date);
        payment.setTime(time);

        ledger.add(payment);
    }

    static void viewLedger() {
        for (Transaction t : ledger) {
            System.out.println(t.getDate() + " " + t.getTime() + " " + t.getDescription() + " " + t.getVendor() + " " + t.getAmount());
        }
    }

}

