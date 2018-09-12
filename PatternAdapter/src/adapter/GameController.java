package adapter;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;

import org.omg.CORBA.Context;

public class GameController extends JFrame
{
	private BufferedImage dogImage;
	
	private String imgName;
	
	private Point playerPosition;

	public GameController()
	{
		
		playerPosition = new Point(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(new Dimension(600, 600));
		setTitle("Adapter Pattern - Dog Game");
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
	}
	
	public void setPlayerPosition(int x, int y)
	{
		playerPosition.x = x;
		playerPosition.y = y;
		update(getGraphics());
	}

	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawImage(dogImage, playerPosition.x, playerPosition.y, 100, 100, this);
	}
	
	public void setPlayerImage(String imgName) 
	{
		this.imgName = imgName;
	}
	
	public void onLive() 
	{
		loadImage();
		setVisible(true);
		update(getGraphics());
	}
	
	private void loadImage() 
	{
		try {
			// carrega uma imagem da pasta 'img' usado o nome da imagem vinda do parametro
			dogImage = ImageIO.read(getClass().getClassLoader().getResourceAsStream(imgName));
		} catch (Exception e) {
			System.out.println("imagem não carregou");
		}
	}
}

