// Platform GFG https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1
// Day #14 of 100 Days_Of_code

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        int count = 0;
        HashMap<Integer,Integer> res = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            res.put(arr[i],res.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<n;i++){
            int check = k-arr[i];
            if(res.containsKey(check)){
                count+=res.get(check);
            }
            if(check==arr[i]){
                count--;
            }
        }
        return count/2;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n)
