public class Main {
    public static void main(String[] args) {
        String[] partitName = {"p1", "p2", "p3", "p4", "p5"};
        int[] votsPartit = {340000, 280000, 160000, 60000, 15000};
        double minVotPerCent = 0.05;
        int[] esconsPartit = new int[partitName.length];
        boolean[] superaVotMin = new boolean[partitName.length];
        int esconsARepartir = 7;

        int minVot = calcVotMin(votsPartit, minVotPerCent);

        superaVotMin = checkMinVots(superaVotMin, votsPartit, minVot);

        esconsPartit = repartiment(esconsARepartir, votsPartit, superaVotMin, esconsPartit);

        for (int i = 0; i < esconsPartit.length; i++) {
            System.out.println(esconsPartit[i]);
        }
    }

    public static int calcVotMin(int[] votsPartit, double minVotPerCent) {
        int minVot = 0;
        int total = 0; //faltava inicialitzar

        for (int i = 0; i < votsPartit.length; i++) {
            total += votsPartit[i];
        }

        minVot = (int) (total * minVotPerCent); //faltava castear resultat from double to int

        return minVot;
    }

    public static boolean[] checkMinVots(boolean[] superaVotMin, int[] votsPartit, int minVot) {
        boolean[] checked = new boolean[superaVotMin.length];

        for (int i = 0; i < checked.length; i++) {
            if (votsPartit[i] >= minVot) {
                checked[i] = true;
            } else {
                checked[i] = false;
            }
        }

        return checked;
    }

    public static int[] repartiment(int esconsARepartir, int[] votsPartit, boolean[] superaVotMin, int[] esconsPartit) {
        while (esconsARepartir > 0) {
            int tmpMax = 0;
            int indexMax = -1;

            for (int i = 0; i < votsPartit.length; i++) {
                if (superaVotMin[i] == true) {
                    int tmp = votsPartit[i]/(esconsPartit[i] + 1);
                    if (tmp > tmpMax) {
                        tmpMax = tmp;
                        indexMax = i;
                    }
                }
            }

            esconsPartit[indexMax]++;
            esconsARepartir--;
        }

        return esconsPartit;
    }
}