import java.util.Scanner;
class Add_One_To_All_Digits_Of_Number{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int a = sc.nextInt();
		int sum = 0;
		int reverse = 0;
		while(a>0){
			int n = a%10;
			n++;
			sum = sum*10+n;
			a= a/10;
		}
		while(sum>0){
			int n = sum %10;
			reverse = reverse*10+n;
			sum= sum/10;
		}
		System.out.println("Sum of digits of a number is : "+reverse);
		sc.close();	
	
	}
}