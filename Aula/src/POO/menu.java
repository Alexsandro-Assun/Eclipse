package POO;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		String tel,cpf,nome,empresa,sexo,endereco;
		int renda,idade,op;
		
		//menu de cadastros: 1-novo cliente 2-cadastros 3-sair
		do {
		System.out.println();
		System.out.println("   Menu de Cadastros\n");
		System.out.println("=======================");
		System.out.println("|  Escolha uma opção: |");
		System.out.println("|  1) Novo Cliente    |");
		System.out.println("|  2) Cadastros       |");
		System.out.println("|  3) Sair            |");
		System.out.println("=======================");
		op = ler.nextInt();
		
		//do {
		switch(op)
		{
			case 1 :
			{
			System.out.println("Novo Cliente\n");
			System.out.println("Por favor, insira seus dados: \n");
			System.out.println("Nome Completo(sem acentuação): ");
			nome = ler.next();
			System.out.println("Idade: ");
			idade = ler.nextInt();
			System.out.println("CPF: ");
			cpf = ler.next();
			System.out.println("Telefone: ");
			tel = ler.next();
			break;
			}
			case 2 :
			{	
			System.out.println("Cadastros");
			break;
			}
			case 3 :
			{
			System.out.println("Sair");
			break;
			}
			default :
			{
			System.out.println("   Opção inválida");
			break;
			}
		}
	
		
		}while(op!=3);
	}

}
