package br.edu.univas.recursividade;

public class Calculadora {

	public int getFatorial(int i) {
		if (i == 1 || i == 0) {
			return 1;
		}
		else {
			return i * getFatorial (i - 1);
		}
	}

}


//public int getFatorial (int id) {
        //int resultado = 1;
        
        //for(int i = 1; i <= id; i ++) {
        	//resultado *= i;
       // }

       // return resultado;
   // }

//}