import java.util.Scanner;
class Square_and_Cube_Of_Numbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter digit: ");
		int a = sc.nextInt();
		System.out.println("Square Of Number: "+ (a*a));
		System.out.println("Cube of Number: "+ (a*a*a));
	}
}