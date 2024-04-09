package br.edu.univas.recursividade;

public class Calculadora {

	//public int getFatorial(int id) {
		//if(id == 1 || id == 0) {
			//return 1;
		//}
		//else {
			//return id * getFatorial(id - 1);
		//}
	//}
	
	public int getFatorial(int id) {
		int resultado = 1;
		
		for(int i = 1; i <= id; i++ ) {
			resultado *= i;
			
		}
		return resultado;
	}


}
