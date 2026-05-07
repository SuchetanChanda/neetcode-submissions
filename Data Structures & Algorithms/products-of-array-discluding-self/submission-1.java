class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pref_prod = new int[nums.length];
        int[] suf_prod = new int[nums.length];

        pref_prod[0] = 1;

        for(int i = 1; i<nums.length; i++){
            pref_prod[i] = pref_prod[i-1] * nums[i-1];
        }

        suf_prod[nums.length-1] = 1;

        for(int i = nums.length - 2; i>= 0; i--){
            suf_prod[i] = suf_prod[i+1] * nums[i+1];
        }
        
        int[] res = new int[nums.length];

        for (int i = 0; i<nums.length; i++){
            res[i] = pref_prod[i]*suf_prod[i];
        }  

        return res;
    }
}  
