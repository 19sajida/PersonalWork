package objectOrientedProgramming;

public class Circle {
private double radius;
public Circle() {}
public double returnRadius() {return radius;}
public double circumference() {double circumference = radius*2*Math.PI; return circumference;}
public double area() {double area = radius*radius*Math.PI; return area;}
public void changeRadius(double newRadius) {radius = newRadius;}
}
