package principal;
import javax.swing.JOptionPane;
public class principal {

	public static void main(String[] args) {
		int num1, num2, soma, raiz;
		System.out.println("Menu");
		System.out.println("1-Somar dois números");
		System.out.println("2- Raiz quadrada de um número");
		int op= Integer.parseInt(JOptionPane.showInputDialog("Digite sua opção:"));
		if (op== 1) {
			 num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para o primeiro numero:"));
			 num2= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para o segundo numero:"));
			 soma= num1+num2;
			 System.out.println("A soma de " +num1+ "e " +num2+ "e 4" +soma);
		}
		else if (op==2) {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
			raiz= (num1*num1);
			System.out.println("A raiz quadrada de" +num1+ "é" +raiz);
		}
		else {
			System.out.println("Opção inválida");
		}
	}

}
