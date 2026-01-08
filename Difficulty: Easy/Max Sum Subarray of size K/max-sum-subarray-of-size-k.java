class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int currsum=0;
        int i=0,j=k-1;
        for(int t=i;t<=j;t++){
            currsum+=arr[t];
        }
        int maxsum=currsum;
        while(j<arr.length-1){
            currsum=currsum-arr[i]+arr[j+1];
            i++;
            j++;
            if(currsum>maxsum){
                maxsum=currsum;
            }
        }
        return maxsum;
    }
}