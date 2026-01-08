class Solution {
    void pushZerosToEnd(int[] arr) {
        int i=0;
        while(i<arr.length && arr[i]!=0){
            i++;
        }
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]!=0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
            }
        }
    }
}