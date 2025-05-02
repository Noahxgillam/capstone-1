import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class add_trans {
    private String description;
    private String vendor;
    private double amount;
    public static void main(String[] args) {

    }

//            public main (String description, String vendor, double amount) {
//                this.nowT = LocalDateTime.now();
//                this.depositdesc = description;
//                this.vendor = vendor;
//                this.depositamount = amount;
//
//
//        String transaction_file = "src/main/resources/transactions.csv";
//        DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("yyyy dd, MM HH:mm:ss");
//        LocalDateTime nowT = LocalDateTime.now();
//        String fmtDT = nowT.format(fmt);
//
//        try (BufferedWriter fwriter = new BufferedWriter(new FileWriter(transaction_file, true))) {
//            fwriter.write(fmtDT + "|" + description + "|" + amount);
//            fwriter.newLine();
//                System.out.println("Transaction success");
//                catch (IOException) {
//                        System.out.println("Transaction failed");
//                    }
//                }
//        }
    }

