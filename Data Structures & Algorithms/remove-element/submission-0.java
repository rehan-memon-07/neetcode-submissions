class Solution {
    public int removeElement(int[] nums, int val) {
        int number = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                continue;
            }
            else {
                nums[number] = nums[i];
                number++; 
            }
        }

        return number;
        
    }
}