package volumen_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Números_afortunados {

	public static ArrayList<Integer> crearlista(int numero) {
		ArrayList<Integer> salida = new ArrayList<Integer>();
		for (int i = 1; i <= numero; i++) {
			salida.add(i);
		}
		return salida;
	}

	public static ArrayList<Integer> eliminarnumeros(int numero) {
		ArrayList<Integer> ListaDeNumeros = crearlista(numero);
		int orden = 1;
		while (orden < ListaDeNumeros.size()) {
			for (int b = 0; b < ListaDeNumeros.size(); b++) {
				if (b % orden == 0) {
					ListaDeNumeros.remove(b);
				}
			}
			orden++;
		}
		return ListaDeNumeros;
	}

	public static void imprimir(int entrada, ArrayList<Integer> ListaDeNumeros) {
		System.out.print(entrada + ": ");
		for (int i = (ListaDeNumeros.size() - 1); i >= 0; i--) {
			if (i != 0) {
				System.out.print(ListaDeNumeros.get(i) + " ");
			} else {
				System.out.println(ListaDeNumeros.get(i));
			}
		}
	}

	public static void hacercosas(int entrada) {
		ArrayList<Integer> ListaDeNumeros = eliminarnumeros(entrada);
		imprimir(entrada, ListaDeNumeros);
	}

	public static boolean casosdeprueba() {
		Scanner teclado = new Scanner(System.in);
		Integer entrada = teclado.nextInt();
		boolean salida;
		if (entrada != 0) {
			hacercosas(entrada);
			salida = true;
		} else {
			salida = false;
		}
		return salida;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (casosdeprueba()) {

		}
	}

}