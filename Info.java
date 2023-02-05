import java.util.Scanner;
class Info{
	public static void main(String[] args){
		String wrd;
		char wrdA;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		wrd = sc.nextLine();
		System.out.println("Enter a Character:");
		wrdA = sc.next().charAt(0);
		System.out.println("Information:"+wrd);
		System.out.println("Character:"+wrdA);
	}
}
