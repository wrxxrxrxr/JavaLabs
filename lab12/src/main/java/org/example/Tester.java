package org.example;

public class Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname) {
        this(name, surname, 0, "B1", 0.0);
    }

    public Tester(String name, String surname, int expirienceInYears) {
        this(name, surname, expirienceInYears, "B1", 0.0);
    }

    public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Имя: " + name + ", Фамилия: " + surname);
    }

    public void printInfo(boolean includeSalary) {
        printInfo();
        if (includeSalary) {
            System.out.println("Зарплата: " + salary);
        }
    }

    public void printInfo(boolean includeSalary, boolean includeExperience, boolean includeEnglishExperience) {
        printInfo(includeSalary);
        if (includeExperience || includeEnglishExperience) {
            System.out.println("Опыт: " + expirienceInYears + " л.");
            System.out.println("Уровень англ.: " + englishLevel);
        }
    }

    public static void printStaticInfo() {
        System.out.println("Это статический метод.");
    }
}