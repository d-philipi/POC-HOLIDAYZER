import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Holidays holidays = new Holidays();

        //holidays.getAllHolidays();

        String holiday = holidays.getDate("01/02/2023");

        System.out.println(holiday);

    }
}
