package factory_method;

/**
 * @author Allef
 *
 */
public abstract class Team {
	
	protected Player[] players; 
	
	public abstract void createTeam();
	
	protected void setPlayers(Player[] players) 
	{
		this.players = players;
	}
}
