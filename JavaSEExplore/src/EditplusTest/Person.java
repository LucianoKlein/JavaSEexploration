package EditplusTest;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Person<________hahaha__________> {
	________hahaha__________ food;
	public void shit() throws Exception{
		________hahaha__________ f = food;
		Class clazz = food.getClass();
		Field m1 = clazz.getDeclaredField("shitType");
		System.out.println("拉了一坨" + m1.get(f));
		
	}
	
	public Person(________hahaha__________ food) {
		this.food = food;
	}
}