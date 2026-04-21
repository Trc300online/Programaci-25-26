import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ProductCounter {
    // Create a Counting Map
    private Map<String, Long> productCountMap = new HashMap<>();
    // Create a Name Mapping Map
    private Map<String, String> productNames = new TreeMap<>();

    public static void main(String[] args) {

        // List of part data
        String[] parts = new String[]{"1S01", "1S01", "1S01", "1S01", "1S01", "1S02", "1S02", "1S02", "1H01", "1H01", "1S02", "1S01", "1S01", "1H01", "1H01", "1H01", "1S02", "1S02", "1M02", "1M02", "1M02"};

        // Create Product Name Part Number map
        /*Map<String, String> productNames = new TreeMap<>();
        productNames.put("Blue Polo Shirt", "1S01");
        productNames.put("Black Polo Shirt", "1S02");
        productNames.put("Red Ball Cap", "1H01");
        productNames.put("Duke Mug   ", "1M02");*/

        Map<String, String> productNames = new TreeMap<>();

        productNames.put("1S01", "Blue Polo Shirt");
        productNames.put("1S02", "Black Polo Shirt");
        productNames.put("1H01", "Red Ball Cap");
        productNames.put("1M02", "Duke Mug");

        // Create Product Counter Object and process data
        ProductCounter productCounter = new ProductCounter(productNames);
        productCounter.processList(parts);
        productCounter.printReport();
    }

    public ProductCounter(Map productNames) {
        this.productNames = productNames;
    }

    public void processList(String[] list) {
        long curVal = 0;

        for (String item : list) {
            if (productCountMap.containsKey(item)) {
                curVal = productCountMap.get(item);
                curVal++;
                productCountMap.put(item, new Long(curVal));
            } else {
                productCountMap.put(item, new Long(1));
            }
        }
    }

    public void printReport() {
        System.out.println("Informe de Productes · Stock actual");

        for (String key : productCountMap.keySet()) {
            System.out.print("Codi ...: " + key);
            System.out.print("  Nom ...: " + productNames.get(key));
            System.out.println("    nombre ...: " + productCountMap.get(key));
        }
    }
}
