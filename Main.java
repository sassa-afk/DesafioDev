import java.util.*;

public class Main {

    public static class Exe {
        Scanner sc = new Scanner(System.in);

        void exe1() {
            System.out.println("\n\n 1) Observe o trecho de código abaixo: int INDICE = 13, SOMA = 0, K = 0 " +
                    "Enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; }" +
                    "Imprimir(SOMA)\n" +
                    "Ao final do processamento, qual será o valor da variável SOMA?\n");

            int INDICE = 13, SOMA = 0, K = 0;

            while (K < INDICE) {
                K = K + 1;
                SOMA = SOMA + K;
            }

            System.out.println("> Soma é " + SOMA );
        }

        void exe2() {
            System.out.println(
                    "\n\nDado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores" +
                            "(exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa onde, informado um número," +
                            " ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não à sequência."
            );

            System.out.print("- Insira o número para verificar na sequência de Fibonacci:");
            int valor;

            try {
                valor = sc.nextInt();

                if (valor == 0) {
                    System.out.println("O número " + valor + " pertence à sequência.");
                } else {
                    int a = 0, b = 1, c = 0;
                    boolean valida = false;

                    while (c < valor) {
                        c = a + b;
                        a = b;
                        b = c;

                        if (c == valor) {
                            valida = true;
                            break;
                        }
                    }

                    if (valida) {
                        System.out.println("> O número " + valor + " pertence à sequência.");
                    } else {
                        System.out.println("> O número " + valor + " NÃO pertence à sequência.");
                    }
                }
            } catch (Exception err) {
                System.out.println("Tente novamente, pois não foi inserido um número válido.");
            }
        }

        public String exe3() {
            return " https://github.com/sassa-afk/DesafioDev/tree/main  (api servidor node.js com nome api.js e arquivo com exercicios Main2.java) ";
        }
        
	public double porcentagem(double total, double valor) {
	    return (valor / total) * 100; 
	}
	
	public void exe4(){
		double sp = 67836.43 ;
		double rj = 36678.66;
		double mg = 29229.88;
		double es = 27165.48;
		double  outros = 19849.53  ;
		double total = sp+rj+mg+es+outros;
		
		System.out.println("Valor total do lucro : "+ total );
		System.out.println("Porcentage SP "+ porcentagem( total , sp) );
		System.out.println("Porcentage RJ "+ porcentagem(total ,rj) );
		System.out.println("Porcentage MG "+ porcentagem(total ,mg) );
		System.out.println("Porcentage ES "+ porcentagem(total ,es) );
		System.out.println("Porcentage Outros "+ porcentagem(total , outros) );
		
	}

        public void exe5() {
            System.out.println(
                    "\n\n Escreva um programa que invertar os caractericos String"
            );
            System.out.print("Insira a frase : ");

            String frase = sc.nextLine();

            String[] vetor = frase.split("");
            String verso = "";

            for (int i = vetor.length - 1; i >= 0; i--) {
                verso = verso + vetor[i];
            }

            System.out.println("Nova palavra ao verso : " + verso);
        }
    }

    public static void main(String args[]) {
        Exe ex = new Exe();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Selecione um exercicio ");
            System.out.println("1 - exercicio 1 ");
            System.out.println("2 - exercicio 2 ");
            System.out.println("3 - exercicio 3 ");
            System.out.println("4 - exercicio 4 ");
	    System.out.println("5 - exercicio 5 ");
            System.out.println("0 - sair ");

            System.out.print("Digite o exercico que deseja : ");
            String op = sc.next();
		
	   System.out.println("==========\n");

            if (op.equals("0")) {
                System.out.println("Algoritimo finalizado");
                break;
            } else if (op.equals("1")) {
                System.out.println("Selecionado exercicio 1 ");
                ex.exe1();
            } else if (op.equals("2")) {
                System.out.println("Selecionado exercicio 2 ");
                ex.exe2();
            } else if (op.equals("3")) {
                System.out.println("Selecionado exercicio 3  exercicio no diretorio " + ex.exe3());
            } else if (op.equals("4")) {
                System.out.println("Selecionado exercicio 4  ");
                ex.exe4();
            } else if (op.equals("5")) {
                System.out.println("Selecionado exercicio 5 ");
                ex.exe5();
            } else {
                System.out.println("Opção selecionado invalida");
            }

            System.out.println("\n==========");
        }
    }
}
