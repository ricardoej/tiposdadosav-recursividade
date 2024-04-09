package br.edu.univas.recursividade;

public class Calculadora {
	
	
	public int getFatorialRecursivo(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * getFatorialRecursivo(n - 1);
		}
	}
	
	// Método sem recursividade para calcular o fatorial
	public int getFatorial(int n) {
		int fatorial = 1;
		for (int i = 1; i <= n; i++) {
			fatorial *= i;
		}
		return fatorial;
	}
}

