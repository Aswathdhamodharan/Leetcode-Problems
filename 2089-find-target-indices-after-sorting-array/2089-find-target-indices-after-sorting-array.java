class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        List<Integer> lst=new ArrayList<>();
        //int ans=0;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                lst.add(i);
            }
        }
        return lst;
    }
}