public class DateThreeTest {
  public static void main(String args[]){

    DateThree date = new DateThree();

    date.setDay(15);
    date.setMonth(8);
    date.setYear(2004);

    System.out.println("The date is: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());

    date.setDate(13,8,2004);
    date.displayDate();
  } // end main
} // end class
