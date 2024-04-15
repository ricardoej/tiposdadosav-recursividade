package br.edu.univas.recursividade;

public class Calculadora {

	public static int getFatorial(int x) {
		int fat = 1;
		for (int i = 2; i <= x; i++) {
		fat= fat * i;
		}
		return fat;
		}
	
	

	
	public static int main(int fator) {
		if (fator == 0 || fator== 1) {
			return 1;
		}
		else {
			return fator * getFatorial(fator -1);
		}
		
	}}