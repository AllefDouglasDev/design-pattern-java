package singleton;

import java.util.Scanner;

public class TestSingletonMenu {
	
	private static Scanner s = new Scanner(System.in);
	private static Scanner str = new Scanner(System.in);

	public static void main(String[] args) {
		boolean menu = true;
		
		int opcao;
		
		do {
			System.out.print("\n########### MENU ###########\n[1] - Cadastrar\n[2] - Listar usuários\n[3] - Sair\n --> ");
			opcao = s.nextInt();
			
			switch(opcao) {
				case 1:
					cadastrar();
					break;
				case 2:
					listar();
					break;
				case 3:
					menu = false;
					System.out.println("\n########### Até mais, e obrigado pelos peixes! ###########\n");
					break;
				default:
					System.out.println("\n########### Opção inválida! ###########");
					break;
			}
		}while(menu);	
	}
	
	public static void cadastrar() {
		System.out.print("Nome:");
		String name = str.nextLine();
		Facebook.getInstance().insertUser(name);
		System.out.println("\n########### Usuário cadastrardo ###########");
	}
	
	public static void listar() {
		System.out.println("\n########### Lista de usuários ###########\n");
		Facebook.getInstance().listUser();
	}

}
