import java.util.Scanner;

class Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
	int orignal = a;
	int sum = 0;

	while(a>0){
		int n = a%10;
		sum = sum*10+n;
		a=a/10;
	}
	
	if(sum==orignal){
		System.out.println("Palindrome!!");
	}else{
		System.out.println("Not Palindrome!!");
	}

        sc.close();
    }
}
