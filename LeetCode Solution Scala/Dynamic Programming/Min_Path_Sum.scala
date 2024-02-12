object Solution {
    def minPathSum(grid: Array[Array[Int]]): Int = {
        val rows = grid.size
        val cols = grid(0).size
       
        for(row <- 0 until rows){
            for(col <- 0 until cols ){
                if(row == 0 && col != 0) grid(row)(col) += grid(row)(col - 1)
                else if(col == 0 && row != 0) grid(row)(col) += grid(row - 1)(col)
                else if(row >0 && col >0) grid(row)(col) += math.min(grid(row-1)(col),grid(row)(col-1))
            }
        }
        grid(rows-1)(cols-1)

    }
}