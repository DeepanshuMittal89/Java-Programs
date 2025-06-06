import java.util.Scanner;
class Sum_Of_Digits_Of_Number{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int a = sc.nextInt();
		int sum = 0;
		while(a>0){
			int n = a%10;
			sum = sum+n;
			a= a/10;
		}
		System.out.println("Sum of digits of a number is : "+sum);
		sc.close();	
	
	}
}