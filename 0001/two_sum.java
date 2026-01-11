class two_sum{
    static public int[] twoSum(int[] nums, int target) {
        int sum[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length-1;j++){
                if(nums[j+1]+nums[i]==target){
                    sum[0]=i;
                    sum[1]=j+1;
                    break;
                }
            }
        }
        return sum;
    }
}