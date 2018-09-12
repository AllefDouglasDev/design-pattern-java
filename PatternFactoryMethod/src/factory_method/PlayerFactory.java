package factory_method;

/**
 * @author Allef
 *
 */
public class PlayerFactory {
	
	/** Gerando um jogador, passando por parametro BLUE (jogador do time azul) 
	 *  e RED (jogador do time vermelho)
	 * @param player
	 */
	public Player generatePlayer(String player) 
	{
		if (player == null || player.isEmpty()) 
		{
			return null;
		}
		
		if (player.toUpperCase().equals("BLUE")) 
		{
			return new BluePlayer();
		} else if (player.toUpperCase().equals("RED")) 
		{
			return new RedPlayer();
		}
		
		return null;
	}
}
