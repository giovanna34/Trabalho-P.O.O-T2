package principal;
import javax.swing.JOptionPane;
public class principal {

	public static void main(String[] args) {
		int num1, num2, soma, raiz;
		System.out.println("Menu");
		System.out.println("1-Somar dois n�meros");
		System.out.println("2- Raiz quadrada de um n�mero");
		int op= Integer.parseInt(JOptionPane.showInputDialog("Digite sua op��o:"));
		if (op== 1) {
			 num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para o primeiro numero:"));
			 num2= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para o segundo numero:"));
			 soma= num1+num2;
			 System.out.println("A soma de " +num1+ "e " +num2+ "e 4" +soma);
		}
		else if (op==2) {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
			raiz= (num1*num1);
			System.out.println("A raiz quadrada de" +num1+ "�" +raiz);
		}
		else {
			System.out.println("Op��o inv�lida");
		}
	}

}
