class Solution {
    public static void solve(int nums[], List<List<Integer>> ans, List<Integer> list, int idx){
        if(idx == nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[idx]);
        solve(nums, ans, list, idx+1);
        list.remove(list.size()-1);
        solve(nums, ans, list, idx+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums, ans, new ArrayList<>(), 0);
        return ans;
    }
}
