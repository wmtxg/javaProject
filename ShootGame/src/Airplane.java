import java.util.Random;


public class Airplane extends FlyingObject implements Enemy
{
	//�л����˶��ٶ�
	private int speed = 2;
	
	/**
	 * �л��Ĺ��������ڻ�ȡ�л���ͼƬ��ͼƬ���ԣ���ʹ�л��������
	 */
	public Airplane()
	{
		//��ȡ�л�ͼƬ
		image = ShootGame.airplane;
		//�л�ͼƬ��
		width = image.getWidth();
		//�л�ͼƬ��
		height = image.getHeight();
		Random random = new Random();
		//�л�������ֵ�x����
		x = random.nextInt(ShootGame.WIDTH - width);
		//�л����ֵ�y����
		y = -height;
	}
	
	/**
	 * �÷��������жϵл��Ƿ����
	 */
	public boolean outOfBounds()
	{
		//���л�y���굽��߿�ײ�ʱ����
		return y > ShootGame.HEIGHT;	
	}
	
	/**
	 * �л��˶��ķ���
	 */
	public void step()
	{
		y += speed;
	}
	
	/**
	 * �÷������ڷ����ӵ����ел��ĵ÷�
	 */
	public int getScore()
	{
		return 5;
	}
}
