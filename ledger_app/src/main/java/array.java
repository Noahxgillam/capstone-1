//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//
//public class array {
//    private static ArrayList<List> transactions(String List) {
//        String transaction_file = "src/main/resources/transactions.csv";
//        ArrayList<List> list = new ArrayList<>();
//
//        try {
//            FileReader fileReader = new FileReader("transactions.csv");
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//            String input;
//            while ((input = bufferedReader.readLine()) != null) {
//                System.out.println(input);
//            }
//                bufferedReader.close();
//
//            }
//            catch(IOException e) {
//                e.printStackTrace();
//            }
//
//
//        return list;
//    }
//
//
//}