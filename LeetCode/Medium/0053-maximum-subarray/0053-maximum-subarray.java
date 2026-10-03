class Solution {
    public int maxSubArray(int[] nums) {

        // int current_status = nums[0];
        // int max_value = nums[0];

        // for (int i = 1; i<nums.length; i++){
        //     current_status= Math.max(nums[i], (current_status+nums[i]));

        //     max_value = Math.max(current_status,max_value);
        // }
        // return max_value;


        
        int cs = 0;
        int max_value = Integer.MIN_VALUE;

        for (int i = 0; i<nums.length; i++){
            cs += nums[i];

            
        

        max_value = Math.max(cs,max_value);

            if(cs < 0){
                cs = 0;
            }
        }

            
        return max_value;
        
    }
}