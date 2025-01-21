package org.example;

import java.util.Arrays;

public class Employee {


    private int id;
    private String fullName;
    private String email;
    private String password;
    private  String[] healthPlans;


    public Employee(int id, String fullName, String email, String password, String[] healthplans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthplans;
    }


    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }


    public void addHealthPlan(int index, String name) {
        if (index < 0 || index >= healthPlans.length) {
            System.out.println("Index dizi boyutları dışında!");
            return;
        }
        if (healthPlans[index] != null && !healthPlans[index].isEmpty()) {
            System.out.println("Bu index zaten dolu: " + healthPlans[index]);
        } else {
            healthPlans[index] = name;
            System.out.println("Yeni sağlık planı eklendi: " + name);
        }
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthPlans=" + Arrays.toString(healthPlans) +
                '}';
    }
}