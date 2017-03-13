public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0)
            return null;

        return sortedArrayToBSTHelper(nums, 0, nums.length-1);
    }

    public TreeNode sortedArrayToBSTHelper(int[] nums, int start, int end){
        if(start > end)
            return null;

        int mid = start + (end - start)/2;

        TreeNode node = new TreeNode(nums[mid]);

        node.left = sortedArrayToBSTHelper(nums, start, mid-1);
        node.right  = sortedArrayToBSTHelper(nums, mid+1, end);
        return node;
    }
}
