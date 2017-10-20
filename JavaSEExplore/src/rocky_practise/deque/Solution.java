package rocky_practise.deque;

import java.util.Deque;
import java.util.LinkedList;

import org.junit.Test;

public class Solution {
	@Test
	public void test() {
		Integer i = 100;
		Deque<Object> q = new LinkedList<>();
		q.add(i);
		System.out.println(q.pop());
	}
}
