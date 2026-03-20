import java.util.ArrayList;
import java.util.List;

public class JocPacman {

    char[][] tauler;
    int pacmanX;
    int pacmanY;
    List<int[]> ghosts = new ArrayList<>();

    public JocPacman(char[][] taulerInicial) {
        this.tauler = new char[taulerInicial.length][taulerInicial[0].length];
        for (int i = 0; i < taulerInicial.length; i++) {
            for (int j = 0; j < taulerInicial[0].length; j++) {
                if (taulerInicial[i][j] == 'P') {
                    pacmanX = i;
                    pacmanY = j;
                    tauler[i][j] = ' ';
                } else if (taulerInicial[i][j] == 'G') {
                    ghosts.add(new int[]{i, j});
                    tauler[i][j] = '.';
                } else {
                    tauler[i][j] = taulerInicial[i][j];
                }
            }
        }
    }

    public void printTauler() {
        for (int i = 0; i < tauler.length; i++) {
            System.out.println();
            for (int j = 0; j < tauler[0].length; j++) {
                if (i == pacmanX && j == pacmanY) {
                    System.out.print("P");
                } else if (isGhost(i, j)) {
                    System.out.print("G");
                } else {
                    System.out.print(tauler[i][j]);
                }
            }
        }

    }

    public boolean isGhost(int i, int j) {
        for (int[] ghost : ghosts) {
            if (ghost[0] == i && ghost[1] == j) {
                return true;
            }
        }

        return false;
    }

    public void jugar() {

        while (true) {
            printTauler();
            pacmanMove();
            checkPos();
            ghostsMove();
            checkPos();
        }
    }
}
