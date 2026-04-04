/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int preIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return build(preorder, inorder, map, 0, inorder.length - 1);
    }

    TreeNode build(int[] preorder, int[] inorder, Map<Integer, Integer> map,
                   int start, int end) {
        if (start > end) return null;

        int val = preorder[preIndex++];
        TreeNode root = new TreeNode(val);

        int index = map.get(val);

        root.left = build(preorder, inorder, map, start, index - 1);
        root.right = build(preorder, inorder, map, index + 1, end);
        return root;
    }
}