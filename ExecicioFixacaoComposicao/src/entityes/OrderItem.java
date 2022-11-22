package entityes;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product products;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, double price, Product products) {
        this.quantity = quantity;
        this.price = price;
        this.products = products;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public Product getProducts() {
        return products;
    }
    
    public double subTotal() {
        return this.price * this.quantity;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(products.getName() + ", $");
        builder.append(String.format("%.2f", this.getPrice()));
        builder.append(", " + quantity);
        builder.append(", Subtotal: $");
        builder.append(String.format("%.2f", this.subTotal()));
        builder.append("\n");
        return builder.toString();
    }

}
