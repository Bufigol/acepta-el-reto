package volumen_1;

public class Suma_de_dígitos {
	static java.util.Scanner in;

	public static Integer sumardigito(Integer numero) {
		Integer salida = 0;
		Integer paso = numero;
		while (paso > 0) {
			salida += paso % 10;
			paso /= 10;
		}
		return salida;
	}

	public static int contardigitos(Integer numero) {
		Integer contador = 0;
		Integer paso = numero;
		do {
			paso /= 10;
			contador++;
		} while (paso > 0);
		return contador;
	}

	public static Integer[] pasovector(Integer numero) {
		Integer cifras = contardigitos(numero);
		Integer[] salida = new Integer[cifras];
		Integer paso = numero;
		for (int i = 0; i < salida.length; i++) {
			salida[i] = paso % 10;
			paso /= 10;
		}
		return salida;
	}

	public static void imprimir(Integer[] vector) {
		for (int i = vector.length - 1; i >= 0; i--) {
			if (i != 0) {
				System.out.print(vector[i].toString() + " + ");
			} else {
				System.out.print(vector[i].toString() + " = ");
			}

		}
	}

	public static boolean casosdeprueba() {
		Integer n = in.nextInt();
		if (n < 0) {
			return false;
		} else {
			Integer suma = sumardigito(n);
			Integer[] vector = pasovector(n);
			imprimir(vector);
			System.out.println(suma);
			return true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new java.util.Scanner(System.in);
		while (casosdeprueba())
			;
	}
}
