package org.example;
import java.util.Arrays;
public class Company {
    private int id;
    private String name;
    private double giro = 2;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames){
        this.id = id;
        this.name = name;
        if(giro > 0){
            this.giro = giro;
        }
        this.developerNames = developerNames;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void setGiro(double giro) {
        if(giro > 0){
            this.giro = giro;
        }else{
            System.out.println("Giro can't be negative.");
        }
    }

    public void addEmployee(int index, String name){
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Invalid index! There is no such index in this array.");
            return;
        }

        if (developerNames[index] == null) {
            developerNames[index] = name;
            System.out.println(  "Developer " + name + "added to index "+  index);
        } else {
            System.out.println(index + ". index already taken.");
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}
