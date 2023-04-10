 package hw_2023_04_03;

 public class Test_hw_2023_04_03 {
     public static void main(String[] args) {
         EmployeeBook empBook = new EmployeeBook();
         Employee ivan = new Employee("Ivan", "Ivanovich", "Ivanov", 45_000, 1);
         Employee oleg = new Employee("Oleg", "Olegovich", "Olegov", 50_000, 1);
         Employee maxim = new Employee("Maxim", "Maximovich", "Maximov", 65_000, 2);
         Employee ruslan = new Employee("Ruslan", "Ruslanovich", "Ruslanov", 80_000, 2);
         empBook.addEmployee(ivan);
         empBook.addEmployee(oleg);
         empBook.addEmployee(maxim);
         empBook.addEmployee(ruslan);

         empBook.changeSalary(ivan, 43_000);
         empBook.printEmployeesByDepartment();
         System.out.println();
         empBook.printAllEmployees();

         System.out.println();
         double totalSalaries = empBook.totalSalaries();
         System.out.printf("Monthly salary of all employees: %3f%n", totalSalaries);
         Employee employeeWithMinSalary = empBook.findEmployeeWithMinSalary();
         System.out.println("Minimum salary employee: " + employeeWithMinSalary);
         Employee employeeWithMaxSalary = empBook.findEmployeeWithMaxSalary();
         System.out.println("Maximum salary employee: " + employeeWithMaxSalary);
         double averageSalary = empBook.averageSalary();
         System.out.printf("Monthly average salary per 1 employee: %3f%n ", averageSalary);

         System.out.println("\nEmployee full names:");
         empBook.printFullNameEmployees();

         System.out.println("\nEmployee salary after indexation per 10%:");
         empBook.indexSalaries(10);
         empBook.printAllEmployees();

         System.out.println("\nEmployee salary per department:");
         System.out.printf("Employee with MIN salary per department %d -> %s%n", 1, empBook.findEmployeeWithMinSalaryFromDepartment(1));
         System.out.printf("Employee with MAX salary per department %d -> %s%n", 2, empBook.findEmployeeWithMaxSalaryFromDepartment(2));
         System.out.printf("Employee total salary per department %d -> %.2f%n", 1, empBook.totalSalariesForDepartment(1));
         System.out.printf("Employee average salary per department %d ->  %.3f%n", 2, empBook.averageSalaryForDepartment(2));

         empBook.indexSalariesForDepartment(20,2);
         System.out.println("\nEmployee salary per department after indexation:");
         empBook.printAllEmployeesFromDepartment(2);
     }
}
