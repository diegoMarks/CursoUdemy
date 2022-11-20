package properties;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitys.Employee;

public class App {
    public static void main(String[] args) throws Exception {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + ":");

            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
    
            while(hasId(employees, id)){
                System.out.println("Id aleardy taken. Try again: ");
                id = sc.nextInt();
            };
            
            System.out.print("Name: ");
            String name = sc.nextLine();
            
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            
            employees.add(new Employee(id, name, salary));
            
            System.out.println();
        }

        System.out.print("Enter de employee id that will have salary increase: ");
        int salaryId = sc.nextInt();

        Employee emp = employees.stream().filter(x -> x.getId() == salaryId).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter te percetage: ");
            double percetage = sc.nextDouble();
            emp.increaseSalary(percetage);
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        sc.close();
    }


    public static boolean hasId(List<Employee> list, int id){
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
