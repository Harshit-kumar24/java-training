package ListCollections.ArrayList;

import java.util.Date;

public class Employee {
    private int id;
    private String name;
    private Date dateOfBirth;
    private double salary;


    public Employee(int id,String name,Date dateOfbirth,double salary){
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfbirth;
        this.salary = salary;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setDateOfBirth(Date dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfBirth(){
        return this.dateOfBirth;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return this.salary;
    }    
}
