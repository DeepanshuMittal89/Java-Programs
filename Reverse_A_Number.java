import java.util.Scanner;
class Reverse_A_Number{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int a = sc.nextInt();
		int sum= 0;

		while(a>0){
			int dig = a%10;
			sum = sum*10+dig;
			a = a/10;
		}
		System.out.println("Reverse Number is : "+ sum);
		sc.close();	
	
	}
}