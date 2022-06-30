/*  [Easy]
Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written. Do the above modifications to the input array
in place and do not return anything. 

Example 1:

Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]

Example 2:

Input: arr = [1,2,3]
Output: [1,2,3]
Explanation: After calling your function, the input array is modified to: [1,2,3]
 
Constraints:

1 <= arr.length <= 104
0 <= arr[i] <= 9
*/

//T.C = O(n^2) and S.C = O(1)
class Solution {
    public void duplicateZeros(int[] arr) {
        
        for (int i=0; i<arr.length; i++){
            if (arr[i] == 0){
                for (int j = arr.length-1-1; j>=i; j--){     //last_index=arr.length-1
                    arr[j+1] = arr[j];
                }
                i++; //after taking 0 at i+1 position let's go to the next position, i.e i+2 position
            }
        }
    }
}
