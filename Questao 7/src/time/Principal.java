package time;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int idade,
		quant_idade=0, 
		cont_jog=0,
		cont_time=0,
		quantinf18=0;
	
	double media_idade=0,
		   peso=0, 
		   porc=0, 
		   tot80=0,
		   quant_altura=0,
		   alt=0,
		   media_altura=0;
	
	for (cont_time=1;cont_time<=5;cont_time++) {
		
		for (cont_jog=1;cont_jog<=11;cont_jog++){	

			idade= Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do jogador"+cont_jog+"do time"+cont_time));
			peso= Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do jogador:"+cont_jog+"do time"+cont_time));
			alt= Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do jogador:"+cont_jog+"do time"+cont_time));
			
			if (idade < 18) {
			   quantinf18 ++;
			}
			
			quant_idade= quant_idade+idade;
			media_idade= quant_idade/22;
			
			quant_altura= quant_altura + alt;
			media_altura = quant_altura/22;
			
			if (peso > 80) {
				tot80 = tot80+1;
			}
		
		}
		
	}
	System.out.println("media da idade dps jogadores de cada time é:"+ media_idade);
	System.out.println( ("A quantidade de jogadores com a idade inferior a 18 anos é de :"+quantinf18+" "));
	System.out.println(("A média de altura de todos os jogadores do campeonato é : "+media_altura+" cm "));
	porc= tot80 * 100/55;
	System.out.println(("A porcentagem de jogadores com mais de 80 kg é de: "+porc+" %"));
}
}
