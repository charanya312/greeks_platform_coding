class Solution {
    public void sort012(int[] arr) {
        // code here
        int i=0,j=0,k=arr.length-1;
        while(j<=k){
            if(arr[j]==0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
                j++;
            }
            else if(arr[j]==2){
                int temp=arr[k];
                arr[k]=arr[j];
                arr[j]=temp;
                k--;
            }
            else j++;
        }
    }
}