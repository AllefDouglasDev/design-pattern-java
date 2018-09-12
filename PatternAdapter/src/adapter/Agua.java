package adapter;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Agua {
	
	private GameController game;
	
	public Agua(GameController game) 
	{
		this.game = game;
	}
	
	public void nadar(String dogImage)
	{
		game.setPlayerImage(dogImage);
	}
}
