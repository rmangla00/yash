package com.yash.AssignmentCore4;

public class IndicesOfTwoNumbers {

	public int[] getArrayOfIndices(int[] nums, int targetSum) {

		int[] result = null;

		for (int i = 0; i < nums.length; i++) {
			if (result == null) {
				for (int j = i; j < nums.length; j++) {
					if (nums[i] + nums[j] == targetSum) {
						result = new int[2];
						result[0] = i;
						result[1] = j;
						break;
					}
				}
			} else {
				break;
			}
		}
		return result;
	}

}
