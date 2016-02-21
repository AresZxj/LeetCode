package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Subsets_78 {
	private List<List<Integer>> ret = new ArrayList<>();
	
//	private List<List<Integer>> getSubset(List<Integer> nums) {
//		List<List<Integer>> ret =new ArrayList<>();
//		if(nums.isEmpty()) {
//			return ret;
//		}
//		ret.add(nums);
//		for(Integer num : nums) {
//			List<Integer> newList = new ArrayList<>();
//			newList.addAll(nums);
//			newList.remove(num);
//			ret.addAll(getSubset(newList));
//		}
//		return ret;
//	}

//	public List<List<Integer>> subsets(int[] nums) {
//		List<Integer> numsList = new ArrayList<>();
//		for(int num : nums) {
//			numsList.add(num);
//		}
//		return getSubset(numsList);
//	}
	
	public List<List<Integer>> subsets(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> ret = new ArrayList<>();
		int start = 0;
		int end = (1 << nums.length) -1;
		int mark = 0;
		for (mark = start; mark <= end; mark++)  
	    {  
			List<Integer> temp = new ArrayList<>();
	        for (int i = 0; i < nums.length; i++)  
	        {  
	            if (((1<<i)&mark) != 0) //该位有元素输出  
	            {   
	            	temp.add(nums[i]);
	            }  
	        } 
	        ret.add(temp);
	    }  
		return ret;
	}
	
	public static void main(String[] args) {
		Subsets_78 solution = new Subsets_78();
		int[] nums = {1,2,3};
		System.out.println(solution.subsets(nums));
	}
}
