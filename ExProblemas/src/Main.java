import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        integerOverflow();
        impSentece();
        act3();
        fahrenheitConvertor();
        act5();
        act6();
        changeCounter();
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

    public static void fahrenheitConvertor() {
        double celsius = 25;
        double fahrenheit;

        double fase1 = celsius * (9.00/5.00);
        fahrenheit = fase1 + 32;
        System.out.printf("%.4f%n", fahrenheit);
    }

    public static void act5() {
        Scanner sNom = new Scanner(System.in);
        System.out.println("nom: ");
        String nom = sNom.nextLine();

        Scanner sEdad = new Scanner(System.in);
        System.out.println("edad: ");
        byte edad = sEdad.nextByte();

        Scanner sAltura = new Scanner(System.in);
        System.out.println("altura: ");
        double altura = sAltura.nextDouble();

        System.out.println("nova edad: " + (edad + 2));
        System.out.println("nova altura: " + altura / 2);
    }

    public static void act6() {
        Scanner sName = new Scanner(System.in);
        System.out.println("nom: ");
        String nom = sName.nextLine();

        System.out.println("Hola, "+ nom);
    }

    public static void changeCounter() {
        double dolars;
        int quarter;
        int dime;
        int nickel;
        int penny;

        System.out.println("insert your coins:");
        Scanner sQuarter = new Scanner(System.in);
        System.out.println("Quarters: ");
        quarter = sQuarter.nextInt();

        Scanner sDime = new Scanner(System.in);
        System.out.println("Dimes: ");
        dime = sDime.nextInt();

        Scanner sNickel = new Scanner(System.in);
        System.out.println("Nickels: ");
        nickel = sNickel.nextInt();

        Scanner sPenny = new Scanner(System.in);
        System.out.println("Pennys: ");
        penny = sPenny.nextInt();

        dolars = (quarter * 0.25) + (dime * 0.10) + (nickel * 0.05) + (penny * 0.01);

        System.out.println("USA$" + dolars);
    }
}