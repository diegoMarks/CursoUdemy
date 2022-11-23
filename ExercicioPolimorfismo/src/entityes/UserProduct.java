package entityes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserProduct extends Product{
    
    private Date manufactureDate;

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public UserProduct(){
    }

    public UserProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    @Override
    public String priceTag() {
        return this.getName() + " (used) $ " + this.getPrice() + " (Manufacture date: " + 
        dateFormat.format(manufactureDate) + ")";
    }

}
