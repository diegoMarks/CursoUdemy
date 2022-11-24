package entityes;

public class Company extends TaxPayer {

    private Integer numberOfEmployess;

    public Company() {
        super();
    }

    public Company(String name, Double anualIncome, Integer numberOfEmployess) {
        super(name, anualIncome);
        this.numberOfEmployess = numberOfEmployess;
    }

    public Integer getNumberOfEmployess() {
        return numberOfEmployess;
    }

    @Override
    public double tax() {
        double tax = 0.0;

        if(this.getNumberOfEmployess() > 10){
            tax = this.getAnualIncome() * 0.14;
        }else{
            tax = this.getAnualIncome() * 0.16;
        }

        return tax;
    }

}
