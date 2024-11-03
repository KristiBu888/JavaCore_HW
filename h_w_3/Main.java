public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Иван Иванов", 50000);
        Employee emp2 = new Employee("Мария Петрова", 55000);
        Manager manager = new Manager("Петр Сергеев", 70000);

        Employee[] employees = {emp1, emp2, manager};

        System.out.println("Зарплаты до повышения:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Повышаем зарплаты всех, кроме руководителей, на 10%
        Manager.increaseSalaries(employees, 10);

        System.out.println("\nЗарплаты после повышения:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
