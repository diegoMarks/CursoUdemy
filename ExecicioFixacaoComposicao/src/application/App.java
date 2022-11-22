package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entityes.Client;
import entityes.Order;
import entityes.OrderItem;
import entityes.OrderStatus;
import entityes.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDate = sc.next();

        Client client = new Client(name, email, dFormat.parse(birthDate));

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = sc.next();
        Order order = new Order(new Date(),OrderStatus.valueOf(status), client);

        System.out.print("How many items to this order? ");
        int quantityItens = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i < quantityItens; i++) {
            System.out.println("Enter the #" + (i + 1) + " item data:");
            System.out.print("Product name: ");
            String productName = sc.next();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            Product product = new Product(productName, price);
            OrderItem item = new OrderItem(quantity, price, product);
            order.addItem(item);
            
        }
        System.out.println();
        System.out.println(order.toString());
        sc.close();
    }
}
