import java.util.HashMap;
class ContainsNearbyDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                int j=hm.get(nums[i]);
                if(nums[i]==nums[j] && (i-j)<=k)
                {
                    return true;
                }
            }
            hm.put(nums[i],i);
        }
        return false;
    }
}
