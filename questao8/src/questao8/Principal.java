package questao8;
import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
		double  peso, alt,media_idade, media_altura=0, porc, tot80=0;
		int idade,qtde=0,cont_jog,cont_time;
	
		for (cont_time=1;cont_time<=5;cont_time++);{
			media_idade=0;
		for (cont_jog=1;cont_jog<=11;cont_jog++);{
			idade= Integer.parseInt(JOptionPane.showInputDialog(cont_jog));
			peso= Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso:"));
			alt= Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:"));
			if (idade < 18) {
			qtde= qtde + 1;
			}
			media_idade= media_idade + idade;
			media_altura= media_altura + alt;
			if (idade > 80) {
			tot80= tot80 +1;
			}
			System.out.println( ("A quantidade de jogadores com a idade inferior a 18 anos é de :"+qtde+" "));
			media_altura = media_altura/55;
			System.out.println(("A média de altura de todos os jogadores do campeonato é : "+media_altura+" cm "));
			porc= tot80 * 100/55;
			System.out.println(("A porcentagem de jogadores com mais de 80 kg é de: "+porc+" %"));
		}
		}
	}
}
