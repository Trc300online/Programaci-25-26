public class Main {
    public static void main(String[] args) {

        char[][] taulerInicial = {
                {'#','#','#','#','#','#','#','#','#','#'},
                {'#','P','.','.','.','.','.','.','.','#'},
                {'#','.','#','#','.','.','#','#','.','#'},
                {'#','.','.','.','.','G','.','.','.','#'},
                {'#','#','#','#','#','#','#','#','#','#'}
        };

        JocPacman joc = new JocPacman(taulerInicial);
        joc.jugar();

    }
}