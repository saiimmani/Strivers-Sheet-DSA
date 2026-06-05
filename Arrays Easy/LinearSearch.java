// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class LinearSearch {
    public static int linearSearch(int nums[], int target) {
		//Your code goes here
        for (int i = 0; i< nums.length; i++){
            if (target == nums[i]){
                return i ;
            }
            
        
        }
        return -1;
    }

    public static void main(String[] a){
    int target = 13;
    int nums[] = {134,94,54,3,2,13,44,3};
    
    LinearSearch ls = new LinearSearch();
    
    int sol = ls.linearSearch(nums, target);
    
    System.out.print("solution :" + sol);
}

}
