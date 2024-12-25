class Solution {
    static public int[] twoSum(int[] nums, int target) {
        int[] m = new int[2];
        int i,j;
        for(i=0;i<nums.length;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    m[0]=i;
                    m[1]=j;
                    break;
                }
                

            }
        }
        return m;
        
    }
  

 
}