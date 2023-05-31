package src.main.java.seminar1;

// Абстрактный класс Товар
public abstract class Product {
    protected String name;
    protected int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

// Класс БутылкаВоды, наследник класса Товар
public class WaterBottle extends Product {
    private int volume;

    public WaterBottle(String name, int price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return "WaterBottle{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", volume=" + volume +
                '}';
    }
}

// Интерфейс ТорговыйАвтомат
public interface VendingMachine {
    void initProducts(List<Product> products);
    Product getProduct();
    Product getProduct(String name);
    Product getProduct(String name, int volume);
}

// Пример реализации класса ПродающийБутылкиВодыАвтомат
public class WaterBottleVendingMachine implements VendingMachine {
    private List<Product> products;

    @Override
    public void initProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public Product getProduct() {
        if (products.isEmpty()) {
            return null;
        }
        return products.remove(0);
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                products.remove(product);
                return product;
            }
        }
        return null;
    }

    @Override
    public Product getProduct(String name, int volume) {
        for (Product product : products) {
            if (product.getName().equals(name) && ((WaterBottle) product).getVolume() == volume) {
                products.remove(product);
                return product;
            }
        }
        return null;
    }
}
