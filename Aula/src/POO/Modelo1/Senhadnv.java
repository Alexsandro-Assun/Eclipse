package POO.Modelo1;

import java.util.Scanner;

public class Senhadnv {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("Senha");
		String senha = (ler.nextLine());
		System.out.println("Dnv");
		String senhadnv = (ler.nextLine());

		if (senhadnv.equals(senha)) {
			System.out.println("Sucesso");
		} else {
			System.out.println("Senha não combina, tente de novo");
			senhadnv = ler.nextLine();
		}while (senhadnv!=senha)
		System.out.println("Bem Vindo");
	}

}
