package daaCOEN279;

public class Solution2 {
	public int countInversion(int[] nums) {
		int len = nums.length;
		int[] temp = new int[len];
		return divide(nums, 0, len - 1, temp);
		
	}
	
	public int divide(int[] nums, int start, int end, int[] temp) {
		if (start >= end) {
			return 0;
		}
		
		int middle = start + ((end - start) >> 1);
		int left = divide(nums, start, middle, temp);
		int right = divide(nums, middle + 1, end, temp);
		return left + right + merge(nums, start, end, temp);
	}
	
	public int merge(int[] nums, int start, int end, int[] temp) {
		int middle = start + ((end - start) >> 1);
		int count = 0;
		int leftIndex = start;
		int rightIndex = middle + 1;
		int index = leftIndex;
		while (leftIndex <= middle && rightIndex <= end) {
			if (nums[leftIndex] > nums[rightIndex]) {
				count += middle - leftIndex + 1;
				temp[index++] = nums[rightIndex++];
			} else {
				temp[index++] = nums[leftIndex++];
			}
		}
		while (leftIndex <= middle) {
			temp[index++] = nums[leftIndex++];
		}
		while (rightIndex <= end ) {
			temp[index++] = nums[rightIndex++];
		}
		for (int i = start; i <= end; i++) {
			nums[i] = temp[i];
		}
		return count;
	}
}
