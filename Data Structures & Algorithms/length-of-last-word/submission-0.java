class Solution 
{
    public int lengthOfLastWord(String s) 
    {
             String a[]=s.split(" ");
             String e=a[a.length-1];
            return e.length();
    }
}