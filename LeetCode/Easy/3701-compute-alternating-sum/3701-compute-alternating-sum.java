class Solution {
    public int alternatingSum(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int even=0;
        int odd=0;
        //int []arr=new int[n];
        for(int i=0;i<n;i++){
           //even+=nums[i-1]-nums[i];
           if(i%2==0){
            even+=nums[i];
           }
           else{
            odd-=nums[i];
           }
        }
        return even+odd;
    }
}