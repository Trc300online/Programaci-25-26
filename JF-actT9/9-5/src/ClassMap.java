public class ClassMap {
    public String[][] deskArray;
    public String name;

    public void setClassMap() {
        deskArray = new String[3][4];
    }

    public void setDesk() {
        boolean assigned = false;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                if(deskArray[i][j] == null) {
                    deskArray[i][j] = name;
                    System.out.println(name + " desk is at " + i + " , " + j);
                    assigned = true;
                    break;
                }
            }
            if(assigned == true) {
                break;
            }
        }
        if(assigned == false) {
            System.out.println("all desks occupied");
        }
    }

    public void displayDeskMap() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(" " + deskArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
