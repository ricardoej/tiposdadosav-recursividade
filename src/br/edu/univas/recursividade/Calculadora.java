package br.edu.univas.recursividade;

public class Calculadora {
	
	public int getFatorial(int idResposta) {
		if (idResposta == 0 || idResposta == 1) {
			return 1;
		}
		else {
			return idResposta * getFatorial(idResposta -1);
		}
		
	}
}
	/*public int getFatorial(int idResposta) {
		if(idResposta == 0) {
			return 1;
		}
		int num = idResposta;
		int resultado_multi = 1;
		while(num >= 1) {
			resultado_multi *= num;
			num --;
		}
			return resultado_multi;
	}
	*/

