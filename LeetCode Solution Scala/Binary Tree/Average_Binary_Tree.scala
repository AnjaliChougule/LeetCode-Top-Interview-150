/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def averageOfLevels(root: TreeNode): Array[Double] = {
        val result = scala.collection.mutable.ArrayBuffer[Double]()
        var currentLevel = List(root)
        while (currentLevel.nonEmpty) {
        val nextLevel = scala.collection.mutable.ListBuffer[TreeNode]()
        var sum = 0.0
            for (node <- currentLevel) {
                sum += node.value
                if (node.left != null) nextLevel += node.left
                if (node.right != null) nextLevel += node.right
            }
            result += sum / currentLevel.size
            currentLevel = nextLevel.toList
        }
        result.toArray
        
    }
}