package data;
import  java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		int n,num,i,j,fat;
		Scanner valores = new Scanner(System.in);
		System.out.print("digite quantos valores serão lidos ");
		n = valores.nextInt();
		for(i=1;i<=n;i++) {
			System.out.print("\n escreva o " + i + " número ");
			num = valores.nextInt();
			fat = 1;
		for(j=1;j<=num;j++) {
			fat = fat * j;
			System.out.print(" fatorial do "+ num+ " = " + fat);
		// TODO Auto-generated method stub

	}

		}
	}
}
