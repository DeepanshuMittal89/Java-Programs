import java.util.Scanner;
class Swap_Numbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter digit 1 : ");
		int a = sc.nextInt();
		System.out.print("Enter digit 2 :");
		int b = sc.nextInt();
		System.out.println("Before Swapping "+ a +" and "+ b);
		int temp = a;
		a = b;
		b= temp;
		System.out.println("After Swapping "+ a +" and "+ b);
	}
}