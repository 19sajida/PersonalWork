package interfacesAndPolymorphism;

public class Breakfast  implements Meal
{
private boolean eggs;
private String drink;
private int calories;

public Breakfast(){
	eggs = true;
	drink = "Juice";
	calories = 500;
}
public Breakfast(Boolean e, String d, int c){
	eggs = e; drink = d; calories=c;
}
public boolean getEggs(){
	return eggs;
}
public int getCalories(){
	return calories;
}
public String toString(){
	return "Eggs: " + eggs + " Drink: " + drink + " Calories: " + calories;
}
public boolean equals(Object anObject){
	if (anObject.toString().equals(this.toString())){
		return true;
	}
	else{return false;}
}

//Write the implementation for the clone method
public Breakfast clone()
{
	return new Breakfast(eggs, drink, calories);
}
}