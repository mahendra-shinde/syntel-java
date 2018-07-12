import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		String password;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Enter the password: ");
			password = scan.nextLine();
		} while (!password.equalsIgnoreCase("abra-ka-dabra"));

		System.out.println("Congrats, you entered correct password!");
		System.out.println("But system is not ready yet! come again after 250 years!");

	}

}
