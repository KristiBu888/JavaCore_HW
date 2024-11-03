public class Employee {
    private final String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Метод для сравнения дат в формате гггг, мм, дд без использования условных операторов
    public static int compareDates(int year1, int month1, int day1, int year2, int month2, int day2) {
        return Integer.compare(year1, year2) != 0 ? Integer.compare(year1, year2) :
               Integer.compare(month1, month2) != 0 ? Integer.compare(month1, month2) :
               Integer.compare(day1, day2);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}
