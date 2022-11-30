package application;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entityes.ImportedProduct;
import entityes.Product;
import entityes.UserProduct;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int quantityProducts = sc.nextInt();

        
        for(int i = 0; i < quantityProducts; i++){
            System.out.println("Product #" + (i + 1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char typeProduct = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            
            if(Character.toLowerCase(typeProduct) == 'i'){
                System.out.print("Customs free: ");
                double customsFree = sc.nextDouble();
                Product productImported = new ImportedProduct(name, price, customsFree);
                products.add(productImported);
            }else if(Character.toLowerCase(typeProduct) == 'c'){
                Product commoProduct = new Product(name, price);
                products.add(commoProduct);
            }else if(Character.toLowerCase(typeProduct) == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String manufactureDate = sc.next();
                Product useProduct = new UserProduct(name, price, dateFormat.parse(manufactureDate));
                products.add(useProduct);
            }

        }

        System.out.println();
        System.out.println("PRICE TAGS:");
       for(int j = 0; j < products.size(); j++){
            System.out.println(products.get(j).priceTag());
       }
        sc.close();
    }

}
