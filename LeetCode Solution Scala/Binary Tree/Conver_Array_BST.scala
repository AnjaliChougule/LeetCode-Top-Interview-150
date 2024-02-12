/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def sortedArrayToBST(nums: Array[Int]): TreeNode = {
        def helper (l : Int, r : Int) : TreeNode = {
            if (l > r){
                return null
            }
            var mid = (l + r) / 2
            var root: TreeNode = TreeNode(nums(mid))
            root.left = helper(l, mid - 1)
            root.right = helper(mid + 1, r)
            root
        }
        helper (0, nums.length - 1)
    }
}