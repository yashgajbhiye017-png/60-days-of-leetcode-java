class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] cube = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int i = nums.length - 1;

        while(left <= right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                cube[i] = nums[left] * nums[left];
                left++;
            }else{
                cube[i] = nums[right] * nums[right];
                right--;
            }
            i--;
        }
        return cube;
    }
}