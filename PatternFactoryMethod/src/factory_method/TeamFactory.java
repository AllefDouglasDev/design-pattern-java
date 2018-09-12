package factory_method;

/**
 * @author Allef
 *
 */
public class TeamFactory {
	
	/** Gerando um time, passando por parametro BLUE (time azul) 
	 *  e RED (time vermelho)
	 * @param team
	 */
	public Team generateTeam(String team) 
	{
		if (team == null || team.isEmpty()) 
		{
			return null;
		}
		
		if (team.toUpperCase().equals("BLUE")) 
		{
			return new BlueTeam();
		} else if(team.toUpperCase().equals("RED")) 
		{
			return new RedTeam();
		}
		
		return null;
	}
	
}
