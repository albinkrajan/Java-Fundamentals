import java.util.Scanner;
class Greatest{
	public static void main(String[] args){
		int noF, noS;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Number:");
		noF = sc.nextInt();
		System.out.print("Enter 2nd Number:");
		noS = sc.nextInt();
		if(noF>noS)
			System.out.println("The 1st Number is Greatest");
		else
			System.out.println("The 2nd Number is Greatest");
	}
}
