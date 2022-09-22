import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		System.out.println("Lütfen bir sesli harf girin: ");
		Scanner myObject = new Scanner(System.in);
		char letter = myObject.next().charAt(0);
		
		char[] kalin= {'a','ı','o','u','A','I','O','U'};
		char[] ince= {'e','i','ö','ü','E','İ','Ö','Ü'};
		
		boolean inceMi = false;
		boolean kalinMi = false;
		
		for(int i=0;i<kalin.length;i++) {
			if(letter == kalin[i]) {
				kalinMi = true;
			} else if(letter == ince[i]) {
				inceMi = true;
			} 
		} 
		if(kalinMi) {
			System.out.println("Kalın girdiniz.");
		}
		else if(inceMi) {
			System.out.println("İnce girdiniz.");
		} else {
				System.out.println("Sesli harf girmediniz. Lütfen bir sesli harf girin!");
				
			}
		
	}

}
