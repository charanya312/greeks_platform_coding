
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int i=0,j=0;
        int sum=arr[0];
        ArrayList<Integer>a=new ArrayList<>();
        while(i<arr.length && j<arr.length){
            if(sum==target){
                a.add(i+1);
                a.add(j+1);
                return a;
            }
            else if(sum<target && j<arr.length-1){
                sum+=arr[j+1];
                j++;
            }
            else{
                sum-=arr[i];
                i++;
            }
        }
        a.add(-1);
        return a;
    }
}
