package factory_method_test;

/**
 * @author Allef
 *
 */
public class BluePlayer extends Player{
	
	/* Criando um jogador do time azul
	 * (non-Javadoc)
	 * @see factory_method.Player#createPlayer()
	 */
	@Override
	public void createPlayer() {
		System.out.println("Aqui foi criado um jogador do time azul");
	}
}
