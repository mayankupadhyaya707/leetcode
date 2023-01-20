import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        if(nums.length==1 || nums.length==0)
            return false;
        HashSet<Integer>hash=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hash.contains(nums[i]))
            {
                return true;
            }
            hash.add(nums[i]);
        }
        return false;
    }
}