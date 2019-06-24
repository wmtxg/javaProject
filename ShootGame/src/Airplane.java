import java.util.Random;


public class Airplane extends FlyingObject implements Enemy
{
	//敌机的运动速度
	private int speed = 2;
	
	/**
	 * 敌机的构造器用于获取敌机的图片及图片属性，并使敌机随机产生
	 */
	public Airplane()
	{
		//获取敌机图片
		image = ShootGame.airplane;
		//敌机图片宽
		width = image.getWidth();
		//敌机图片高
		height = image.getHeight();
		Random random = new Random();
		//敌机随机出现的x坐标
		x = random.nextInt(ShootGame.WIDTH - width);
		//敌机出现的y坐标
		y = -height;
	}
	
	/**
	 * 该方法用于判断敌机是否出界
	 */
	public boolean outOfBounds()
	{
		//当敌机y坐标到达边框底部时出界
		return y > ShootGame.HEIGHT;	
	}
	
	/**
	 * 敌机运动的方法
	 */
	public void step()
	{
		y += speed;
	}
	
	/**
	 * 该方法用于返回子弹击中敌机的得分
	 */
	public int getScore()
	{
		return 5;
	}
}
