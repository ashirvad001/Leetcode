class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);

        int closest=nums[0]+nums[1]+nums[2];
        for(int i=0;i<n-2;i++){
            int left=i+1; 
            int right=n-1;
            while(left<right){
                int CurrentSum=nums[i]+nums[left]+nums[right];

                if(Math.abs(target-CurrentSum)<Math.abs(target-closest)){
                    closest=CurrentSum;
                }

                if(CurrentSum<target){
                    left++;
                }
                else if(CurrentSum>target){
                    right--;
                }
                else{
                    return CurrentSum;
                }
            }
            
        }
        return closest;
    }
}