class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
       HashMap<String,List<String>>result=new HashMap<>();
       for(String s: strs)
       {
        char a[]=s.toCharArray();
        Arrays.sort(a);
        String s1=new String(a);
        result.putIfAbsent(s1,new ArrayList<>());
        result.get(s1).add(s);
       }    
       return new ArrayList<>(result.values());
    }
}
