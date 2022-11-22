package entityes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    private Client client;

    private List<OrderItem> items = new ArrayList<>();
    
    public static SimpleDateFormat dFormat2 = new SimpleDateFormat("dd/MM/yyyy hh:MM:ss");
    

    public Order() {
    }

    public Order(Date date, OrderStatus status, Client client) {
        this.status = status;
        this.client = client;
        this.moment = date;
    }

    public Date getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    
    public double total() {
        double totalPrice = 0.0;
        for (OrderItem orderItem : items) {
            totalPrice += orderItem.subTotal();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ORDER SUMMARY:\n");
        builder.append("Order Moment: " + dFormat2.format(moment) + "\n");
        builder.append("Order Status: " + status + "\n");
        builder.append("Client: " + client.toString());
        builder.append("Order items:\n");

        for (OrderItem orderItem : items) {
            builder.append(orderItem.toString());
        }
        
        builder.append("Total price: $" + String.format("%.2f", this.total()));
        return builder.toString();
    }

}
