public class AnalisiText {
    public static void main(String[] args) {

        char[] delimitadors = {' ', '\'', '-', ',', '.', '!', '?'};
        String provaExecucio = "Una noia anomenada Anna va anar a cercar al b)osc un home, alla hi va trobar un cec que intentava trobar un figura de metall d'un cuc ben rar. Astorada li va dir que si no ho intentava amb un radar no crec que el trobis. Amb un aparell d'aquests que fan pipiripip segur que el trobraras encara que estigui ben tapat !";
        char[] x = stringToCharArray(provaExecucio);
        printCharsArray(x);
        System.out.println();
        System.out.println(checkDelimitators(x, delimitadors, 3));
        System.out.println();
        System.out.println(checkStartWord(x, 15));
        System.out.println();
        System.out.println(checkLength(x, delimitadors, 10));

    }

    public static char[] stringToCharArray(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < chars.length; i++) {
            char c = text.charAt(i);
            chars[i] = Character.toLowerCase(c);
        }

        return chars;
    }

    public static void printCharsArray(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }

    public static boolean checkDelimitators(char[] text, char[] delim, int pos) {
        boolean isDelim = false;
        if (pos < 0 || pos > text.length - 1) {
            System.out.println("posició fora del text, resultat indiferent");
            return false;
        } else {
            for (int i = 0; i < delim.length; i++) {
                if (text[pos] == delim[i]) {
                    isDelim = true;
                    break;
                }
            }
        }
        return isDelim;
    }

    public static boolean checkStartWord(char[] text, int pos) {
        char space = ' ';
        boolean isStart = false;
        if (pos < 0 || pos > text.length - 1) {
            System.out.println("posició fora del text, resultat indiferent");
            return false;
        } else {
            if (pos == 0 || text[pos -1] == space) {
                isStart = true;
            }
        }
        return isStart;
    }

    public static int checkLength(char[] text, char[] delim, int pos) {
        int length = 0;
        if (pos < 0 || pos > text.length - 1) {
            System.out.println("posició fora del text, resultat indiferent");
            length = -1;
            return length;
        } else {
            while (!checkDelimitators(text, delim, pos)){
                length++;
                pos++;
            }
            return length;
        }
    }

    // TODO: act 7-16.
}
