
import java.util.HashSet;

public class leetcode {
    //217. Contains Duplicate
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> ints= new HashSet<>();
        for (int num : nums){
            if(ints.contains(num)) return true;
            ints.add(num);
        }
        return false;
    }
    //1929. Concatenation of Array
    public int[] getConcatenation(int[] nums) {
        int []ans=new int[nums.length *2];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[nums.length+i]=nums[i];
        }
        return ans;
        
    }
    //242 Valid Anagram
    public boolean isAnagram(String s, String t) {
        int [] nums= new int[26];
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            nums[s.charAt(i)-'a']++;
            nums[t.charAt(i)-'a']--;

        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0) return false;
        }
        return true;


        
    }


}