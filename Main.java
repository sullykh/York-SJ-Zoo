import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Main extends Animals {
  public static void main(String[] args) {
   //a list of all animals which were created as objects.
		Mammals wolf = new Mammals ("Wolf", "Mammal", "meat", "Forests");
		Mammals lion = new Mammals ("Lion", "Mammal", "meat", "Jungles");
		Mammals polarBear = new Mammals ("Polar Bear", "Mammal", "meat", "Arctics");
		Mammals monkey = new Mammals ("Monkey", "Mammal", "plants", "Jungles");
		Mammals tiger = new Mammals ("Tiger", "Mammal", "meat", "Jungles");
		Reptiles cobra = new Reptiles ("Cobra", "Reptile", "meat", "Desert");
		Reptiles beardedDragon = new Reptiles ("Bearded Dragon", "Reptile", "insects", "Desert");
		Reptiles turtles = new Reptiles ("Turtles", "Reptile", "plants", "Forests");
		Reptiles crocodiles = new Reptiles ("Crocodiles", "Reptile", "meat", "Jungle");
		Fish tuna = new Fish("Tuna", "Fish", "plants", "Ocean");
		Fish salmon = new Fish("Salmon", "Fish", "plants", "River");
		Fish crab = new Fish("Crab", "Fish", "plants", "Sea");
		Fish octupus = new Fish("Octupus", "Fish", "plants", "Sea");
		Birds whiteOwl = new Birds("White Owl", "Bird", "Meat", "Forests");
		Birds falcon = new Birds("Falcon", "Bird", "Meat", "Forests");
		Birds penguin = new Birds("Penguin", "Bird", "Plants", "Arctics");
		Birds hawaiianCrow = new Birds("Hawaiian Crow", "Bird", "Plants", "Forests");
		
		
		//adding all animals to the ArrayList "animalDetails"
		animalDetails.add(wolf);
		animalDetails.add(lion);
		animalDetails.add(polarBear);
		animalDetails.add(monkey);
		animalDetails.add(tiger);
		animalDetails.add(cobra);
		animalDetails.add(beardedDragon);
		animalDetails.add(turtles);
		animalDetails.add(crocodiles);
		animalDetails.add(tuna);
		animalDetails.add(salmon);
		animalDetails.add(crab);
		animalDetails.add(octupus);
		animalDetails.add(whiteOwl);
		animalDetails.add(falcon);
		animalDetails.add(penguin);
		animalDetails.add(hawaiianCrow);
		
		
		//adding mammals to their specific type ArrayList
		  mammalList.add(wolf);
		  mammalList.add(lion);
		  mammalList.add(polarBear);
		  mammalList.add(monkey);
		  mammalList.add(tiger);
		
		//adding reptiles to their specific type ArrayList
		  reptilesList.add(cobra);
		  reptilesList.add(beardedDragon);
		  reptilesList.add(turtles);
		  reptilesList.add(crocodiles);
		
		// adding fish to their specific type ArrayList
		  fishList.add(tuna);
		  fishList.add(salmon);
		  fishList.add(crab);
		  fishList.add(octupus);
		
		// adding birds to their specific type ArrayList
		  birdsList.add(whiteOwl);
		  birdsList.add(falcon);
		  birdsList.add(penguin);
		  birdsList.add(hawaiianCrow);
		
		
		//adding to jungle environment
		  jungleList.add(lion);
		  jungleList.add(monkey);
		  jungleList.add(tiger);
		  jungleList.add(crocodiles);
		
		//adding to Arctic environment
		  arcticList.add(polarBear);  
		  arcticList.add(penguin);
		
		//adding to water environment
		  waterList.add(tuna);
		  waterList.add(salmon);
		  waterList.add(crab);
		  waterList.add(octupus);
		  
		  
		
		//adding to desert environment
		  desertList.add(cobra);
		  desertList.add(beardedDragon);
		  // adding to forest environment
		  forestList.add(wolf);
		  forestList.add(turtles);
		  forestList.add(whiteOwl);
		  forestList.add(falcon);
		  forestList.add(hawaiianCrow);
		  
		  // scanner funCtion to take user input
		  Scanner scan = new Scanner(System.in);
		  //variables
		  int input;
	
		
		// application print a welcome a message and displays the main menu  
		System.out.println("Welcome to York St Johns Zoo!\n");
		System.out.println("Select one of the following options - \n 1. Display animal details - \n 2. Print a list of all animals - \n 3. Print all mammals - \n 4. Print all reptiles \n 5. Print all birds - "
				+ "\n 6. Print all fish - \n 7. Print all jungle animals - \n 8. Print all desert animals - \n 9. Print all arctic animals - \n 10. Print all water animals - \n 11. Print all forest animals - "
				+ "\n 12 Food required for each animal -");
		// Take input from the user. 
		input = scan.nextInt();
		
		// while loop 
		while (input != 0) {
		// switch statement nested inside a while loop 
		switch(input) {
		// display particular animal details 
		case 1:
			
			wolf.details();
			break;
		
		case 2:
		//An example of displaying the details of each animal in an ArrayList
		  System.out.println("Animal details:\n");
		  printArrayListElements(animalDetails);	
		   break;
		
		case 3:
		// Outputting all mammals 
			printArrayListElements(mammalList);
		  break;
		  
		case 4:
	    //Outputting all reptiles
			printArrayListElements(reptilesList);
		  break;
		  
		case 5:
		//Outputting all birds
			printArrayListElements(birdsList);
		 break;
		// outputting all fish 
		case 6:
			printArrayListElements(fishList);
			break;
		//outputting all jungle animals 	
		case 7:
			displayEnvironment(jungleList);
			break;
		// outputting all desert animals
		case 8: 
			displayEnvironment(desertList);
			break;
		// outputting all arctic animals
		case 9:
			displayEnvironment(arcticList);
			break;
		// outputting all water animals	
		case 10: 
			displayEnvironment(waterList);
			break;
		// outputting all forest animals	
		case 11: 
			displayEnvironment(forestList);
			break;
		// outputting food required for animals
		case 12:
			foodRequired(animalDetails);
		break;
			// invalid input message in case the user select an irrelevant number 
		 default:
			  System.out.println("Invalid input");
		}
		
		System.out.println("================================================================================================================================");
		System.out.println("Select one of the following options - \n 1. Display animal details - \n 2. Print a list of all animals - \n 3. Print all mammals - \n 4. Print all reptiles \n 5. Print all birds - "
				+ "\n 6. Print all fish - \n 7. Print all jungle animals - \n 8. Print all desert animals - \n 9. Print all arctic animals - \n 10. Print all water animals - \n 11. Print all forest animals - "
				+ "\n 12 Food required for each animal - \n Press 0 to exit the application and leave the zoo. ");
		input = scan.nextInt();
		if (input == 0) {
			System.out.println("Thank you for visiting York St Johns Zoo, see you next time!");
		}
		else {
			continue;
		}
		
	}
  }
}