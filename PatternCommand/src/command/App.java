package command;

public class App 
{
	public static void main(String[] args) 
	{
		Tela tela = new Tela();
		
		Ferramenta ferramenta = new Ferramenta(3);
		
		ferramenta.setComando(0, new UsarLapis(tela), new PararLapis(tela));
		
		ferramenta.setComando(1, new UsarSpray(tela), new PararSpray(tela));
		
		ferramenta.setComando(2, new UsarBorracha(tela), new PararBorracha(tela));
		
		System.out.println("Utilizando ferramentas\n");
		
		/** Usando lapis */
		ferramenta.apertarTecla(0);
		ferramenta.soltarTecla(0);
		
		/** Usando spray */
		ferramenta.apertarTecla(1);
		ferramenta.soltarTecla(1);
		
		/** Usando borracha */
		ferramenta.apertarTecla(2);
		ferramenta.soltarTecla(2);
	}
}
