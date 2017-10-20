package rocky_practise.threesum.impl;

import java.util.Iterator;

import rocky_practise.threesum.ThreeSum;
import rocky_practise.twosum.TwoSum;
import rocky_practise.twosum.impl.TwoSumImpl;

public class ThreeSumImpl implements ThreeSum {
	private TwoSum _twoSum;
	
	public ThreeSumImpl() {
		_twoSum = new TwoSumImpl();
	}
	
	@Override
	public void add(int val) {
		_twoSum.add(val);
	}

	@Override
	public boolean hasTri(int target) {
		Iterator<Integer> it = _twoSum.iterator();
		while (it.hasNext()) {
			
		}
		
		
		
		return false;
	}
	
}
