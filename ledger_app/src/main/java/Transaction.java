import java.time.LocalDate;
import java.time.LocalTime;

public class Transaction {
    LocalDate date;
    LocalTime time;
    String description;
    String vendor;
    double amount;

    void setDescription(String d) {
        this.description = d;
    }

    String getDescription() {
        return this.description;
    }

    void setAmount(double a) {
        this.amount = a;
    }
    double getAmount() {
        return this.amount;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
}
