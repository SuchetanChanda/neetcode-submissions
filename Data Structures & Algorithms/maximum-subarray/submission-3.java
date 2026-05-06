class Solution {
    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;
        for(int i = 0; i< nums.length; i++){
            int temp_sum = nums[i];
            if (temp_sum > res){
                res = temp_sum;
            }
            for (int j = i+1; j< nums.length; j++){
                temp_sum+=nums[j];
                if (temp_sum > res){
                res = temp_sum;
            }
            }
        }

        return res;
    }
}
