package volumen_2;

public class Goteras {
	static java.util.Scanner in;

	public static void casosdeprueba() {
		Integer n = in.nextInt();
		int[] vector = vectordesalida(n);
		if (vector[0] >= 10) {
			System.out.print(vector[0] + ":");
		} else {
			System.out.print("0" + vector[0] + ":");
		}
		if (vector[1] >= 10) {
			System.out.print(vector[1] + ":");
		} else {
			System.out.print("0" + vector[1] + ":");
		}
		if (vector[2] >= 10) {
			System.out.println(vector[2]);
		} else {
			System.out.println("0" + vector[2]);
		}
	}

	public static int[] vectordesalida(int numero) {
		int[] salida = new int[3];
		int paso = numero;
		while (paso >= 3600) {
			paso -= 3600;
			salida[0]++;
		}
		while (paso >= 60) {
			paso -= 60;
			salida[1]++;
		}
		salida[2] = paso;
		return salida;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new java.util.Scanner(System.in);
		int numcasos = in.nextInt();
		for (int i = 0; i < numcasos; i++) {
			casosdeprueba();
		}

	}

}