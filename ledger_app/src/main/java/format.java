import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class format {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();

        DateTimeFormatter fmt =
                DateTimeFormatter.ofPattern("yyyy dd, MM HH:mm:ss");
        String formattedDate = today.format(fmt);
    }
}
