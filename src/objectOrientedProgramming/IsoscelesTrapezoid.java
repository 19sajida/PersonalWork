package objectOrientedProgramming;

public class IsoscelesTrapezoid {
private double base1;
private double base2;
private double height;
private double length1;
public IsoscelesTrapezoid(){base1 = 1.0; base2 = 2.0; height=3.0; length1=5.0;}
public IsoscelesTrapezoid(double base12, double base22, double height2, double length2){base1=base12; base2=base22; height=height2; length1=length2;}
public double perimeter(){double perimeter=length1+base1+base2+length1; return perimeter;}
public double area(){double area=(base1+base2)*height/2; return area;}
}
