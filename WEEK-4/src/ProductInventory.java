class Product {
    private String code;
    private String name;
    private double unitPrice;
    private int quantity;

    private static int productCount = 0;

    public Product(String code, String name, double unitPrice) {
        this(code, name, unitPrice, 0);
    }

    public Product(String code, String name, double unitPrice, int quantity) {
        if (code == null || code.trim().isEmpty()) {
            throw new IllegalArgumentException("Product code cannot be blank.");
        }

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be blank.");
        }

        if (unitPrice <= 0) {
            throw new IllegalArgumentException("Unit price must be positive.");
        }

        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }

        this.code = code;
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;

        productCount++;
    }

    public boolean restock(int amount) {
        if (amount <= 0) {
            return false;
        }

        quantity += amount;
        return true;
    }

    public boolean sell(int amount) {
        if (amount <= 0 || amount > quantity) {
            return false;
        }

        quantity -= amount;
        return true;
    }

    public double getInventoryValue() {
        return unitPrice * quantity;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public static int getProductCount() {
        return productCount;
    }

    @Override
    public String toString() {
        return "Product{code='" + code +
                "', name='" + name +
                "', unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", inventoryValue=" + getInventoryValue() + "}";
    }
}

public class ProductInventory {
}