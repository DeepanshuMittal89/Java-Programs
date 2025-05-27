import java.util.Scanner;
class Celsius_To_Fehrenheit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the option\n A: C to F \n B: F to C");

		char ch = sc.next().charAt(0);
		
		switch(ch){
			case 'A':{ 
				System.out.print("Enter Celsius: ");
				float c = sc.nextFloat();
				System.out.println("Temp in Fehrenheit: "+ (c * 9 / 5 + 32.0));
				break;
			}
			case 'B':{
				System.out.print("Enter Fehrenheit: ");
				float f = sc.nextFloat();
				System.out.println("Temp in Celsius"+ (f-32.0) * 5 / 9);
				break;
			}
		}
	}
}