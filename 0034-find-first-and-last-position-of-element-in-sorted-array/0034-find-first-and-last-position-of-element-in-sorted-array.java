class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int a=-1,b=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                if(a==-1){a=i;
                }
                    b=i;
            }
        }
        return new int[] {a,b};
    }
}