import java.util.ArrayList;

public class NamesList {

    ArrayList listOfNames;

    public void setList() {
        listOfNames = new ArrayList();
        listOfNames.add("Toni Riera");
        listOfNames.add("Miquel Veny");
        listOfNames.add("Marga Colomar");
        listOfNames.add("Pere Sureda");

        System.out.println("Names list: " + listOfNames);
        System.out.println("Size of the list: " + listOfNames.size());
    }

    public void manipulateList() {
        listOfNames.remove("Miquel Veny");

        System.out.println("New Names list: " + listOfNames);
        System.out.println("Size of the list: " + listOfNames.size());

        listOfNames.add(2,"Miquel Veny");

        System.out.println("New Names list: " + listOfNames);
        System.out.println("Size of the list: " + listOfNames.size());
    }
}
