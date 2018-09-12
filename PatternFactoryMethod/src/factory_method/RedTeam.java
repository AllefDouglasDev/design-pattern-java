package factory_method;

/**
 * @author Allef
 *
 */
public class RedTeam extends Team {
	
	/* Criando time vermelho com seus 5 jogadores
	 * (non-Javadoc)
	 * @see factory_method.Team#createTeam()
	 */
	@Override
	public void createTeam() {
		System.out.println("\n========================================\n\nTime vermelho criado");
		
		PlayerFactory pf = new PlayerFactory();
		
		Player players[] = new RedPlayer[5];
		
		for (int i = 0; i < players.length; i++) {
			 players[i] = pf.generatePlayer("RED");
			 players[i].createPlayer();
		}
		
		super.setPlayers(players);
		
		System.out.println("Quantidade de jogadores: " + players.length);
	}
}
