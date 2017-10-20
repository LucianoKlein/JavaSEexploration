package rocky_practise.twosum.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import rockyPractise.twosum.TwoSum;

public class TwoSumImpl implements TwoSum {
	private Map<Integer, Integer> _valFreq;
	
	
	@Override
	public void add(int val) {
		_valFreq.put(val, _valFreq.getOrDefault(val, 0) + 1);
	}


	@Override
	public boolean remove(int val) {
		if (!_valFreq.containsKey(val)) {
			return false;
		}
		_valFreq.put(val, _valFreq.get(val) - 1);
		
		if (_valFreq.get(val) == 0) {
			_valFreq.remove(val);
		}
		return true;
	}


	@Override
	public boolean hasPair(int target) {
		if (_valFreq.containsKey(target - )) {
			return true;
		} else {
			return false;
		}
		
	}


	@Override
	 
	
	public Iterator<Integer> iterator() {
		return _valFreq.keySet().iterator();
	}

	
	public TwoSumImpl() {
		_valFreq = new HashMap<>();
	}
	
	private boolean haskey(int key) {
		if (_valFreq.containsKey(key)) {
			return true;
		}
		return false;
	}
}
