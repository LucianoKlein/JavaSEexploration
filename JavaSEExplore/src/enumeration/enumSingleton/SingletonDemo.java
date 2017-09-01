package enumeration.enumSingleton;

enum Wife {
	Instance;
	public void cook() {
		System.out.println("老公, 我给你做饭");
	}
	public void wash() {
		System.out.println("老公, 我给你洗衣服");
	}
	public void sleep() {
		System.out.println("呵呵呵!");
	}
}

public class SingletonDemo {
	/*
	 * 现在小明娶了一个老婆, 他是一个专一的男子, 他只能有一个老婆.
	 * 老婆可以做饭, 洗衣服, 还可以睡觉
	 * 请注意一定不可以让小明有两个老婆
	 */
	public static void main(String[] args) {
		Wife wifeOfMing = Wife.Instance;
		wifeOfMing.cook();
		wifeOfMing.wash();
		wifeOfMing.sleep();
	}
}
