/*  [Easy]
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 
Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.
 
Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
*/

//T.C = O(n) and S.C = O(n)
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length, left=0, right=n-1, size=n-1;
        int[] arr = new int[n];
        
        while(left <= right){
            if(Math.pow(nums[left],2) > Math.pow(nums[right],2)){
                arr[size] = (int)Math.pow(nums[left],2);
                left++;
                size--;
            }
            else{
                arr[size] = (int)Math.pow(nums[right],2);
                right--;
                size--;
            }
        }
        return arr;
    }
}
