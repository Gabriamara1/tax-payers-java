package entities;

public class Individual extends TaxPayer{
    private Double healthExpenditures;

    public Individual (){
        super();
    }

    public Individual(Double anualIncome, String name, Double healthExpenditures) {
        super(anualIncome, name);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        if (getAnualIncome() < 20000.00) {
            return getAnualIncome() * 0.15 - healthExpenditures / 2.0;
        }

        else {
            return getAnualIncome() * 0.25 - healthExpenditures / 2.0;
        }
    }
}
