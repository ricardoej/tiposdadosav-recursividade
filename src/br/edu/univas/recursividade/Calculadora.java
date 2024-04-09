package br.edu.univas.recursividade;

public class Calculadora {
	   public int getFatorial(int n) {
	  /*     if (n == 0 || n == 1) {
	           return 1;
	       } else {
            int fatorial = 1;
            for (int i = 2; i <= n; i++) {
	               fatorial *= i;
	           }
	           return fatorial;
	       }*/
		
		   if (n == 0 || n == 1) {
	           return 1;
	       } return  n * getFatorial(n - 1);
	  }
}