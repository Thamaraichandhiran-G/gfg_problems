class Solution {
    public int maxProfit(int[] arr) {
        // code here
        int n = arr.length;
        int sum =0;
        int buy = arr[0], sell =arr[0];
        
        int i=0;
        while(i<n-1){
            while(i<n-1 && arr[i]>=arr[i+1]){
                i++;
            }
            buy = arr[i];
            while(i<n-1 && arr[i]<=arr[i+1]){
                i++;
            }
            sell = arr[i];
            sum+=  (sell-buy);
        }
        return sum;
    }
}