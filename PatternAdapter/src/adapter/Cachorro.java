package adapter;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Cachorro {
		
	private GameController game;
	
	public Cachorro(GameController game) 
	{
		this.game = game;
	}
	
	public void mover() 
	{
		/** Cachorro andando */
		//Chao dogWalking = new Chao(game);
		//dogWalking.animar();
		
		/** Cachorro nadando */
		AguaAdapter dogSwimming = new AguaAdapter(game);
		dogSwimming.animar();
	}
	
}
