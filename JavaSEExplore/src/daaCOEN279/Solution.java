package daaCOEN279;

public class Solution {
	public int countInversion(int[] nums) {
		int length = nums.length;
		return divide(nums, 0, length - 1);
	}
	
	public int divide(int[] nums, int start, int end) {
		if (start == end) {
			return 0;
		}
		
		if (start + 1 == end && nums[start] > nums[end]) {
			return 1;
		}
		int middle = (start + end) / 2;
		int left = divide(nums, start, middle);
		int right = divide(nums, middle + 1, end);
		
		return left + right + conquer(nums, start, end);
	}
	
	public int conquer(int[] nums, int start, int end) {
		int middle = (start + end) / 2;
		int count = 0;
		for (int i = start; i <= middle; i++) {
			for (int j = middle + 1; j <= end; j++) {
				if (nums[i] > nums[j]) {
					count++;
				}
			}
		}
		return count;
	}
}
