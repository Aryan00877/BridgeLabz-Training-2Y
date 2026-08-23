class Solution {
    public int lengthOfLastWord(String s) {
        int x = s.length()-1;
        while(x>=0 && s.charAt(x)==' '){
            x--;
        }
        int l=0;
        while(x>=0 && s.charAt(x)!=0){
            if(s.charAt(x)==' '){
                break;
            }
            l++;
            x--;
        }
        return l;
    }
}