/******************************************************************************************************************************************************
------------------
QUESTION NO-1089
------------------
Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.

---------------------------------------------------------------------------------------

Example 1:

Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
Example 2:

Input: arr = [1,2,3]
Output: [1,2,3]
Explanation: After calling your function, the input array is modified to: [1,2,3]

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

-----------------
APPROACH-1
-----------------
class Solution {

    public void duplicateZeros(int[] arr) {

        ArrayList<Integer> output = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] == 0) {
                output.add(0);
                output.add(0);
            } 
            else output.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++)
         arr[i] = output.get(i);
    }
}

-----------------------
APPRAOCH-2
-----------------------
class Solution {

    public void duplicateZeros(int[] arr) {
        int length = arr.length;

        for(int i = 0; i<length; i++) {

            if(arr[i] ==0) {

                int j;

                for(j = length-2; j>=i+1; j--) {

                    arr[j+1] = arr[j];
                }
                
                arr[j+1] = 0;
                i++;
            }
        }
    }
}
