public class Temperature {
    public double fahrenheit = 0;

    public void calculateCelsius() {
        double celsius = (((fahrenheit - 32) * 5) / 9);
        System.out.println(celsius);
    }
}
