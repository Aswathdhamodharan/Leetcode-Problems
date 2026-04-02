class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> ls1=new ArrayList<>();
        ArrayList<Integer> ls2=new ArrayList<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                ls1.add(nums[i]);
            }
            else if(nums[i]>pivot){
                ls2.add(nums[i]);
            }
            else{
                count++;
            }
        }
        for(int i=0;i<count;i++){
            ls1.add(pivot);
        }
        ls1.addAll(ls2);
        for(int i=0;i<ls1.size();i++){
            nums[i]=ls1.get(i);
        }
        return nums;
    }
}