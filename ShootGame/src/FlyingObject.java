import java.awt.image.BufferedImage;


public abstract class FlyingObject
{
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected BufferedImage image;
	
	public void setX(int x)
	{
		this.x = x;
	}

	public int getX()
	{
		return x;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}

	public int getY()
	{
		return y;
	}
	
	public void setWidth(int width)
	{
		this.width = width;
	}

	public int getWidth()
	{
		return width;
	}
	
	public void setHeight(int height)
	{
		this.height = height;
	}

	public int getHeight()
	{
		return height;
	}
	
	public void setImage(BufferedImage image)
	{
		this.image = image;
	}

	public BufferedImage getImage()
	{
		return image;
	}
	
	public abstract void step();
	
	public abstract boolean outOfBounds();
	
	public boolean shootBy(Bullet bullet)
	{
		int x = bullet.x;
		int y = bullet.y;
		return (this.x - bullet.width) < x && x < (this.x + this.width) &&
		       this.y < y && y < (this.y + this.height) ;
	}

}
