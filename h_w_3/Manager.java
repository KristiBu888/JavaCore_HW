public class Manager extends Employee {

    public Manager(String name, double salary) {
        super(name, salary);
    }

    // Статический метод повышения зарплаты только для сотрудников, кроме руководителей
    public static void increaseSalaries(Employee[] employees, double percentage) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {  // Проверяем, что сотрудник не является руководителем
                double newSalary = employee.getSalary() * (1 + percentage / 100);
                employee.setSalary(newSalary);
            }
        }
    }
}

