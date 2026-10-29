class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            if(val != nums[i]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
