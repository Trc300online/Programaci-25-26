import java.util.ArrayList;

public class VacationScaleTwo {
    public ArrayList vacationDays;
    
    public void setVacationScale(){
        vacationDays = new ArrayList(7);
        vacationDays.add(10);
        vacationDays.add(15);
        vacationDays.add(15);
        vacationDays.add(15);
        vacationDays.add(20);
        vacationDays.add(20);
        vacationDays.add(25);
    }

    public void displayVacationDays() {
        for(int i = 0; i < vacationDays.size(); i++) {
            System.out.println("vacations for " + i + " years of service is: " + vacationDays.get(i));
        }
    }
}
