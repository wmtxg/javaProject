import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ShootGame extends JPanel
{
	public static final int WIDTH = 400;
	public static final int HEIGHT = 654;
	
	private int state;
	private static final int START = 0;
	private static final int RUNNING = 1;
	private static final int PAUSE = 2;
	private static final int GAME_OVER = 3;
	
	
	private int interval = 1000 / 100;
	private int score;
	
	public static BufferedImage background;
	public static BufferedImage start;
	public static BufferedImage gameover;
	public static BufferedImage pause;
	public static BufferedImage airplane;
	public static BufferedImage bee;
	public static BufferedImage bullet;
	public static BufferedImage hero0;
	public static BufferedImage hero1;
	
	public Hero hero = new Hero();
	public Bullet[] bullets = {};
	public FlyingObject[] flyings = {};
	
	static
	{
		try {
			background = 
				ImageIO.read(ShootGame.class.getResource("background.png"));
			start = 
				ImageIO.read(ShootGame.class.getResource("start.png"));
			gameover = 
				ImageIO.read(ShootGame.class.getResource("gameover.png"));
			pause = 
				ImageIO.read(ShootGame.class.getResource("pause.png"));
			airplane = 
				ImageIO.read(ShootGame.class.getResource("airplane.png"));
			bee = 
				ImageIO.read(ShootGame.class.getResource("bee.png"));
			bullet = 
				ImageIO.read(ShootGame.class.getResource("bullet.png"));
			hero0 = 
				ImageIO.read(ShootGame.class.getResource("hero0.png"));
			hero1 = 
				ImageIO.read(ShootGame.class.getResource("hero1.png"));
			} 
		catch (Exception e) 
			{
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
	
	public void paint(Graphics g)
	{
		g.drawImage(background, 0, 0, null);
		paintState(g);
		drawHero(g);
		drawBullet(g);
		drawFlyingObject(g);
		paintScore(g);
	}
	
	public void drawHero(Graphics g)
	{
		g.drawImage(hero.getImage(),hero.getX(), hero.getY(), null);
	}
	
	public void drawBullet(Graphics g)
	{
		for(int i=0; i<bullets.length; i++)
		{
			Bullet b = bullets[i];
			g.drawImage(b.getImage(),b.getX(), b.getY(), null);
		}
	}
	
	public void drawFlyingObject(Graphics g)
	{
		for(int i=0; i<flyings.length; i++)
		{
			FlyingObject f = flyings[i];
			g.drawImage(f.getImage(),f.getX(), f.getY(), null);
		}
	}
	
	public void paintScore(Graphics g)
	{
		int x = 10;
		int y = 25;
		Font font = new Font(Font.SANS_SERIF, Font.BOLD, 14);
		g.setColor(new Color(0xFF0080));
		g.setFont(font);
		g.drawString("SCORE:"+score, x, y);
		y += 20;
		g.drawString("LIFE:"+hero.getLife(), x, y);
		y += 20;
		g.drawString("DOUBLEFIRE:"+hero.getDoubleFire(), x, y);
	}
	
	public void paintState(Graphics g)
	{
		switch(state)
		{
		case START:
			g.drawImage(start, 0, 0, null);
			break;
		case PAUSE:
			g.drawImage(pause, 0, 0, null);
			break;
		case GAME_OVER:
			
			g.drawImage(gameover, 0, 0, null);
			
			break;
		}
	}
	
	public static void main(String[] args)
	{
		ShootGame game = new ShootGame();
		JFrame frame = new JFrame("Fly");
		frame.add(game);
		
		frame.setSize(WIDTH, HEIGHT);
		frame.setAlwaysOnTop(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		game.action();
		
	}
	
	public void action()
	{
		MouseAdapter l = new MouseAdapter()
		{
			public void mouseMoved(MouseEvent e)
			{
				if(state == RUNNING)
				{
					int x = e.getX();
					int y = e.getY();
					hero.moveTo(x, y);
				}
			}
		
			public void mouseClicked(MouseEvent e)
			{
				switch(state)
				{
				case START:
					state = RUNNING;
					break;
				case GAME_OVER:
					flyings = new FlyingObject[0];
					bullets = new Bullet[0];
					hero = new Hero();
					score = 0;
					state = START;
					break;
				}
			}
			
			public void mouseEntered(MouseEvent e)
			{
				if(state == PAUSE)
					state = RUNNING;
			}
			
			public void mouseExited(MouseEvent e)
			{
				if(state != GAME_OVER)
					state = PAUSE;
			}
			
		};
		this.addMouseListener(l);
		this.addMouseMotionListener(l);
		
		Timer timer = new Timer();
		timer.schedule(new TimerTask()
		{
			public void run()
			{
				if(state == RUNNING)
				{
					enterAction();
					stepAction();
					shootAction();
					bangAcyion();
					outOfBoundsAction();
					checkGameOverAction();
				}
				repaint();
			}
		}, interval, interval);
		
	}
	
	int flyingindex = 0;
	public void enterAction()
	{
		
		flyingindex ++;
		if(flyingindex % 40 == 0)
		{
			FlyingObject obj = nextOne();
			flyings = Arrays.copyOf(flyings, flyings.length + 1);
			flyings[flyings.length-1] = obj;
		}
	}
	
	public FlyingObject nextOne()
	{
		Random rand = new Random();
		int type = rand.nextInt(5);
		if(type == 0)
		{
			return new Bee();
		}
		else
		{
			return new Airplane();
		}
		
	}
	
	public void stepAction()
	{
		for(int i=0; i<flyings.length; i++)
		{
			FlyingObject obj = flyings[i];
			obj.step();
		}
		
		for(int i=0; i<bullets.length; i++)
		{
			FlyingObject b = bullets[i];
			b.step();
		}
	}
	
	int shootindex = 0;
	public void shootAction()
	{
		shootindex ++;
		if(shootindex % 30 == 0)
		{
			Bullet[] bs = hero.shoot();
			bullets = Arrays.copyOf(bullets, bullets.length + bs.length);
			System.arraycopy(bs, 0, bullets, bullets.length - bs.length, bs.length);
		}
		
	}
	
	public void bangAcyion()
	{
		for(int i=0; i<bullets.length; i++)
		{
			Bullet b = bullets[i];
			bang(b);
		}
	}
	
	public void bang(Bullet b)
	{
		int index = -1;
		for(int i=0; i<flyings.length; i++)
		{
			FlyingObject obj = flyings[i];
			if(obj.shootBy(b))
			{
				index = i;
				break;
			}
		}
		
		if(index != -1)
		{
			FlyingObject one = flyings[index];
			FlyingObject temp = flyings[index];
			flyings[index] = flyings[flyings.length - 1];
			flyings[flyings.length - 1] = temp;
			flyings = Arrays.copyOf(flyings, flyings.length - 1);
			
			if(one instanceof Enemy)
			{
				Enemy e = (Enemy) one;
				score += e.getScore();
			}
			if(one instanceof Award)
			{
				Award a = (Award) one;
				int awardType = a.getType();
				switch(awardType)
				{
				case Award.DOUBLE_FIFE:
					hero.addDoubleFire();
					break;
				case Award.LIFE:
					hero.addLife();
					break;	
				}
			}
		}
	}
	
	public void outOfBoundsAction()
	{
		int index = 0;
		FlyingObject[] flyingsLives = new FlyingObject[flyings.length];
		for(int i=0; i<flyings.length; i++)
		{
			FlyingObject f = flyings[i];
			if(!f.outOfBounds())
			{
				flyingsLives[index++] = f;
			}
		}
		flyingsLives = Arrays.copyOf(flyingsLives, index);
		
		index = 0;
		Bullet[] bulletsLives = new Bullet[bullets.length];
		for(int i=0; i<bullets.length; i++)
		{
			Bullet b = bullets[i];
			if(!b.outOfBounds())
			{
				bulletsLives[index++] = b;
			}
		}
		bulletsLives = Arrays.copyOf(bulletsLives, index);
	}
	
	public void checkGameOverAction()
	{
		if(isGameOver())
			state = GAME_OVER;
	}
	
	public boolean isGameOver()
	{
		for(int i=0; i<flyings.length; i++)
		{
			int index = -1;
			FlyingObject obj = flyings[i];
			if(hero.hit(obj))
			{
				hero.loseLife();
				hero.setDoubleFire(0);
				index = i;
			}
			
			if(index != -1)
			{
				FlyingObject t = flyings[index];
				flyings[index] = flyings[flyings.length - 1];
				flyings[flyings.length - 1] = t;
				flyings = Arrays.copyOf(flyings, flyings.length - 1);
			}
		}
		return hero.getLife()<=0;
	}
}
