class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int []res=new int[n];
        for(int i=0;i<n;i++){
            int x=nums[i];
            if(x==0){
                res[i]=0;
            }
            else{
                int target=(i + (x % n) + n) % n;
                res[i]=nums[target];
            }
        }
        return res;
    }
}