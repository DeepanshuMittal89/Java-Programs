import java.util.Scanner;
class Largest_Two_Numbers{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1 : ");
		int a = sc.nextInt();

		System.out.print("Enter number 2 : ");
		int b = sc.nextInt();
		if(a>b){
			System.out.print(a+ " is greater than "+b);
		}else{
			System.out.print(b+ " is greater than "+a);
		}	
	
	}

	

}