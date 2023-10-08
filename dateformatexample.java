import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class dateformatexample {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Date formate change by abhi");
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = formatter.format(date);
        System.out.println("Date format with MM/dd/yyyy"+strDate);

        formatter = new SimpleDateFormat("dd-m-yyyy hh:mm:ss");
        strDate = formatter.format(date);
        System.out.println("Date format with dd-m-yyyy hh:mm:ss "+strDate);
    
         formatter = new SimpleDateFormat("dd-m-yyyy hh:mm:ss");
        strDate = formatter.format(date);
        System.out.println( "Date Format with dd MMMM yyyy "+strDate);
 
         formatter = new SimpleDateFormat("dd-m-yyyy hh:mm:ss");
        strDate = formatter.format(date);
        System.out.println(" Date Format with dd MMMM yyyy zzzz"+strDate);
   
        formatter = new SimpleDateFormat("dd-m-yyyy hh:mm:ss");
        strDate = formatter.format(date);
        System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : "+strDate);   
    }
}
