class Solution {
    public boolean isAnagram(String s1, String s2) {
        char[] s=s1.toCharArray();
        char[] t=s2.toCharArray();
        Arrays.sort(s);
        Arrays.sort(t);
        if(Arrays.equals(s,t)){
            return true;
        }
        return false;
        
    }
}
