package factory_method;

/**
 * @author Allef
 *
 */
public class TestFactoryMethod 
{	
	public static void main(String[] args) {
		TeamFactory tf = new TeamFactory();
		
		Team blue = tf.generateTeam("BLUE");
		blue.createTeam();
		
		Team red = tf.generateTeam("RED");
		red.createTeam();
	}
}
