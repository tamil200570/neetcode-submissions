class Solution 
{
    public int firstMissingPositive(int[] nums) 
    {
       HashSet<Integer>hs=new HashSet<>();
       for(int i : nums)
       {
        if(i>0)
        {
            hs.add(i);
        }
       }   
       int x=1; 
       while(true)
       {
        if(!hs.contains(x)) return x;
        x++;
       }
    }
}