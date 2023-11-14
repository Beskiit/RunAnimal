package OOPactivity;

import java.util.Scanner;

public class RunAnimal {
	
	static boolean cont;
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Bird B = new Bird();
		Cat C = new Cat();
		Dog D = new Dog();
		cont = true;
		
		while(cont) {
			while(cont) {
				System.out.print("Choose an animal. Press B for Bird, C for Cat, and D for Dog: ");
				String choice = sc.next();
			
				if(choice.equalsIgnoreCase("B")) {
					B.eat();
					B.sleep();
					B.makeSound();
					break;
				}else if(choice.equalsIgnoreCase("C")) {
					C.eat();
					C.sleep();
					C.makeSound();
					break;
				}else if(choice.equalsIgnoreCase("D")) {
					D.eat();
					D.sleep();
					D.makeSound();
					break;
				}else {
					System.err.println("Please choose from C, B, and D only.\n");
				}
			}
			
			while(cont){
				System.out.println("\nPress [Y] if you want to choose another animal and [N] if not.");
				String option = sc.next();
				
				if(option.equalsIgnoreCase("Y")) {
					System.out.println();
					break;
				}else if(option.equalsIgnoreCase("N")) {
					System.out.println("Thank you for using our program!");
					cont = false;
				}else {
					System.err.println("Wrong input! Please try again.\n");
				}
			}
		}
	}
}
