class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        LinkedHashSet<Integer>hs=new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        return new ArrayList<>(hs);
    }
}
