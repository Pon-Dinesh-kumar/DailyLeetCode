class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return nums;
        }
        int even = 0;
        int odd = 1;
        int[] arr = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            if(nums[i]%2==0){
                arr[even] = nums[i];
                even+=2;
            }
            else{
                arr[odd] = nums[i];
                odd+=2;
            }
        }
        return arr;
    }
}
