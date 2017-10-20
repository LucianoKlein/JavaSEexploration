package rocky_practise.twosum;

import rocky_practise.twosum.impl.TwoSumImpl;

public class UnitTester {
	public void testing() {
		TwoSum ts = new TwoSumImpl();
		
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(4);
		ts.add(5);
		
		ts.hasPair(3);
		
	}
}
