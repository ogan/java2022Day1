import java.util.Random;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		System.out.println("Please enter a number to see if you are lucky.");
		Scanner myObject = new Scanner(System.in);
		int number = myObject.nextInt();
		int i;
		int[] array;
		int randomNumber = 0;
		array = new int[5];
		int upperBound = 100;
		
		Random rand = new Random();
		for(i =0;i<array.length;i++) {
			randomNumber = rand.nextInt(upperBound);
			array[i] = randomNumber;
			System.out.println(array[i]);
		}
			
			
			if (number == i) {
				System.out.println("Your guess " + number +" is wright.");
			}else {
				System.out.println("Your guess " + number + " is Wrong!!!");
			}

		}
		
		
		}
		

	


