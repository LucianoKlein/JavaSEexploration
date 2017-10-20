package rocky_practise.explaining;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Solution {
	public static void main(String[] args) {
		Candidate s1 = new Candidate("特朗普", 60);
		Candidate s2 = new Candidate("希拉里", 60);
		// 统计票数的Map
		Map<Candidate, Integer> box1 = new HashMap<>();
		box1.put(s1, 306);
		box1.put(s2, 232);
		// 打印一下集合里的元素个数
		System.out.println(box1.size());

		SortedMap<Candidate, Integer> box2 = new TreeMap<>((o1, o2) -> o1._age - o2._age);
		box2.put(s1, 306);
		box2.put(s2, 232);
		System.out.println(box2.size());
		
	}
}