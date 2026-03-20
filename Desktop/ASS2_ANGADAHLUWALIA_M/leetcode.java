
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

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
    // 1. two sum
   public int[] twoSum(int[] nums, int target){
    HashMap<Integer,Integer> bla= new HashMap<>();
    for(int i=0;i<nums.length;i++){
        int complement= target-nums[i];
        if(bla.containsKey(complement)) {return new int[]{bla.get(complement), i};}
        bla.put(nums[i], i);
    }
    return new int[]{0,0};
   }
   public String longestCommonPrefix(String[] strs) {
    for(int i=0;i<strs[0].length();i++){
        char curr=strs[0].charAt(i);
        for (int j=1;j<strs.length;j++){
            if(i>=strs[j].length()||strs[j].charAt(i)!=curr){
                return strs[0].substring(0,i);
            }
        }
        
    }
        return strs[0];
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List> anHashMap= new HashMap<>();
        int[] vals= new int[26];
        for(String s:strs){
             Arrays.fill(vals, 0);
             for(char c:s.toCharArray()){
                vals[c-'a']++;
             }
             StringBuilder sb= new StringBuilder();
             for(int i=0;i<26;i++){
                sb.append("#");
                sb.append(vals[i]);
             }
             String key=sb.toString();
             if(!anHashMap.containsKey(key)){
                anHashMap.put(key, new ArrayList<>());
             }
             else{
                anHashMap.get(key).add(s);
             }

        }
         
        return new ArrayList(anHashMap.values());
    }
     public int removeElement(int[] nums, int val) {
        ArrayList num=new ArrayList<>(nums.length);

        for(int i=0;i<nums.length;i++){
            num.add(nums[i]);
        }
    for(int i=0 ;i<num.size();i++){
        if(num.get(i).equals(val)){
            num.remove(i);
            i--;
        }
    }
    for(int i=0;i<num.size();i++){
        nums[i]=(int)num.get(i);
    }
    return num.size();
        

    }
}