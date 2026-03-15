import java.util.ArrayList;

public class FIFO extends padre{

    @Override
    public ArrayList<Integer> deleteNumber(ArrayList numbers) {
        System.out.println("pre delete " + numbers);
        numbers.remove(0);
        System.out.println("post delete " + numbers);
        return numbers;
    }

    @Override
    public ArrayList<Integer> addNumber(ArrayList numbers, int value) {
        System.out.println("pre add " + numbers);
        numbers.add(value);
        System.out.println("post add " + numbers);
        return numbers;
    }
}
