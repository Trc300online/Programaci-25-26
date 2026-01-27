public class Main {
    public static void main(String[] args) {
        int [] rango = {1, 5, 9, 81, 356, 925, 5589, 15238};
        int numObj = 924;
        boolean finded = false;
        int mid = (rango.length - 1)/2;

        while (finded == false) {
            if (mid > rango.length - 1) {
                System.out.println(numObj + " no es troba dins el rang");
                break;
            }
            if (rango[mid] == numObj) {
                System.out.println("felicitats, has guanyat, el nombre era " + numObj);
                finded = true;
            } else if (rango[mid] > numObj) {
                mid = mid/2;
            } else if (rango[mid] < numObj) {
                mid = mid + (((rango.length - 1) - mid) /2);
            }
        }
    }
}