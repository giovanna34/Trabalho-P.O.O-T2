package principal;
import java.lang.Math;
import javax.swing.JOptionPane;
public class principal {

	public static void main(String[] args) {
	double a,b,c, delta, x1, x2;
	 a= Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de a"));
	 b= Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de b:"));
	 c= Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de c:"));
	 delta= (b*b)-(4*a*c);
	 System.out.println("Delta= "+delta);
	 x1= (-b+Math.sqrt(delta))/(2*a);
	 x2=(-b-Math.sqrt(delta))/(2*a);
	 System.out.println("Valores raizes:"+x1+ " , "+x2);
	}

}
 