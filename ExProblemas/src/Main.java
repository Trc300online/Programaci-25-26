public class Main {
    public static void main(String[] args) {

        integerOverflow();

    }


    public static void integerOverflow() {
        int x = 1;
        int i;
        for(i = 1; i < 32; i++) {
            x+=x;
            System.out.println(x);
        }
    }
}