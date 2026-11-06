class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        int left = 0;
        for(int j = 0; j < nums.length; j++){
            int right = sum - nums[j] - left;
            if(right == left){
                return j;
            }else{
                left += nums[j];
            }
        }
        return -1;
    }
}