import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public abstract class Animals {
	
	
		//member variables
		public String name;
		public String category;
		public String food;
		public String habitat;
		
		// a constructor for the Animals class 
		public void Animals(String name, String category, String food, String habitat) {
			this.name = name;
			this.category = category;
			this.food = food;
			
		}
		
		// A method for displaying the animal object details. 
		void details() {
			System.out.println("Animal Details:\n " + "Animal name: " + name + "\nCategory: " + category + "\nFood: " + food + "\nHabitat: " + habitat + "\n");
			System.out.println("=====================================");
		}
		
		// a method for displaying all elements in an ArrayList.
		public  static void printArrayListElements(ArrayList a) {
			Iterator itr = a.iterator(); // an iterator function that iterate through all the ArrayList members 
			while(itr.hasNext()) { // a while loop for displaying all the members 
				Animals animal = (Animals)itr.next();
				System.out.println("Animal name: " + animal.name + "\nCategory: " + animal.category + "\nFood: " + animal.food + "\nHabitat: " + animal.habitat + "\n");
			} 
		}
		// a method to display what food is required for each animal
		public static void foodRequired(ArrayList a) {
			Iterator itr = a.iterator(); // an iterator function that iterate through all the ArrayList members 
			while(itr.hasNext()) { // a while loop for displaying all the members 
				Animals animal = (Animals)itr.next();
				System.out.println("Animal name: " + animal.name + "\nFood: " + animal.food + "\n");
			} 
		}
		
		
		// a method to display all animals from a specific environment
		public static void displayEnvironment(ArrayList a) {
			Iterator itr = a.iterator(); // an iterator function that iterate through all the ArrayList members 
			while(itr.hasNext()) { // a while loop for displaying all the members 
				Animals animal = (Animals)itr.next();
				System.out.println("Animal name: " + animal.name +  "\nHabitat: " + animal.habitat + "\n");
			} 
		}
		
		//an ArrayList for storing all animals in the zoo. 
		public static ArrayList<Animals> animalDetails = new ArrayList<Animals>();
		
		//an ArrayList for storing all mammal animals.
		public static ArrayList<Animals> mammalList = new ArrayList<Animals>();
		//an ArrayList for storing all birds.
		public static ArrayList<Animals> birdsList = new ArrayList<Animals>();
		//an ArrayList for storing all fish.
		public static ArrayList<Animals> fishList = new ArrayList<Animals>();
		//an ArrayList for storing all reptiles.
		public static ArrayList<Animals> reptilesList = new ArrayList<Animals>();
		
		// an ArrayList for storing animals from the jungle.
		public static ArrayList<Animals> jungleList = new ArrayList<Animals>();
		// an ArrayList for storing animals from the arctic. 
		public static ArrayList<Animals> arcticList = new ArrayList<Animals>();
		// an ArrayList for storing animals from the forest.
		public static ArrayList<Animals> forestList = new ArrayList<Animals>();
		// an ArrayList for storing animals from the ocean, river and sea.
		public static ArrayList<Animals> waterList = new ArrayList<Animals>();
		// an ArrayList for storing animals from the desert.
		public static ArrayList<Animals> desertList = new ArrayList<Animals>();

}
