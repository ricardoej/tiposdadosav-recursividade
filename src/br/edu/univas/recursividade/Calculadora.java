package br.edu.univas.recursividade;

public class Calculadora {

	/*
	public int getFatorial(int Num) {
		if (Num == 1 || Num == 0) {
			return 1;
		} else {
			return Num * getFatorial(Num - 1);
		}
	}
	
	 */
	
	public int getFatorial (int Num) {
		int result = 1;
		for (int i = 1; i <= Num; i++) {
			result *= i;
		}
		return result;
	}
}
