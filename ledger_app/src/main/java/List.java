//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class List {
//    public static void main(String args[]) {
//        try {
//            FileInputStream list = new FileInputStream("transactions.csv.txt");
//            Scanner scanner = new Scanner(list);
//            String input;
//
//            while (scanner.hasNextLine()) {
//                input = scanner.nextLine();
//                System.out.println(input);
//            }
//
//            scanner.close();
//        } catch (IOException e) {
//
//            e.printStackTrace();
//        }
//
//    }
//}