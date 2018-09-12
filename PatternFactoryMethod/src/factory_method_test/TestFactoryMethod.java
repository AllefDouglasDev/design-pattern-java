package factory_method_test;

import java.util.Scanner;

/**
 * @author Allef
 *
 */
public class TestFactoryMethod {
	
	public static void main(String[] args) {
		TeamFactory tf = new TeamFactory();
		Scanner s = new Scanner(System.in);
		String opcao = "";
		do 
		{
			System.out.print("\nEscreva blue para criar um time azul ou red para criar um time vermelho\nEscreva 0 para sair.\n --> ");
			opcao = s.nextLine();
			if (!opcao.equals("0") && opcao != null && !opcao.isEmpty()) 
			{
				Team t = tf.generateTeam(opcao);
				t.createTeam();
			}
		} while (!opcao.equals("0"));
		
		System.out.println("Sistema finalizado");
		
		/*Team blue = tf.generateTeam("BLUE");
		blue.createTeam();
		
		Team red = tf.generateTeam("RED");
		red.createTeam();*/
	}
}
