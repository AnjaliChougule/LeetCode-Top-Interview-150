object Solution {
    def maxArea(height: Array[Int]): Int = {
        var l = 0
        var r = height.length - 1
        var curr_area = 0
        var max_area = 0
        while(l < r){
            curr_area = height(r).min(height(l)) * (r-l)
            max_area = curr_area.max(max_area)
            if (height(l) < height(r)){
                l += 1
            }
            else {
                r -= 1
            }
        }
        max_area
    }
}