package daaCOEN279;

import org.junit.Test;

public class Demo {
	@Test
	public void testing() {
		Solution2 s = new Solution2();
		int[] nums = {5, 4, 3, 2, 1};
		int res = s.countInversion(nums);
		System.out.println(res);
	}
}
