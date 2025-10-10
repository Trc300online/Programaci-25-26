import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        integerOverflow();
        impSentece();
        act3();

    }


    public static void integerOverflow() {
        int x = 1;
        int i;
        for(i = 1; i < 32; i++) {
            x+=x;
            System.out.println(x);
        }
    }

    public static void impSentece() {
        String[] words = {"saber", "es", "poder"};
        System.out.println("saber es poder");
        System.out.println();
        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }
        System.out.println("==================");
        System.out.println("| saber es poder |");
        System.out.println("==================");
    }

    public static void act3() {
        Scanner real = new Scanner(System.in);
        System.out.println("introdueix un nombre real:");
        double nReal = real.nextDouble();

        Scanner enter = new Scanner(System.in);
        System.out.println("introdueix un nombre enter:");
        int nEnter = enter.nextInt();

        double div = nReal/nEnter;
        System.out.println(div);

        int mod = (int) div%nEnter;
        System.out.println(mod);

    }
}