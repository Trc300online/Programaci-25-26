import java.util.ArrayList;

public class LIFO extends padre{

    @Override
    public ArrayList<Integer> deleteNumber(ArrayList numbers) {
        System.out.println("pre delete " + numbers);
        int x = numbers.size() - 1;
        numbers.remove(x);
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
