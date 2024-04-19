//Leetcode Ques. 01 : Two Sum
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
public class TwoSums {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] ans = new int[2];
                if (nums.length <= Math.pow(10,4) && nums.length >= 2 && target<=Math.pow(10,9) && target >= Math.pow(-10,9)){
                    for (int i = 0; i < nums.length; i++){
                        if (nums[i]<=Math.pow(10,9) && nums[i] >= Math.pow(-10,9)) {
                            for (int j = i + 1; j < nums.length; j++) {
                                int add = nums[i] + nums[j];
                                if (add == target) {
                                    ans[0] = i;
                                    ans[1] = j;
                                }
                            }
                        }
                    }
                }
            return ans;
        }
    }
}
