package br.edu.univas.recursividade;

public class Calculadora {
	
	public int getFatorial(int num) {
		
		if (num == 0) {
			return 1;
		}
		
		else {
			return num * getFatorial(num - 1);
		}
	}

}
