package ru.home;

public class Customer {
    private String name;
    private int age;
    private String phone;
    private Gender gender;

    public Customer(String name, int age, String phone, Gender gender) {
        setName(name);       // Используем сеттеры для валидации
        setAge(age);
        setPhone(phone);
        this.gender = gender;
    }

    // Getters и setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым.");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным.");
        }
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone == null || !phone.matches("\\+\\d+-\\d+-\\d+-\\d+-\\d+")) {
            throw new IllegalArgumentException("Неверный формат телефона. Ожидаемый формат: +X-XXX-XXX-XX-XX.");
        }
        this.phone = phone;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        if (gender == null) {
            throw new IllegalArgumentException("Пол должен быть указан.");
        }
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", gender=" + gender +
                '}';
    }
}
