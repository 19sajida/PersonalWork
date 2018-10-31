package decisions;

public class RightTriangle {
private double height;
private double base;
public RightTriangle() {height = 0.0; base = 0.0;}
public RightTriangle(double base2, double height2) {height=height2; base=base2;}
public double hypot() {double hypotenuse=Math.sqrt(base*base+height*height); return hypotenuse;}
public double perimeter() {double perimeter= Math.sqrt(base*base+height*height)*2+base;  return perimeter;}
public double area() {double area = height*base; return area;}
}
