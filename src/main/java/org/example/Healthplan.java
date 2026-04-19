package org.example;

import org.example.enums.Plan;

public class Healthplan {
    private int id;
    private String name;
    private Plan plan;

    public Healthplan(int id, String name, Plan plan){
        this.id = id;
        this.name = name;
        this.plan = plan;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public Plan getPlan(){
        return this.plan;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPlan(Plan plan){
        this.plan = plan;
    }

    @Override
    public String toString() {
        return "Health plan initialized succesffully! \n" + "Id: " + this.id + "\nName: " + this.name + "\nPlan: " + this.plan.getName();
    }
}
