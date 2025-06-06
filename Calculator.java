import java.util.Scanner;
class Calculator{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Caculator!!!");

		System.out.print("Enter number 1 : ");
		double a = sc.nextDouble();

		System.out.print("Enter number 2 : ");
		double b = sc.nextDouble();

		System.out.println("Enter the operation:\n A-> +\n B-> -\n C-> *\n D-> /");
		
		char option = sc.next().charAt(0);

		switch(option){
			case 'A': System.out.println("Sum of "+a+ " and "+b +" : " +(a+b));
				break;
			case 'B': System.out.println("Difference of "+a+ " and "+b +" : " +(a-b));
				break;
			case 'C': System.out.println("Product of "+a+ " and "+b +" : " +(a*b));
				break;
			case 'D': if(b!=0){
					System.out.println("Division of "+a+ " and "+b +" : " +(a/b));
					break;
				}else{
					System.out.println("Divisor can not be 0!! ");
					break;
				}
		default: {
			System.out.print("Enter valid operation!!! ");
			}

		}
		sc.close();	
	
	}
}