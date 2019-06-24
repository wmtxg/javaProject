
public class Bullet extends FlyingObject
{
	//�ӵ����˶��ٶ�
	private int speed = 3;
	
	
	/**
	 * �÷���������ʾ�ӵ���λ��
	 * @param x  x����
	 * @param y  y����
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
	 * �ӵ��˶��ķ���
	 */
	public void step()
	{
		y -= speed;
	}
	
	/**
	 * �ж��ӵ��Ƿ����ķ���
	 */
	public boolean outOfBounds()
	{
		return y <0;
	}
}
