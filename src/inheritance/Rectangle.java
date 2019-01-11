package inheritance;

public class Rectangle extends Quadrilateral {
public Rectangle(){
}
public Rectangle(double ss1, double ss2){
	bob.setS1(ss1);
	bob.setS2(ss2);
}
Quadrilateral bob = new Quadrilateral();
public double area(){
	double area = bob.getS1()*bob.getS2();
			return area;
}
}
