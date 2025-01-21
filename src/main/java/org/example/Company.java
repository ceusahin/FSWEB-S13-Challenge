package org.example;

public class Company {

    private long id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(long id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        setGiro(giro);
        this.developerNames = developerNames;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void setGiro(double giro) {
        if (giro >= 0) {
            this.giro = giro;
        }
    }


    public void addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Index dizi boyutları dışında!");
            return;
        }
        if (developerNames[index] != null && !developerNames[index].isEmpty()) {
            System.out.println("Bu index zaten dolu: " + developerNames[index]);
        } else {
            developerNames[index] = name;
            System.out.println("Yeni geliştirici eklendi: " + name);
        }
    }

}