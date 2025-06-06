import java.util.Scanner;
class Check_Odd_Or_Even{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int a = sc.nextInt();
		if(a%2==0){
			System.out.print("Even Number!!");
		}else{
			System.out.print("Odd Number!!");
		}	
	
	}

	

}