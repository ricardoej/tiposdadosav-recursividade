package br.edu.univas.recursividade;

public class Calculadora {

    public int getFatorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * getFatorial(num - 1);
        }
    }
}

//Método utilizando recursividade
//package br.edu.univas.recursividade;

//public class Calculadora {
	//public int getFatorial(int num) {
      //  if (num == 0 || num == 1) {
        //    return 1;
       // } else {
         //   return num * getFatorial(num - 1);
       // }
//	}
//}


//Método sem utilizar recursividade
//public int getFatorial(int num){
//Inicializa o resultado como 1, pois o fatorial de 0 e 1 é 1
//int resultado = 1;
//Itera de 1 até o numero fornecido
//for (int = 1; i <= num; i++){
//Multiplica o resultado pelo número atual da iteração
//resultado *= i;
//}
//Retorna o resultado final do fatorial
//return resultado;
//}
//}