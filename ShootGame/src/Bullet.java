
public class Bullet extends FlyingObject
{
	//子弹的运动速度
	private int speed = 3;
	
	
	/**
	 * 该方法用于显示子弹的位置
	 * @param x  x坐标
	 * @param y  y坐标
	 */
	public Bullet(int x, int y)
	{
		image = ShootGame.bullet;
		width = image.getWidth();
		height = image.getHeight();
		this.x = x - 4;
		this.y = y;
	}
	
	/**
	 * 子弹运动的方法
	 */
	public void step()
	{
		y -= speed;
	}
	
	/**
	 * 判断子弹是否出界的方法
	 */
	public boolean outOfBounds()
	{
		return y <0;
	}
}
