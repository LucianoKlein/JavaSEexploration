package EditplusTest;

import java.util.HashSet;
import java.util.List;

import org.junit.Test;

public class AboutHash {
	@Test
	public void testing() {
		String a = new String("你好");
		String b = new String("你好");
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
	}
	@Test
	public void testing2() {
		Person a = new Person();
		Person b = new Person();
		
		System.out.println(a.equals(b));
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
	}
	class Rice extends Food {
		String shitType = "大坨屎";
	}
	
	class Bread extends Food {
		String shitType = "稀巴烂";
	}
	
	class Food {
		String shitType = "臭的";
	}
	
	class Shit {
		String shitType = "这个傻逼吃屎了";
	}
	@Test
	public void testing3() throws Exception {
		Person<Bread> american = new Person<>(new Bread());
		
		//Person<? extends Food> chinese = new Person<>(new Shit());
		
		Person<?> wildling = new Person(new Shit());
		wildling.shit();
	}
	
	@Test
	public void testing4() throws Exception {
		HashSet<R> hs = new HashSet();
		hs.add(new R(1));
		System.out.println(hs.size());
		hs.remove(new R(1));
		System.out.println(hs.size());
	}
	
	@Test
	public void testing5() {
		HashSet<R> hs = new HashSet();
		
		R temp = new R(1);
		hs.add(temp);
		System.out.println(hs.size());
		
		R temp2 = temp;
		
		hs.remove(temp2);
		System.out.println(hs.size());
	}
	
	@Test
	public void testing6() {
		R temp = new R(1);
		R temp1 = new R(1);
		
		System.out.println(temp == temp1);
	}
}
