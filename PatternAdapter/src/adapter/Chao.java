package adapter;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Chao {
	
	private String dogImage;
	private GameController game;
	
	public Chao(GameController game) 
	{
		this.game = game;
		setDogImage("img/dog_walking.gif");
		this.game.setPlayerImage(dogImage);
	}
	
	public void animar() 
	{
		game.addKeyListener(new keyboardInput(game));
	}
	
	public void setDogImage(String dogImage) 
	{
		this.dogImage = dogImage;
	}
}
