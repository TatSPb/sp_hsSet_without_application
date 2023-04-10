package hw_2023_04_03;

public class Employee {
    private static int counter = 1;
    private final String name;
    private final String surname;
    private final String patronymicName;
    private double salary;
    private int department;
    private  final int id;

    public Employee(String name, String patronymicName,  String surname, double salary, int department) {
        this.id = counter++;
        this.name = name;
        this.surname = surname;
        this.patronymicName = patronymicName;
        this.salary = salary;
        this.department = department;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Employee.counter = counter;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null|| getClass() != obj.getClass()){
            return false;
        }
       Employee employee = (Employee) obj;
        return name.equals(employee.name) && surname.equals(employee.surname) && patronymicName.equals(employee.patronymicName);
    }

    @Override
    public String toString() {
        return String.format(
                "id: %d, %s %s %s, salary: %2f, department: %d", id, surname, name, patronymicName, salary, department);
    }
}
