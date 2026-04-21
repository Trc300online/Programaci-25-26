// class ClassA {
//     private int n;

//     public ClassA() {
//     }

//     public int getN() {
//         return n;
//     }

//     public void setN(int n) {
//         this.n = n;
//     }

// }

// class ClassB {
//     private double n;

//     public ClassB() {
//     }

//     public double getN() {
//         return n;
//     }

//     public void setN(double n) {
//         this.n = n;
//     }

// }

// class ClassC {
//     private String n;

//     public ClassC() {
//     }

//     public String getN() {
//         return n;
//     }

//     public void setN(String n) {
//         this.n = n;
//     }

// }

class GenericClass<T> {

    private T n;

    public GenericClass() {
    }

    public T getN() {
        return n;
    }

    public void setN(T n) {
        this.n = n;
    }
}

class Exemple {

    public static void main(String[] args) {
        // ClassA a = new ClassA();
        // ClassB b = new ClassB();
        // ClassC c = new ClassC();

        // a.setN(10);
        // b.setN(5.5);
        // c.setN("Hola");

        GenericClass<Integer> genericA = new GenericClass<Integer>();
        genericA.setN(10);
        GenericClass<Double> genericB = new GenericClass<Double>();
        genericB.setN(10.5);
        GenericClass<String> genericC = new GenericClass<String>();
        genericC.setN("Hola");

    }

}