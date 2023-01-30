import java.util.Scanner;

class Program{

	static String choice = "  ";
	static Scanner input = new Scanner(System.in);
	static Pet pick = new Dog();

public static void main(String[] args){

	System.out.println("What is your favorite pet? CAT or DOG?");

	while(choice.compareTo("CAT") != 0 && choice.compareTo("DOG") != 0){

	System.out.println("Please type exactly CAT or DOG:");
	
	choice = input.nextLine();	
}
	if(choice.compareTo("DOG") == 0){

		pick = new Dog();
		
		}

	if(choice.compareTo("CAT") == 0){
	
		pick = new Cat();
		}	
		
		System.out.println("You chose " + choice + "!");
		pick.noise();
		
	}
}
	