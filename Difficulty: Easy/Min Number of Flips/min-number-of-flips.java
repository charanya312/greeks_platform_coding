class Solution {
    public int minFlips(String s) {
        int f1=0,f2=0;
        for(int i=0;i<s.length();i++){
            if(i%2==0 && s.charAt(i)!='0'){
                f1++;
            }
            if(i%2!=0 && s.charAt(i)!='1'){
                f1++;
            }
        }
        for(int i=0;i<s.length();i++){
            if(i%2==0 && s.charAt(i)!='1'){
                f2++;
            }
            if(i%2!=0 && s.charAt(i)!='0'){
                f2++;
            }
        }
        return Math.min(f1,f2);
        
    }
}