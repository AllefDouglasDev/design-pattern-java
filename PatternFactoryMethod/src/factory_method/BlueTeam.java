package factory_method;

/**
 * @author Allef
 *
 */
public class BlueTeam extends Team {
	
	/* Criando time azul com seus 5 jogadores
	 * (non-Javadoc)
	 * @see factory_method.Team#createTeam()
	 */
	@Override
	public void createTeam() {
		System.out.println("\n========================================\n\nTime azul criado");
		
		PlayerFactory pf = new PlayerFactory();
		
		Player players[] = new BluePlayer[5];
		
		for (int i = 0; i < players.length; i++) {
			 players[i] = pf.generatePlayer("BLUE");
			 players[i].createPlayer();
		}
		
		super.setPlayers(players);
		
		System.out.println("Quantidade de jogadores: " + players.length);
	}
}
