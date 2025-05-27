import java.util.Scanner;
class Sum_Of_Two_Input_Numbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter digit 1 : ");
		int a = sc.nextInt();
		System.out.print("ENter digit 2 :");
		int b = sc.nextInt();
		System.out.println("Sum of "+ a +" and "+ b +" is: "+ (a+b));
	}
}