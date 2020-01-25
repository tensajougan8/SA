import java.util.Scanner;

public class ProxyPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProxyPrint Print = new ProxyPrint();

		Scanner input = new Scanner(System.in);

		System.out.println("Enter user name");
		String UserName = input.nextLine();
		System.out.println("Enter Password");
		String Password = input.nextLine();
		Print.PrintCurrent(UserName, Password);

	}

}
