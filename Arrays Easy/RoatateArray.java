class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
      for(int i = 0; i < k; i++){ // k - > steps 
        int last = nums[n-1];
        for (int j = n-1; j > 0; j-- ){
          nums[j] = num[j-1];
        }
         arr[0] = last;
      }
      
    }
}
// [1,2,3,4,5,6,7]
/*
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
*/
