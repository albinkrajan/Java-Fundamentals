import java.util.Scanner;
class Addition{
	public static void main(String[] args){
		int noF, noS, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		noF = sc.nextInt();
		System.out.println("Enter the 2nd number:");
		noS = sc.nextInt();
		sum = noF + noS;
		System.out.println("Sum ="+sum);
	}
}
		