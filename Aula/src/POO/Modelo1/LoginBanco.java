package POO.Modelo1;

import java.util.Scanner;

public class LoginBanco {

	private String username;
	private String password;
	private String nome;
	
	Scanner leia = new Scanner(System.in);
	
	public LoginBanco(){}
	
	public void CadastrarUsuario() {
		
		System.out.println("Entre com seu nome:");
		System.out.print("\nDIGITE:");
		String nomereal=(leia.nextLine());	
		System.out.println("Entre com um nome de usuário:");
		System.out.print("\nDIGITE:");
		String nomeusuario=(leia.nextLine());
		String senha; int x=1; 
		do { 
		System.out.println("Entre com uma senha:");
		System.out.print("\nDIGITE:");
		senha=(leia.nextLine());
		System.out.println("Confirme sua senha:");
		System.out.print("\nDIGITE:");
		String senhaconf=(leia.nextLine());
		if (senhaconf.equals(senha)) {
			System.out.println("Cadastro realizado com sucesso!");
			x=0;}
		else {
			System.out.println("Senhas não conferem! Tente novamente!");
		}}while(x!=0);
		username=nomeusuario;
		password=senha;
		nome=nomereal;
		
	}
	
	public void Logar() {
		
		String nomeusuario; String senha;
		System.out.println("Olá, bem-vindo de volta!");int x=0;
		do{System.out.println("Entre com seu nome de usuário:");
		System.out.print("\nDIGITE:");
		nomeusuario = leia.nextLine();
		System.out.println("Entre com sua senha:");
		System.out.print("\nDIGITE:");
		senha = leia.nextLine();
		if (nomeusuario.equals(username) && senha.equals(password)) {
			System.out.println("Login efetuado com sucesso");
			x=1;}
		else { System.out.println("Usuário ou senha incorreta, confira e tente novamente!");}}while(x!=1);
		
		
	}

	
	public void RecuperarSenha() {
		System.out.println("Insira seu nome de usuário para recuperar sua senha:");
		System.out.print("\nDIGITE:");
		String nomeusuario = leia.nextLine();
		if(nomeusuario.equals(username)) {
			System.out.println("Sua senha:"+getPassword());
		}
		else {
			System.out.println("Usuário não encontrado!");
		}
	}

	public void RecuperarNomeusuario() {
		
		System.out.println("Entre com seu nome de cadastro(nome completo):");
		System.out.print("\nDIGITE:");
		String nomereal = leia.nextLine();
		System.out.println("Entre com sua senha:");
		System.out.print("\nDIGITE:");
		String senha = leia.nextLine();
		if(nomereal.equals(nome)&&senha.equals(password)) {
			System.out.println("Seu nome de usuário:"+getUsername());
		}
		else {
			System.out.println("Usuário não cadastrado!");
		}
		
	}
	
	public void AlterarSenha() {
		
		System.out.println("Entre com seu nome de cadastro(nome completo)");
		System.out.print("\nDIGITE:");
		String nomereal = leia.nextLine();
		System.out.println("Entre com seu nome de usuário:");
		System.out.print("\nDIGITE:");
		String nomeusuario = leia.nextLine();
		if(nomereal.equals(nome)&&nomeusuario.equals(username)) {
			
			String senha; int x=1; 
			do { 
			System.out.println("Entre com a nova senha:");
			System.out.print("\nDIGITE:");
			senha=(leia.nextLine());
			System.out.println("Confirme a nova senha:");
			System.out.print("\nDIGITE:");
			String senhaconf=(leia.nextLine());
			if (senhaconf.equals(senha)) {
				setPassword(senha);
				System.out.println("Senha alterada com sucesso!");
				x=0;}
			else {
				System.out.println("Senhas não conferem! Tente novamente!");
			}}while(x!=0);
			
			}
		else {
			System.out.println("Usuário não encontrado!");
		}
		
		
	}
		
	public void AlterarNomeusuario() {
		
		System.out.println("Entre com seu nome de cadastro(nome completo):");
		System.out.print("\nDIGITE:");
		String nomereal = leia.nextLine();
		System.out.println("Entre com sua senha:");
		System.out.print("\nDIGITE:");
		String senha = leia.nextLine();
		if(nomereal.equals(nome)&&senha.equals(password)) {
			
			System.out.println("Entre com o novo nome de usuário:");
			System.out.print("\nDIGITE:");
			String novonome = leia.nextLine();
			setUsername(novonome);}
		
		else {System.out.println("Usuário não cadastrado!");}
	}
	
	public String getUsername() {
		return username;
	}

	
	public void setUsername(String username) {
		this.username = username;
	}

	
	public void setPassword(String password) {
		this.password = password;
	}

	
	public String getPassword() {
		return password;
	}
	


}
