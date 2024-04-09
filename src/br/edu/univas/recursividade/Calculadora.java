package br.edu.univas.recursividade;
	
//public class Calculadora {
//			//Sem recursividade//
//	public int getFatorial(int numero) {
//		
//		if (numero == 0 || numero == 1) {
//			return 1;
//		}
//		else {
//			int fatorial = 1;
//			for(int i = numero; numero > 0; numero--) {
//				System.out.println(fatorial);
//				fatorial *= numero;
//			}
//			return fatorial;
//		}
//	}
//}
	
 public class Calculadora {	 
    			//com recursividade//
    	public int getFatorial(int numero) {
        
        if (numero == 0 || numero == 1) {
            return 1;
        }
		int resultado = numero * getFatorial(numero - 1); 
		System.out.println(resultado);
        return resultado;
    }
}    