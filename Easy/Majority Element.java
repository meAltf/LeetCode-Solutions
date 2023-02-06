/******************************************************************************************************************************************************
---------------------
QUESTION N0- 169
---------------------

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

---------------------------------------------------------------------------------------

Example 1:

Input: nums = [3,2,3]
Output: 3

Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

---------------
Aprroach-01
-----------------
  
  class Solution {
    public int majorityElement(int[] nums) {
        
        Arrays.sort(nums);
        return nums[(nums.length-1)/2];

    }
}

---------------------
  Approach-2
---------------------
  
  class Solution {
    public int majorityElement(int[] nums){

        int num = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            if(map.containsKey(nums[i])){

              map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        Set<Integer> keySet = map.keySet();
        
        for(Integer key:keySet){
            if(map.get(key)>nums.length/2){
                num = key;
            }
        }
        return num;
    }
}
