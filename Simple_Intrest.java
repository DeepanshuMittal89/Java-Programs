import java.util.Scanner;
class Simple_Intrest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principle Amount : ");
		float P = sc.nextFloat();
		System.out.print("Enter Rate Of Intrest : ");
		float R = sc.nextFloat();
		System.out.print("Enter Time Period : ");
		float T = sc.nextFloat();

		System.out.println("Simple Intrest : "+ (P*R*T)/100.0) ;
	}
}