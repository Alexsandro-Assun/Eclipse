package POO;

import java.util.Scanner;

public class Senha {
	
	public static void main (String []args) {
	
		
		int senha,chave;
		Scanner ler = new Scanner(System.in);
		
		senha = 50588669;
		System.out.println("Entre com a chave de acesso: ");
		chave = ler.nextInt();
		
		if(chave!=senha) {
			while(chave!=senha) {
		
			System.out.println("Acesso negado");
			System.out.println("Entre com a chave de acesso: ");
			chave = ler.nextInt();
			}
			if (chave == senha) {
				System.out.println("Acesso permitido");
			}
		} else  {
			System.out.println("Acesso permitido");
		}
		System.out.println("Bem Vindo");
	
	}
	
}
