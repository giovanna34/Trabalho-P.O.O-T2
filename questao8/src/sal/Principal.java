package sal;
import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
		int op , sal, imp = 0 ,aum,novo_sal ;
        System.out.println("MENU DE OPÇÕES");
        System.out.println("[1]- Imposto");
        System.out.println("[2]- Novo Salário");
        System.out.println("[3]- Classificação");
        System.out.println("[4]- Finalizar o programa");
        op= Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada:"));
        
        if (op > 4 ||op<1) {  
        System.out.println("Opção inválida!");
        }
        if (op==1){ 
        sal= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do seu salário :"));
        if (sal<500){
        System.out.println("O valor do imposto é de:");
        imp = sal*5/100;
        System.out.print( imp );
        }
        if (sal>=500 && sal<=850) {
        System.out.println("O valor do imposto é de:");
        imp= sal*10/100;
        System.out.print( imp ); 
        }
        if(sal>850){
        System.out.println("O valor do imposto é de:");
        imp= sal*15/100;
        System.out.print( imp );
        }
	}
        if (op==2){
        sal= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do seu salário :"));
  
        if (sal>1500){
        aum= 25;
        System.out.print("O valor do seu aumento é de: R$");
        novo_sal= sal + aum;
        System.out.println(novo_sal);
        }
        if (sal>=750 && sal <=1500){
        aum= 50;
        System.out.print("O valor do seu aumento é de: R$");
        novo_sal= sal + aum;
        System.out.println(novo_sal);
        }
        if (sal>=450 && sal<750){
        aum= 75;
        System.out.print("O valor do seu aumento  é de: R$");
        novo_sal= sal + aum;
        System.out.println(novo_sal);
        }
        if (sal <450) {
        	aum= 100;
        	 System.out.print("O valor do seu aumento  é de:  R$ ");
        	 novo_sal= sal + aum;
             System.out.println(novo_sal);
        }
    }
        if (op==3){	
        sal= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do seu salário :"));
        if (sal<=700){
        System.out.println("Mal remunerado :(");
        }else if (sal > 700){
        	  System.out.println("Bem remunerado!");
        }
        }
	}
}