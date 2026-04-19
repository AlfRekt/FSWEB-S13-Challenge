package org.example;
import org.example.enums.Plan;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static void runApplication() {
        Healthplan healthplan1 = new Healthplan(1, "Employee Health Package", Plan.BASIC);
        Employee employee1 = new Employee(
                101,
                "Ahmet Yılmaz",
                "ahmet@example.com",
                "12345",
                new String[3]
        );
        Company company1 = new Company(
                201,
                "TechNova",
                500000.0,
                new String[3]
        );

        System.out.println(healthplan1);
        System.out.println(employee1);
        System.out.println(company1);

        employee1.addHealthPlan(0, "Basic Plan");
        employee1.addHealthPlan(0, "Premium Plan");
        employee1.addHealthPlan(5, "Gold Plan");

        company1.addEmployee(1, "Mehmet");
        company1.addEmployee(1, "Ayşe");
        company1.addEmployee(8, "Zeynep");

        company1.setGiro(-1000);

        System.out.println("----- Güncel Durum -----");
        System.out.println(healthplan1);
        System.out.println(employee1);
        System.out.println(company1);
    }
}