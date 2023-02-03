/*****************************************************************************************************************************************

-------------------
QUESTION NO-1394
-------------------

Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.

Return the largest lucky integer in the array. If there is no lucky integer return -1.


----------------------------------------------------------------------------------------------------------

Example 1:

Input: arr = [2,2,3,4]
Output: 2
Explanation: The only lucky number in the array is 2 because frequency[2] == 2.

Example 2:

Input: arr = [1,2,2,3,3,3]
Output: 3
Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.

Example 3:

Input: arr = [2,2,2,3,3]
Output: -1
Explanation: There are no lucky numbers in the array.

----------------------------------------------------------------------------------------------------------


*****************************************************************************************************************************************/

class Solution {
    public int findLucky(int[] arr) {
        
       int freq[]=new int[501];

        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }

        int frequency=0;

        for(int i=0;i<arr.length;i++)
        {
            if(freq[arr[i]]==arr[i])

                frequency=Math.max(frequency,arr[i]);
        }

        return frequency==0? -1 : frequency;
    }
}
