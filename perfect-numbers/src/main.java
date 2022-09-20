import java.util.Scanner;
public class main {
	
			public static void main(String[] args) {
				Scanner myObject = new Scanner(System.in);
				
				System.out.println("Please enter a number to check whether it is a perfect number:");
				
				int i, Number, Sum = 0 ;
		
				Number = myObject.nextInt();

				for(i = 1 ; i < Number ; i++) {
					if(Number % i == 0)  {
						Sum = Sum + i;
					}
				}
				if (Sum == Number) {
					System.out.format("\n% d is a Perfect Number", Number);
				}
				else {
					System.out.format("\n% d is NOT a Perfect Number", Number);
				}
			
		
	}

}
