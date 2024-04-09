package br.edu.univas.recursividade;

public class Calculadora {
	
	public int getFatorial(int n){
		
		// FATORIAL SEM RECURSIVIDADE
		/*int resultado1 = 1;
		
		for (int i = 1; i <= n; i++) {
			resultado1 = resultado1 * i;
		}
		
		return resultado1; */
		
		// Fatorial com recursividade
		if (n < 0) {
			 throw new IllegalArgumentException("O fatorial não pode ser negativo.");
		}
		
		if (n == 0) {
			return 1;
		}
		
		else {
			return n * getFatorial (n - 1);
		}
	}

}
