package rocky_practise.twosum;

import java.util.Iterator;

public interface TwoSum extends Iterable<Integer>{
	public void add(int val);
	public boolean remove(int val);
	public boolean hasPair(int target);
	public Iterator<Integer> iterator();
}
