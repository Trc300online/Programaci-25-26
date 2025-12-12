import java.util.ArrayList;

public class SkilledEmployee extends Employee{
    private ArrayList skillList = new ArrayList();

    public void setSkill(String skill) {
        skillList.add(skill);
    }

    public ArrayList getSkillList() {
        return skillList;
    }
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Employee has the following skils:");

        for (int i = 0; i < skillList.size(); i++) {
            System.out.println("\t" + skillList.get(i));
        }
    }
}
