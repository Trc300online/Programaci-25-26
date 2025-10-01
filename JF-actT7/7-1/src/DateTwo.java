public class DateTwo {
    public int dayNumber = 5;

    public void displayDay() {
        if( dayNumber == 1 ) {
            System.out.println("Avui es dilluns");
        } else if( dayNumber == 2) {
            System.out.println("Avui es dimarts");
        } else if( dayNumber == 3) {
            System.out.println("Avui es dimecres");
        } else if( dayNumber == 4) {
            System.out.println("Avui es dijous");
        } else if( dayNumber == 5) {
            System.out.println("Avui es divendres");
        } else if( dayNumber == 6) {
            System.out.println("Avui es dissabte");
        } else if( dayNumber == 7) {
            System.out.println("Avui es diumenge");
        } else {
            System.out.println("Dia no valid!!!");
        }
    }
}
