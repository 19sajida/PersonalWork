package objectOrientedProgramming;

public class Employee {
private double wage;
private double years;
public Employee(){wage = 7.25;
years = 0.0;}
public double getWage(){return wage;}
public void setWage(double newWage){wage = newWage;}
public double getYears(){return years;}
public void setYears(double newYears){years=newYears;}
public void raise(){wage = 1.1*wage;}
}
