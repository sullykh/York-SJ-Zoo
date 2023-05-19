public class Fish extends Animals {
	// constructor with 4 parameters: name, category, food and habitat 
	public Fish(String name, String category, String food, String habitat) {
		this.name = name;
		this.category = category;
		this.food = food;
		this.habitat = habitat;
	}
	// a method for displaying the animal details.
	void details() {
		System.out.println("Animal name: " + name + "\nCategory: " + category + "\nFood: " + food + "\nHabitat: " + habitat + "\n");
		System.out.println("=====================================");
	}

}
