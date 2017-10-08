/*
 *ע�����е�interface��ı���, �����Զ�ת����public static final
 *���еķ���, ����ת����public abstract
 * ע�ⲻ����ʹ��private���η�
 */
interface IWalkable
{
	void walk();
	String leg = "��";//fgfggffgfgfg
}

interface ISwimable
{
	void swim();
}

interface Amphibious extends IWalkable, ISwimable
{
	void walk();
}

