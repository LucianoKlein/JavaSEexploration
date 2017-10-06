package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.junit.Test;
import org.omg.Messaging.SyncScopeHelper;

class GrandSon extends Son {
	
}
class Son extends Father {
	String name;
}
class Father {
	String name;
}

class SonConsumer<T> implements Consumer<T> {

	@Override
	public void accept(T t) {
		System.out.println("hahaa");
		
	}
	
}

public class Solution {
	
	@Test
	public void testing() {
		List strList = new ArrayList();
		strList.add("01");
		strList.add("02");
		
		//strList.add(3);
		strList.forEach(new Consumer<String>() {

			@Override
			public void accept(String str) {
				// TODO Auto-generated method stub
				System.out.println(str);
			}
		});
		
		
		strList.forEach(str -> System.out.println(((String)str).length()));
	}
	
	
}
