package br.edu.univas.recursividade;

public class Calculadora {


	//public int getFatorial(int numero) {
		//if (numero == 0 || numero ==1) {
			//return 1;
			
		//}else {
		//	return numero * getFatorial(numero -1);
		//}
	//}
	public int getFatorial(int x) {
		int fatorial = 1;
		for (int i = 1; i <= x; i++) {
			fatorial *= i;
		}
		return fatorial;
	}
}