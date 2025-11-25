public class Main {
    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 3, 4, 4, 5};
        System.out.println(mitjana(nums));
        System.out.println(valorMin(nums));
        System.out.println(indexValorMin(nums));
        System.out.println(valorMax(nums));
        System.out.println(indexValorMax(nums));
        System.out.println(checkSorted(nums));

    }

    public static double mitjana(int[] valors){
        double suma = 0;
        for (int i = 0; i < valors.length; i++) {
            suma += valors[i];
        }

        return suma / valors.length;
    }

    public static int valorMin(int[] valors) {
        int min = valors[0];
        for (int i = 0; i < valors.length; i++) {
            if (min > valors[i]) {
                min = valors[i];
            }
        }
        return min;
    }

    public static int indexValorMin(int[] valors) {
        int indexMin = -1;
        int min = valors[0];
        for (int i = 0; i < valors.length; i++) {
            if (min >= valors[i]) {
                min = valors[i];
                indexMin = i;
            }
        }
        return indexMin;
    }

    public static int valorMax(int[] valors) {
        int max = valors[0];
        for (int i = 0; i < valors.length; i++) {
            if (max < valors[i]) {
                max = valors[i];
            }
        }
        return max;
    }

    public static int indexValorMax(int[] valors) {
        int indexMax = -1;
        int max = valors[0];
        for (int i = 0; i < valors.length; i++) {
            if (max < valors[i]) {
                max = valors[i];
                indexMax = i;
            }
        }
        return indexMax;
    }

    public static boolean checkSorted(int[] valors) {
        boolean sorted = true;
        int valor1 = valors[0];
        for (int i = 0; i < valors.length; i++) {
            if (valor1 <= valors[i]) {
                valor1 = valors[i];
            } else {
                sorted = false;
                break;
            }
        }
        return sorted;
    }
}