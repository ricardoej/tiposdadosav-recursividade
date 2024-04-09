package br.edu.univas.recursividade;

// metodo com recursividade
public class Calculadora {
    
    public int getFatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * getFatorial(numero - 1);
        }
    }
}


// sem ultilizare recusividade 
		
//public class Calculadora {
    
// Método para calcular o fatorial sem utilizar recursão
//public int calcularFatorial(int n) {
// Inicializa o resultado como 1
//int resultado = 1;
        
// Loop for para iterar sobre os números de 1 até n
//for (int i = 1; i <= n; i++) {
// Multiplica o resultado pelo próximo número na sequência
//resultado *= i;
//}
        
// Retorna o resultado do fatorial
//return resultado;
//}
//}