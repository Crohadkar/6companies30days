// 216. Combination Sum III

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList();
        rec(1,9,ans,new ArrayList(),k,n);
        rec(1,9,ans,new ArrayList(),k,n);
        return ans;
    }
    
    void rec(int start , int end , List<List<Integer>> ans , List<Integer> cur , int size , int target){
        
        if(cur.size()== size && target==0){
            ans.add(new ArrayList(cur));
            return ;
        }
        
         for(int i=start ;i<=end ;i++){
        
            cur.add(i);
            rec(i+1,end,ans,cur,size,target-i);
            cur.remove(cur.size()-1);
      
        }
         
    }
}