import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		Scanner myObject = new Scanner(System.in);
		
		System.out.println("Please enter an integer greater than 1 to check whether it's a prime:");
		
		

		if(myObject.hasNextInt()) {
			int number = myObject.nextInt();
			int sum = 0;
		
		for (int i = 1; i <= number; i++) {
			if(number % i == 0) {
				sum++;
			}
		}

		if(number<=1){
			System.out.println("Please enter a positive integer greater than 1.");
		}
		else if(sum >2){
			System.out.println("Your number is not a prime.");
		} else {
			System.out.println("Your number is a prime");
		} 
	} else {
		System.out.println("Please enter a postive integer.");
	}
	}
		
	}



