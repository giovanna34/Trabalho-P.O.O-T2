package primo;
import  java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		int num,i,divisores;
		Scanner recebe = new Scanner(System.in);
		divisores = 0;
		
		System.out.print("escreva um numero ");
		num = recebe.nextInt();
		recebe.close();
		
		for(i = 1; i <=num; i++) {
		if (num%i == 0){
			divisores++;
		}
		}
	     if(divisores==2) {
	    	 System.out.print("esse numero é primo");
		}
	     else {
	    	 System.out.print("esse numero não é primo");
	     }
	}
}
