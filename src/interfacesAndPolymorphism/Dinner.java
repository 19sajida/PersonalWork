package interfacesAndPolymorphism;

public class Dinner  implements Meal{
		private String protein;
		private String dessert;
		private int calories;

		public Dinner(){
			protein = "Chicken";
			dessert = "Chocolate Cake";
			calories = 500;
		}
		public String forDessert(){
		dessert = "Chocolate Cake";
			return dessert;
		}
		public int getCalories(){
			return calories;
		}

		//Write the implementation for the clone method
		public String toString(){
			return "Protein: " + protein + " Dessert: " + dessert + " Calories: " + calories;
		}
}
