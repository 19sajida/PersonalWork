package objectOrientedProgramming;

public class Sandbox2And3 {
		
	
	public void Sandbox2(double length, double width, double depth, double transport) {
		double volume = length * width * depth;
		double time = volume / transport;
		System.out.println("It will take " + time + " hours to fill up the sand box");
	
	}
	public double Sandbox3(double length, double width, double depth, double transport)
	{double volume = length * width * depth;
	double time = volume / transport;
	return time;
}
} 
