class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int first=firstIndex(nums,target);
        int last=lastIndex(nums,target);
        return new int[] {first,last};
    }
    public static int firstIndex(int nums[], int target)
    {
        int left=0;
        int right=nums.length-1;
        int index=-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(nums[mid]==target)
            {
                index=mid;
                right=mid-1;//move left
            }
            else if(nums[mid]<target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return index;
    }
    public static int lastIndex(int nums[], int target)
    {
        int left=0;
        int right=nums.length-1;
        int index=-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(nums[mid]==target)
            {
                index=mid;
                left=mid+1;//move right
            }
            else if(nums[mid]<target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return index;
    }
}
