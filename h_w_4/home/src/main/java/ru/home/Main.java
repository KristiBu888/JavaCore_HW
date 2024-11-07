package ru.home;

public class Main {
    private final static Customer[] people = {
            new Customer("Ivan", 20, "+1-222-333-44-55", Gender.MALE),
            new Customer("Petr", 30, "+2-333-444-55-66", Gender.MALE),
            new Customer("Eva", 25, "+2-555-891-23-6446", Gender.FEMALE),
            new Customer("Tanya", 35, "+1-333-888-77-44", Gender.FEMALE),
            null // Добавлен пустой элемент для демонстрации обработки исключений
    };

    private static final Holiday today = Holiday.NEW_YEAR;

    public static void main(String[] args) {
        try {
            celebrate();
        } catch (Exception e) {
            System.out.println("Ошибка при выполнении программы: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void celebrate() {
        for (Customer customer : people) {
            try {
                // Попытка поздравить сотрудника
                sendGreeting(customer);
            } catch (NullPointerException e) {
                System.out.println("Ошибка: сотрудник не найден (null)");
            } catch (Exception e) {
                System.out.println("Ошибка при поздравлении сотрудника: " + customer);
                e.printStackTrace();
            }
        }
    }

    private static void sendGreeting(Customer customer) {
        if (customer == null) {
            throw new NullPointerException("Нет данных о сотруднике");
        }

        switch (today) {
            case NEW_YEAR -> System.out.println(customer.getName() + ", с Новым Годом!");
            case FEB_23 -> {
                if (customer.getGender() == Gender.MALE) {
                    System.out.println(customer.getName() + ", поздравляем с 23 февраля!");
                }
            }
            case MARCH_8 -> {
                if (customer.getGender() == Gender.FEMALE) {
                    System.out.println(customer.getName() + ", поздравляем с 8 марта!");
                }
            }
            default -> System.out.println(customer.getName() + ", сегодня нет праздника.");
        }
    }
}
