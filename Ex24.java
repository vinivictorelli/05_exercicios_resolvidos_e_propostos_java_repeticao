import javax.swing.JOptionPane;

public class Ex24 {
    public static void main(String[] args) {
        int n = 1;
        double mediaNumDigitados = 0 , mediaNumPares = 0;
        int somaNumerosDigitados = 0, quantidadeNumDigitados = 0,maiorNum = 0, menorNum = 0;
        int somaNumerosPares = 0, quantidadeNumPares = 0;
        
        while (n > 0) {
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite número inteiro: "));
            somaNumerosDigitados = somaNumerosDigitados + n;
            quantidadeNumDigitados = quantidadeNumDigitados + 1;
            if (n > maiorNum) {
                maiorNum = n;
            }
            if (n < menorNum) {
                menorNum = n;
            }
            if (n%2 == 0) {
                somaNumerosPares = somaNumerosPares + n;
                quantidadeNumPares = quantidadeNumPares + 1;
            }   
        }
        mediaNumDigitados = somaNumerosDigitados / quantidadeNumDigitados; 
        mediaNumPares = somaNumerosPares / quantidadeNumPares;
        
        JOptionPane.showMessageDialog(null,"A soma dos números digitados é " + somaNumerosDigitados);
        JOptionPane.showMessageDialog(null,"A quantidade de números digitados é "+ quantidadeNumDigitados);
        JOptionPane.showMessageDialog(null,"A média dos números digitados é "+ mediaNumDigitados);
        JOptionPane.showMessageDialog(null,"O maior número digitado é "+ maiorNum);
        JOptionPane.showMessageDialog(null,"O menor número digitado é "+menorNum);
        JOptionPane.showMessageDialog(null,"A média dos números pares é "+ mediaNumPares);
    }    
}
