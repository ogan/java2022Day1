import java.util.Scanner;
public class main {

	public static void main(String[] args) {
//Amicable numbers are two different natural numbers related in such a way that the sum of the proper divisors 
//of each is equal to the other number. That is, σ(a)=b and σ(b)=a, where σ(n) is equal to the sum of positive divisors 
//of n (see also divisor function).
		int firstDivisor = 0, secondDivisor = 0;
		Scanner myObject = new Scanner(System.in);
		System.out.println("Please enter the first number:");
		int firstInput = myObject.nextInt();
		System.out.println("Please enter the second number:");
		int secondInput = myObject.nextInt();
		
		for(int i = 1; i<firstInput;i++) {
			if(firstInput %i == 0) {
				firstDivisor += i;
				
			}
		}
		for(int j=1;j<secondInput;j++) {
			if(secondInput%j == 0) {
				secondDivisor += j;
				
			}
		}
		
		if((firstInput == secondDivisor)&&(secondInput == firstDivisor)) {
			System.out.println("Your numbers are Amicable numbers.");
		}else {
			System.out.println("Your numbers are not Amicable numbers.");
		}
		

	}

}
