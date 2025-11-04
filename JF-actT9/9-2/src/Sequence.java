public class Sequence {
    public int firstNumber = 0;
    public int secondNumber= 1;
    public int nextNumber;
    public final int SEQUENCE_LIMIT = 100;

    public void displaySequence() {
        System.out.print(firstNumber + " " + secondNumber + " ");
        nextNumber = firstNumber + secondNumber;
        while(nextNumber <= SEQUENCE_LIMIT) {
            System.out.print(nextNumber + " ");
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            nextNumber = firstNumber + secondNumber;
        }
        System.out.println();
    }
}
