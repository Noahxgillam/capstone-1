public class add_deposit {
    public static void main(String[] args) {
        String description = System.in("enter description: ");
        String vendor = System.in("enter vendor: ");
        String amount = System.in("enter amount: ");
        String add_transaction = ("Deposit"+ description + vendor + amount);
    }
}
