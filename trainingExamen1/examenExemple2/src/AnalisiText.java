public class AnalisiText {
    public static void main(String[] args) {

        char[] delimitadors = {' ', '\'', '-', ',', '.', '!', '?'};
        String provaExecucio = "Una noia anomenada Anna va anar a cercar al b)osc un home, alla hi va trobar un cec que intentava trobar un figura de metall d'un cuc ben rar. Astorada li va dir que si no ho intentava amb un radar no crec que el trobis. Amb un aparell d'aquests que fan pipiripip segur que el trobraras encara que estigui ben tapat !";
        char[] x = stringToCharArray(provaExecucio);
        printCharsArray(x);
        System.out.println();
        System.out.println(checkDelimitators(x, delimitadors, 3));
        System.out.println();
        System.out.println(checkStartWord(x, delimitadors,15));
        System.out.println();
        System.out.println(checkLength(x, delimitadors, 10));
        System.out.println();
        System.out.println(returnWord(x, delimitadors, 4));
        System.out.println();
        System.out.println(palindrom("anna"));
        System.out.println();
        System.out.println(countPalindrom(x, delimitadors));

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

    public static boolean checkStartWord(char[] text, char[] delim, int pos) {
        boolean isStart = false;
        if (pos < 0 || pos > text.length - 1) {
            System.out.println("posició fora del text, resultat indiferent");
            return false;
        } else {
            if (pos == 0) {
                isStart = true;
            } else {
                for (int i = 0; i < delim.length; i++) {
                    if (text[pos -1] == delim[i]) {
                        isStart = true;
                    }
                }
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
            while (pos < text.length && !checkDelimitators(text, delim, pos)){
                length++;
                pos++;
            }
            return length;
        }
    }

    public static String returnWord(char[] text, char[] delim, int pos) {
        String word = "";
        if (checkStartWord(text, delim, pos)) {
            for (int i = 0; i < checkLength(text, delim, pos); i++) {
                word += text[pos + i];
            }
        } else {
            System.out.println("la posició indicada no es inici de paraula");
        }

        return word;
    }

    public static boolean palindrom(String word) {
        boolean esPalindrom = true;
        char[] wordToChar = stringToCharArray(word);
        for (int i = 0; i < wordToChar.length/2; i++) {
            if (wordToChar[i] != wordToChar[wordToChar.length -1 - i]) {
                esPalindrom = false;
                break;
            }
        }
        return esPalindrom;
    }

    public static int countPalindrom(char[] text, char[] delim) {
        int counter = 0;
        for (int i = 0; i < text.length; i++) {
            if (checkStartWord(text, delim, i)) {
                String word = returnWord(text, delim, i);
                if (word.length() > 1 && palindrom(word)){
                    counter++;
                }
            }
        }

        return counter;
    }
    // TODO: act 10-16.
}
