import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        double n1,n2,resultado;
        Scanner leitor = new Scanner(System.in);
        int escolha;
        do{
            System.out.println("=================================================================");
            System.out.println("Selecione uma das opções abaixo:");
            System.out.println("Soma(1)\nSubtração (2)\nMultiplicação (3)\nDivisão (4)\nSaída (5)");
            escolha = leitor.nextInt();
            System.out.println("=================================================================");
            switch (escolha) {
                case 1:
                    System.out.println("Digite dois numeros:");
                    n1 = leitor.nextDouble();
                    n2 = leitor.nextDouble();
                    resultado = n1 + n2;
                    System.out.println("A soma dos numeros e: "+resultado);
                    break;
                case 2:
                    System.out.println("Digite dois numeros:");
                    n1 = leitor.nextDouble();
                    n2 = leitor.nextDouble();
                    resultado = n1 - n2;
                    System.out.println("A subtracao dos numeros e: "+resultado);
                    break;
                case 3:
                    System.out.println("Digite dois numeros:");
                    n1 = leitor.nextDouble();
                    n2 = leitor.nextDouble();
                    resultado = n1 * n2;
                    System.out.println("A multiplicacao dos numeros e: "+resultado);
                    break;
                case 4:
                    System.out.println("Digite dois numeros:");
                    n1 = leitor.nextDouble();
                    n2 = leitor.nextDouble();
                    resultado = n1 / n2;
                    System.out.println("A divisao dos numeros e: "+resultado);
                    break;
            
            }
        }while(escolha != 5);
    leitor.close();
    } 
}
