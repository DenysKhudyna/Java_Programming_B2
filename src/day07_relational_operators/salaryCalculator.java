package day07_relational_operators;

public class salaryCalculator {
    public static void main (String []args){

        double salary = 100_000;
        double stateTaxRate = 0.06; // 6%
        double federalTaxRate = 0.22; //22%
        double statetax, federalTax, totalTax, salaryAfterTax;
        statetax = salary * stateTaxRate;
        federalTax = salary * federalTaxRate;
        totalTax = statetax+federalTax;
        salaryAfterTax = salary - totalTax;


        String taxRecord = "State tax rate; " + statetax + ", Federal tax rage; " + federalTax + ", Base Salary $" +
                salary + "\nTax amount; " + statetax + " for State Tax and " + federalTax + " Federal Tax, in total it is; "
                + totalTax + "\nAfter tax our salary is: " + salaryAfterTax;

        System.out.println(taxRecord);

    }
}
