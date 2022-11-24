import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entityes.Company;
import entityes.Individual;
import entityes.TaxPayer;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> taxPayers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int payers = sc.nextInt();

        for(int i = 0; i < payers; i++){
            System.out.println("Tax payer #" + (i + 1) + " data:");
            System.out.print("Individual or company (i/c)? ");
            char c = Character.toLowerCase(sc.next().charAt(0));
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if(c == 'i'){
                System.out.print("Health expenditures: ");
                double heathExpenditures = sc.nextDouble();
                taxPayers.add(new Individual(name, anualIncome, heathExpenditures));
            }else{
                System.out.print("Number of employees: ");
                int numberOfEmployess = sc.nextInt();
                taxPayers.add(new Company(name, anualIncome, numberOfEmployess));
            }


        }
        
        double totalTaxes = 0.0;
        System.out.println();
        System.out.println("TAXES PAID:");
        for (TaxPayer taxPayer : taxPayers) {
            System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.tax()));
            totalTaxes += taxPayer.tax();
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f", totalTaxes);

        sc.close();
    }
}
