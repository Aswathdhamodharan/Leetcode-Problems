class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
        HashSet<Integer> evencount = new HashSet<>();
        HashSet<Integer> oddcount = new HashSet<>();
            for (int j = i; j < n; j++) {
                if(nums[j]%2==0){
                    evencount.add(nums[j]);
                }
                else{
                    oddcount.add(nums[j]);
                }
                if (evencount.size() == oddcount.size()) {
                    int length=j-i+1;
                    count=Math.max(count,length);
                }
            }
        }
        return count;
    }
}