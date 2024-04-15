package br.edu.univas.recursividade;

public class CalculadoraFatorial {

	public static int getFatorial(int n) {
	int fatorial = 1;
	for (int i = 2; i <= n; i++) {
	fatorial= fatorial * i;
	}
	return fatorial;
	}
public static void main(String[] args) {
int numero = 5;
System.out.println(getFatorial(numero));
}
}
	