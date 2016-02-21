package algorithm;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber_136 {
	public int singleNumber(int[] nums) {
		Set<Integer> numsSet = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (!numsSet.remove(nums[i]))
				numsSet.add(nums[i]);
		}
		return numsSet.iterator().next();
	}
}
