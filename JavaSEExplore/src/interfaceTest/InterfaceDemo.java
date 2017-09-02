/*
 *注意所有的interface里的变量, 都会自动转化成public static final
 *所有的方法, 都会转化成public abstract
 * 注意不可以使用private修饰符
 */
interface IWalkable
{
	void walk();
	String leg = "腿";
}

interface ISwimable
{
	void swim();
}

interface Amphibious extends IWalkable, ISwimable
{
	void walk();
}

