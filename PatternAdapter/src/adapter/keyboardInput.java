package adapter;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;

public class keyboardInput implements KeyListener 
{
	protected int x = 300;
	
	protected int y = 300;
	
	private GameController game;

	public keyboardInput(GameController game)
	{
		this.game = game;
	}
	
	@Override
	public void keyPressed(KeyEvent e)
	{
		int command = e.getKeyCode();
		if (command == KeyEvent.VK_A)
		{
			x -= 10;
		} else if (command == KeyEvent.VK_D)
		{
			x += 10;
		} else if (command == KeyEvent.VK_W)
		{
			y -= 10;
		} else if (command == KeyEvent.VK_S)
		{
			y += 10;
		} else
		{
			return;
		}
		
		game.setPlayerPosition(x, y);
	}
	
	@Override
	public void keyReleased(KeyEvent e)
	{
	}

	@Override
	public void keyTyped(KeyEvent e)
	{
	}
}
