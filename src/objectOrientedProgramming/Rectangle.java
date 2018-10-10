package objectOrientedProgramming;

public class Rectangle {
private double length;
private double width;
public Rectangle() {length = 0.0; width = 0.0;}
public double returnLength() {return length;}
public double returnWidth() {return width;}
public double perimeter() {double perimeter = 2*length+2*width; return perimeter;}
public double area() {double area = length*width; return area;}
public void changeLength(double newLength) {length = newLength;}
public void changeWidth(double newWidth) {width = newWidth;}

}
