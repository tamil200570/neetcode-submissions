class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        int c=0;
        HashSet<Integer>hs=new HashSet<>();
        for(int i : nums)   
        {
            hs.add(i);
        } 
        for(int i : hs)
        {
           if(!hs.contains(i-1))
           {
              int current=i;
              int count=1;
              while(hs.contains(current+1))
              {
                current++;
                count++;
              }
              c=Math.max(c,count);
           }
        }
        return c;
    }
}
