import java.util.*;


package volumen_2;

public class Qué_lado_de_la_calle {
	static java.util.Scanner in;

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		Integer n = in.nextInt();
		while (n > 0) {
			if (n % 2 == 0) {
				System.out.println("DERECHA");
			} else {
				System.out.println("IZQUIERDA");
			}
			n = in.nextInt();
		}
	}
}
