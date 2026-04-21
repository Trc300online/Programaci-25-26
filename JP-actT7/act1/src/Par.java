
class Par<T, U> {
    private T first;
    private U second;

    public Par(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }
}

class Main {
    public static void main(String[] args) {
        Par<Integer, Double> par1 = new Par<Integer, Double>(5, 2.6);
        Par<Boolean, String> par2 = new Par<Boolean, String>(false, "Hello");
        Par<Integer, Integer> par3 = new Par<Integer, Integer>(5, 2);
    }
}