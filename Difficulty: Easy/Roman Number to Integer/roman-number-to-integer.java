class Solution {
    public int romantoI(char c){
        if(c=='I') return 1;
        if(c=='V') return 5;
        if(c=='X')  return 10;
        if(c=='L') return 50;
        if(c=='C') return 100;
        if(c=='D') return 500;
        else return 1000;
    }
    public int romanToDecimal(String s) {
        int i=0;
        int ans=0;
        while(i<s.length()){
            if(i!=s.length()-1 && romantoI(s.charAt(i))<romantoI(s.charAt(i+1))){
                ans+=romantoI(s.charAt(i+1))-romantoI(s.charAt(i));
                i=i+2;
            }
            else{
                ans+=romantoI(s.charAt(i));
                i++;
            }
        }
        return ans;
    }
}