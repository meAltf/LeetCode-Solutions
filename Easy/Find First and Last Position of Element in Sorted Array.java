/******************************************************************************************************************************************************
----------------------------
QUESTION NO-34
----------------------------
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

---------------------------------------------------------------------------------------

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] output=new int[2];

        output[0]=firstOcc(nums,target);
        output[1]=lastOcc(nums,target);
        return output;
    }

    public int firstOcc(int[] arr,int target){
        int Start=0;
        int End=arr.length-1;

        int index=-1;

        while(Start<=End) {

            int mid=Start+(End-Start)/2;
            
            if(arr[mid]<target) {
                Start=mid+1;
            }   
            else if(arr[mid]>target) {
                End=mid-1;
            }
            else {
                index=mid;
                End=mid-1;
            }
        }
        return index;
    }

    public int lastOcc(int[] arr,int target){
        int Start=0;
        int End=arr.length-1;

        int index=-1;

        while(Start<=End) {

        int mid=Start+(End-Start)/2;

        if(arr[mid]<target) {
            Start=mid+1;
        }   
        else if(arr[mid]>target) {
            End=mid-1;
        } 
        else {
            index=mid;
            Start=mid+1;
        }
    }
    return index; 
  }
}
