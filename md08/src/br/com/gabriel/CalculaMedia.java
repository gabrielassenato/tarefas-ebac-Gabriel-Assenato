package br.com.gabriel;

public class CalculaMedia {
	public static void main (String args[]) {
		int notaAv1 = 10;
		System.out.println("A nota 1 foi: " + notaAv1);
		int notaAv2 = 7;
		System.out.println("A nota 2 foi: " + notaAv2);
		int notaAv3 = 3;
		System.out.println("A nota 3 foi: " + notaAv3);
		int notaAv4 = 5;
		System.out.println("A nota 4 foi: " + notaAv4);
		
		int media = (notaAv1 + notaAv2 + notaAv3 + notaAv4) / 4;
		System.out.println("A média é: " + media);
	}
}
