package p.o.o;
import javax.swing.JOptionPane;
public class principal {

	public static void main(String[] args) {
		int num=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro para saber se é par ou impar"));
	    float r = num%2 ;
		if (r == 0) {
			System.out.println("Numero par");
			
		}
		else {
			System.out.println("Numero impar");
			
		}

}
}
