class Solution {
    public boolean isPalindrome(String a) {
        a=a.toLowerCase();
        String c="";
        for(int i=0;i<a.length();i++){
            char d=a.charAt(i);
            if(Character.isLetterOrDigit(d)){
                c=c+d;
            }
        }
        String t="";
        for(int i=c.length()-1;i>=0;i--){
            t=t+c.charAt(i);
        }
        return t.equals(c);
        
    }
}
