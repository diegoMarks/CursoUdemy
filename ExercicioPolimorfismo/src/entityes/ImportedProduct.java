package entityes;

/**
 * ImportedProduct
 */
public class ImportedProduct extends Product{
    
    private Double customsFree;

    public ImportedProduct(){
        super();
    }
    
    public ImportedProduct(String name, Double price, Double customsFree) {
        super(name, price);
        this.customsFree = customsFree;
    }

    public Double getCustomsFree() {
        return customsFree;
    }

    @Override
    public String priceTag() {
        return this.getName() + " $ " + this.totalPrice() + " (Customs free: $ " + this.getCustomsFree() + ")";
    }

    
    public double totalPrice(){
            return this.getPrice() + this.getCustomsFree();
    }
}