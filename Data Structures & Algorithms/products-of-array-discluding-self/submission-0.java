class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i< nums.length; i++) {
            int temp_prod = 1;
            for (int j = 0; j<nums.length; j++) {
                if (j==i) continue;
                if (nums[j]==0) {
                    temp_prod = 0;
                    break;
                }
                temp_prod*=nums[j];
            }
            res[i]=temp_prod;
        }
        return res;
    }
}  
