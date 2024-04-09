package br.edu.univas.recursividade;

public class Calculadora {

	public int getFatorial(int fatorial) {
		if(fatorial == 0 || fatorial == 1) {
			return 1 ;
		}else{			
		
		return fatorial * getFatorial(fatorial - 1);
	}
}
	public int getFatorial(int fatorial) {
		int resultado = 1;
		
		for(int i = 1; i <= fatorial ; i++) {
			resultado *= i;
		}
		return resultado;
	
	}
}
