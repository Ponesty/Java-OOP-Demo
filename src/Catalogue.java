import java.util.Map;

public class Catalogue {

    public final static int SHIPPING_RATE  = 5;

    private static Map<String, Product> productMap = Map.of(
            "Electric Toothbrush", new Product("Electric Toothbrush", 3000, PHYSICAL, 400),
            "Baby Alarm", new Product("Baby Alarm", 5000, PHYSICAL,1000),
            "War and Peace (e-book)", new Product("War and Peace (e-book)",1000, DIGITAL, -1)
    );

    public static Product getProduct(String itemName) { return productMap.get(itemName); }
}
