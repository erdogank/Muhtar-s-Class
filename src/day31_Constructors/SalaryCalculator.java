package day31_Constructors;

public class SalaryCalculator {
    public double hourlyRate;
    public double stateTaxRate;
    public double fedrealTaxRate;
    public int weeklyhours;

    public SalaryCalculator(double hourlyRate, double stateTaxRate, double fedrealTaxRate, int weeklyhours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.fedrealTaxRate = fedrealTaxRate;
        this.weeklyhours = weeklyhours;
    }

    public double salary(){

        return hourlyRate*weeklyhours*52;
    }
    public double stateTax(){
        return salary()*stateTaxRate;
    }
    public double federalTax(){
        return salary()*fedrealTaxRate;
    }
    public double salaryAfterTax(){
        return salary()-(stateTax()+federalTax());
    }

    public String toString() {
        return "SalaryCalculator{" +
                "salary= $" + salary() +
                ", stateTax= $" + stateTax() +
                ", fedrealTax= $" + federalTax() +
                ", salaryAfterTax= $" + salaryAfterTax() +
                '}';
    }
}
