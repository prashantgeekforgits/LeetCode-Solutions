class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0,candidates,target,new ArrayList<>(),result);
        return result;
    }
    private void backtrack(int index,int[] arr,int target,
                           List<Integer> current,
                           List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(current));
            return ;
        }
        if(target<0 || index == arr.length){
            return;
        }
        current.add(arr[index]);
        backtrack(index,arr,target - arr[index],current,result);
        current.remove(current.size() -1);
        backtrack(index+1,arr,target,current,result);
        
    }
}
