package br.edu.univas.recursividade;

public class Calculadora {
	
	public int getFatorial(int n) {
	/if(n == 0 || n == 1) {
			return 1;
		}
		else {
		return n * getFatorial(n - 1);	
		}
	}	
	public int getFatorial(int id) {
		int resultado = 1;
		for(int i = 1; i <= id ; i++) {
			resultado *= i;
		}
		return resultado;
	}
}
