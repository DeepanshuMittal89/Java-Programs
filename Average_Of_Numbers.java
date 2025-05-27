import java.util.Scanner;
class Average_Of_Numbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i = 1; i<=5 ; i++){
			System.out.print("Enter digit "+i+" : ");
			sum+=sc.nextInt();
		}

		System.out.println("Average Of Numbers: "+ sum/5.0) ;
	}
}