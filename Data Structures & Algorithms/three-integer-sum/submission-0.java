class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        HashSet<List<Integer>>hs=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            HashMap<Integer,Integer>map=new HashMap<>();
            for(int j=i+1;j<nums.length;j++)
            {
                int requ=-(nums[i]+nums[j]);
                if(map.containsKey(requ))
                {
                    List<Integer>triplet=Arrays.asList(nums[i],nums[j],requ); 
                                                    
                    Collections.sort(triplet);
                    hs.add(triplet);
                }
            
            map.put(nums[j],j);
            }
        } 
        return new ArrayList<>(hs);
    }
}
