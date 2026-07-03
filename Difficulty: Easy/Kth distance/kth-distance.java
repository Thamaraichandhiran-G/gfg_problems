class Solution {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {
        // your code
        int n = arr.length;
        HashMap<Integer ,Integer> map = new HashMap<>();
        int l =0;
        for(int r=0;r<n;r++){
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);
            if(map.get(arr[r])==2){
                return true;
            }
            if(map.size()==k+1){
                map.put(arr[l],map.get(arr[l])-1);
                if(map.get(arr[l])==0){
                    map.remove(arr[l]);
                }
                l++;
            }
        }
        return false;
    }
}