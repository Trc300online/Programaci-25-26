public class Main {
    public static void main(String[] args) {
        int Distr = 4;
        int M = 50;
        int P = 5;

        int[] esconsPerDistricte = {2, 1, 3, 4};

        int[][] disticte_electorVots = {{1, 1, 0, 3, 5, 4, 2, 1, 5},
                                        {2, 2, 3, 0, 0, 1, 4, 5, 1},
                                        {5, 4, 0, 0, 0, 1, 2, 3, 4},
                                        {3, 2, 2, 4, 4, 5, 1, 1, 3}};

        int[][] dist_part =calcularDistr_partits(disticte_electorVots, P, Distr);

        analitzResult(esconsPerDistricte, dist_part);

    }

    public static int[][] calcularDistr_partits(int[][] disticte_electorVots, int P, int Distr) {
        int[][] dist_part = new int[Distr][P];

        for (int i = 0; i < disticte_electorVots.length; i++){
            for (int j = 0; j < disticte_electorVots[i].length; j++){
                if (disticte_electorVots[i][j] <= 0) {
                    dist_part[0][0] += 0;
                } else {
                    dist_part[i][disticte_electorVots[i][j] -1] += 1;
                }
            }
        }

        System.out.print("calcular una matriu districtes / partits\n");
        for (int i = 0; i < Distr; i++) {
            System.out.println();
            for (int j = 0; j < P; j++) {
                System.out.print(dist_part[i][j] + ", ");
            }
        }

        return dist_part;

    }

    public static void analitzResult(int[] esconsPerDistricte, int[][] dist_part) {
        int[][] analitzat = new int[dist_part.length][dist_part[0].length];
        int max = 0;


        for (int i = 0; i < dist_part.length; i++) {
            int iMax = -1;
            int jMax = -1;

            while (esconsPerDistricte[i] != 0) {
                for (int j = 1; j < dist_part[i].length; j++) {
                    if (dist_part[i][j] < dist_part[i][j-1]) {
                        iMax = i;
                        jMax = j -1;
                    }
                }
                analitzat[iMax][jMax]++;
                dist_part[iMax][jMax] = 0;

                esconsPerDistricte[i]--;
            }

        }
        System.out.println();
        System.out.println();

        System.out.print("analisis");
        for (int i = 0; i < esconsPerDistricte.length; i++) {
            System.out.println();
            for (int a = 0; a < analitzat[0].length; a++) {
                System.out.print(analitzat[i][a] + ", ");
            }
        }

        System.out.println();
        for (int i = 0; i < esconsPerDistricte.length; i++) {
            System.out.println();
            for (int j = 0; j < analitzat[0].length; j++) {
                System.out.print(dist_part[i][j] + ", ");
            }
        }

    }
}


/*

4 districtes
5 partits
0 = vot nul o NO vot

escons per districtes = { 2 , 3 , 1 , 5 }

Mat Districtes / electors on cada element ens diu a quin partit ha votat l'elector k del districte r
1 0 3 4 2 5 1 3 2 0
1 0 3 4 2 5 1 3 2 0
1 0 3 4 2 5 1 3 2 0
1 0 3 4 2 5 1 3 2 0

calcular una matriu districtes / partits

2 2 2 1 1
2 2 2 1 1
2 2 2 1 1
2 2 2 1 1


analitzar linia a linia la mat anterior

1 1 0 0 0
1 1 1 0 0
1 0 0 0 0
2 2 1 0 0

escons per partit vetor de partits amb contingut escons de cada partit ( acumulat per partit )

5 4 2 0 0








 */