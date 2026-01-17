import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateManipulator {
    Date myDate = new Date();
    SimpleDateFormat simpleDF = new SimpleDateFormat("MM/dd/yyyy");

    public void parseDate (String dateString) {
        try {
            String formattedDateString;
            myDate = simpleDF.parse(dateString);
            System.out.println("the parse method was successful");
            System.out.println("Date with native format: " + myDate);
            formattedDateString = simpleDF.format(myDate);
            System.out.println("formated date: " + formattedDateString);
        } catch (ParseException ex) {
            System.out.println(ex);
        }

    }
}


