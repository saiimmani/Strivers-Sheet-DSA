class Solution {
    public int removeDuplicates(int[] nums) {
       if(nums.length == 0) return 0;
       int i = 0;
       for(int j = 1; j<nums.length; j++){
        if(nums[j] != nums[i]){ // if i , j pointing to same element it will skip that 
            i++; // increments by one  
            nums[i] = nums[j]; // // save new arr 
        }
       } 

       return i+1; // index of need count increment 
    }
}
// Two Pointer Approach 
