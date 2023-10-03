class Solution {
    public int maximumCount(int[] nums) {

        int start = 0;
        int end = nums.length - 1;
        
        while(start<=end){

            int mid = start + (end-start)/2;

            if(nums[mid]>=0){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        int ans1 = end+1;
        start = 0;
        end = nums.length-1;

        while(start<=end){

            int mid = start + (end-start)/2;

            if(nums[mid]<=0){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        int ans2 = nums.length - start;

        return Math.max(ans1, ans2);
    }
}

