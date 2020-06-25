package desafio6.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author troll
 */
public class Desafio64 {
    public static void main(String[] args) {
        int numero, intervalo025, intervalo2650, intervalo5175, intervalo76100;
        
        numero = 0;
        intervalo025 = 0;
        intervalo2650 = 0;
        intervalo5175 = 0;
        intervalo76100 = 0;
        while (numero >=0) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("(um número negativo encerrara o processo)\nInforme um número:"));
        if (numero >= 0 && numero <= 25) {
            intervalo025 += 1;
        }else if(numero >= 26 && numero <= 50) {
            intervalo2650 += 1;
        }else if (numero >= 51 && numero <= 75) {
            intervalo5175 += 1;
        }else if (numero >= 76 && numero <= 100) {
            intervalo76100 += 1;
        }
        }
        
        JOptionPane.showMessageDialog(null, "Dentro do intervalo [0, 25] existem: "+intervalo025+" números"+"\nDentro do intervalo [26, 50] existem: "+intervalo2650+" números"+"\nDentro do intervalo [51, 75] existem: "+intervalo5175+" números"+"\nDentro do intervalo [76, 100] existem: "+intervalo76100+" números");
    }   
}
