import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char x;
		int y;
		String d;

		x = sc.next().charAt(0);
		y = sc.nextInt();
		d = sc.next();

		System.out.println("Voce Digitou " + x);
		System.out.println("Voce Digitou " + d);
		System.out.println("Voce Digitou " + y);

		sc.close();

	}

}
