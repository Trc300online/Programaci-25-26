public class GuessingGame {
    public static void main(String[] args) {
        int randomNum= 0;
        int guess;

        if(args.length == 0 || args[0].compareTo("help") == 0) {
            System.out.println("Usage: java GuessingGame [argument]");
            System.out.println("Enter number from 1-5 as a guess");
        } else {
            randomNum = ((int) (Math.random() *5) +1);
            guess = Integer.parseInt(args[0]);

            if(guess < 1 || guess > 5) {
                System.out.println("invalid input");
            } else {
                if(guess == randomNum) {
                    System.out.println("Congrats, you win");
                } else {
                    System.out.println("Wrong, the number was " + randomNum + ". Try again.");
                }
            }
        }
    }
}
