import java.util.Scanner;
class Largest_Three_Numbers{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1 : ");
		int a = sc.nextInt();

		System.out.print("Enter number 2 : ");
		int b = sc.nextInt();

		System.out.print("Enter number 3 : ");
		int c = sc.nextInt();
		if(a>=b && a>=c){
			System.out.print(a+" is the greatest number ");
		}else if(b>=a && b>=c){
			System.out.print(b+ " is greatest number ");	
		}else{
			System.out.print(c+ " is greatest number ");
		}
		sc.close();	
	
	}
}