import java.util.Scanner;
class Area_Of_Rectangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of Rectangle: ");
		int l = sc.nextInt();
		System.out.print("Enter bredth of Rectangle: ");
		int b = sc.nextInt();

		System.out.println("Area Of Rectangle : "+l*b);
	}
}