object Solution {
    def myPow(x: Double, n: Int): Double = {
        if (n == 0) return 1.0
        var result = 1.0
        var base = x.toDouble
        var exponent = n.toLong  
        
        if (exponent < 0) {
            base = 1 / base
            exponent = -exponent
        }
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result *= base
            }
            base *= base
            exponent /= 2
        }
        result
    }
}