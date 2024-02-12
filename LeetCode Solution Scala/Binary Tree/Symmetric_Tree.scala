/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def isSymmetric(root: TreeNode): Boolean = {
        def dfs(left : TreeNode, right : TreeNode) : Boolean = {
            if (left == null && right == null){
                return true
            }
            if (left == null || right == null){
                return false
            }
            (left.value == right.value) &&
            dfs(left.left,right.right) &&
            dfs(left.right,right.left)
        }
        dfs(root.left, root.right)       
    }
}