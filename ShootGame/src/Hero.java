import java.awt.image.BufferedImage;


public class Hero extends FlyingObject
{
	private int doubleFire = 0;
	private int life = 3;
	protected BufferedImage[] images = {};
	protected int index = 0;
	
	public Hero()
	{
		image = ShootGame.hero0;
		images = new BufferedImage[]{ShootGame.hero0,ShootGame.hero1};
		width = image.getWidth();
		height = image.getHeight();
		x = 150;
		y = 400;
	}
	
	public void addLife()
	{
		life += 1;
	}
	
	public void loseLife()
	{
		life -= 1;
	}
	
	public int getLife()
	{
		return life;
	}
	
	public void addDoubleFire()
	{
		doubleFire += 40;
	}
	
	public void setDoubleFire(int doubleFire)
	{
		this.doubleFire = doubleFire;
	}
	
	public int getDoubleFire()
	{
		return doubleFire;
	}
	
	public Bullet[] shoot()
	{
		int xStep = width / 4;
		int yStep = this.y-40;
		if(doubleFire > 100)
		{
			Bullet[] bullets = new Bullet[4];
			bullets[0] = new Bullet(x , yStep);
			bullets[1] = new Bullet(x + 1*xStep, yStep);
			bullets[2] = new Bullet(x + 2*xStep, yStep);
			bullets[3] = new Bullet(x + 3*xStep, yStep);
			doubleFire -= 4;
			return bullets;
		}
		else if(doubleFire > 0)
		{
			Bullet[] bullets = new Bullet[2];
			bullets[0] = new Bullet(x + xStep, yStep);
			bullets[1] = new Bullet(x + 3*xStep, yStep);
			doubleFire -= 2;
			return bullets;
		}
		else
		{
			Bullet[] bullets = new Bullet[1];
			bullets[0] = new Bullet(x + 2*xStep, yStep);
			return bullets;
		}
	}
	
	public void moveTo(int x, int y)
	{
		this.x = x - width / 2;
		this.y = y - height / 2;
	}
	
	public boolean hit(FlyingObject other)
	{
		int x1 = other.x - this.width / 2;
		int x2 = other.x + other.width + this.width / 2;
		int y1 = other.y - this.height / 2;
		int y2 = other.y + other.height + this.height / 2;
		
		int X = this.x + this.width / 2;
		int Y = this.y + this.height / 2;
		
		return x1 < X && X < x2 && y1 < Y && Y < y2 ;
		
	}	
	 
	public void step()
	{
		if(images.length > 0)
		{
			int num = index++ / 10 % images.length;
			image = images[num];
		}	
	}
	
	public boolean outOfBounds()
	{
		return false;
	}
}
