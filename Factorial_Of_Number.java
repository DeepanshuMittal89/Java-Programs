import java.util.Scanner;
class Factorial_Of_Number{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int a = sc.nextInt();
		int fact = 1;

		while(a>=1){
			fact = fact*a;
			a--;
		}
		System.out.println("Factorial of "+ a +" is :"+fact);
		sc.close();	
	
	}
}