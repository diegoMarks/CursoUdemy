package entityes;

public class Individual extends TaxPayer {

    private Double heathExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double anualIncome, Double heathExpenditures) {
        super(name, anualIncome);
        this.heathExpenditures = heathExpenditures;
    }

    public Double getHeathExpenditures() {
        return heathExpenditures;
    }

    @Override
    public double tax() {

        double tax = 0.0;

        if (this.getAnualIncome() < 20000.00) {
            tax = this.getAnualIncome() * 0.15;
        } else if (this.getAnualIncome() > 20000.00) {
            tax = this.getAnualIncome() * 0.25;
        }

        if (this.getHeathExpenditures() > 0) {
            tax -= this.getHeathExpenditures() * 0.50;
        }

        return tax;
    }
}
