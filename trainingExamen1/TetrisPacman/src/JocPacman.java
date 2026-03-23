import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JocPacman {

    char[][] tauler;
    int pacmanX;
    int pacmanY;
    List<int[]> ghosts = new ArrayList<>();
    int totalPunts;

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

        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[0].length; j++) {
                if (tauler[i][j] == '.') {
                    totalPunts++;
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

        boolean gameContinue = true;

        while (gameContinue) {
            printTauler();
            pacmanMove();
            if (!checkPos()) {
                gameContinue = false;
            }
            if (totalPunts <= 0) {
                gameContinue = false;
                System.out.println("You Win!!!");
            }
            ghostsMove();
            if (!checkPos()) {
                gameContinue = false;
            }
        }
    }

    public void pacmanMove() {
        Scanner input = new Scanner(System.in);
        char dir = input.next().charAt(0);

        switch (dir) {
            case 'w':
                if (tauler[pacmanX - 1][pacmanY] != '#') {
                    --pacmanX;
                    calcPoints(pacmanX, pacmanY);
                    break;
                } else {
                    System.out.println("Moviment invalid, tria un altra moviment");
                    //pacmanMove();
                    jugar();
                }
            case 'a':
                if (tauler[pacmanX][pacmanY - 1] != '#') {
                    --pacmanY;
                    calcPoints(pacmanX, pacmanY);
                    break;
                } else {
                    System.out.println("Moviment invalid, tria un altra moviment");
                    //pacmanMove();
                    jugar();
                }
            case 's':
                if (tauler[pacmanX + 1][pacmanY] != '#') {
                    ++pacmanX;
                    calcPoints(pacmanX, pacmanY);
                    break;
                } else {
                    System.out.println("Moviment invalid, tria un altra moviment");
                    //pacmanMove();
                    jugar();
                }
            case 'd':
                if (tauler[pacmanX][pacmanY + 1] != '#') {
                    ++pacmanY;
                    calcPoints(pacmanX, pacmanY);
                    break;
                } else {
                    System.out.println("Moviment invalid, tria un altra moviment");
                    //pacmanMove();
                    jugar();
                }
            default:
                System.out.println("tecla invalida, tira un atra vegada");
                //pacmanMove();
                jugar();
        }
    }

    public void ghostsMove() {
        int count = 0;
        for (int[] ghost : ghosts) {
            ghosts.set(count, checkMove(ghost[0], ghost[1]));
        }
    }

    public int[] checkMove(int i, int j) {
        int dir = (int) ((Math.random() * 4) + 1);
        int[] ghostNext = new int[2];

        switch (dir) {
            case 1:
                if (tauler[i - 1][j] != '#') {
                    ghostNext[0] = --i;
                    ghostNext[1] = j;
                    return ghostNext;
                } else {
                    checkMove(i, j);
                }
            case 2:
                if (tauler[i][j - 1] != '#') {
                    ghostNext[0] = i;
                    ghostNext[1] = --j;
                    return ghostNext;
                } else {
                    checkMove(i, j);
                }
            case 3:
                if (tauler[i + 1][j] != '#') {
                    ghostNext[0] = ++i;
                    ghostNext[1] = j;
                    return ghostNext;
                } else {
                    checkMove(i, j);
                }
            case 4:
                if (tauler[i][j + 1] != '#') {
                    ghostNext[0] = i;
                    ghostNext[1] = ++j;
                    return ghostNext;
                } else {
                    checkMove(i, j);
                }
            default:
                ghostNext[0] = i;
                ghostNext[1] = j;
                return ghostNext;
        }
    }

    public boolean checkPos() {
        boolean pacmanAlive = true;

        for (int[] ghost : ghosts) {
            if (ghost[0] == pacmanX && ghost[1] == pacmanY) {
                pacmanAlive = false;
                System.out.println("Game Over!!!");
            }
        }

        return pacmanAlive;
    }

    public void calcPoints(int i, int j) {
        if (tauler[i][j] == '.') {
            tauler[i][j] = ' ';
            totalPunts--;
        }
    }
}
