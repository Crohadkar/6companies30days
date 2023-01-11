// 2260. Minimum Consecutive Cards to Pick Up
class Solution {
    public int minimumCardPickup(int[] cards) {
        int arr[]=new int[1000001];
        Arrays.fill(arr,-1);
        int ans= Integer.MAX_VALUE;
        
        for(int i=0;i<cards.length;i++){
            if(arr[cards[i]]!=-1){
                ans = Math.min(ans,i-arr[cards[i]]+1);
            }
            arr[cards[i]]=i;
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}
    