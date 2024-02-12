object Solution {
    def reverseWords(s: String): String = {
        //s.split(' ').filterNot(_.isEmpty).reverse.mkString(" ")    
        var splitted_arr = s.split(' ').filterNot(_.isEmpty)
        var temp = ""
        for(i <- splitted_arr.length-1 to 0 by -1){
            temp = temp.concat(splitted_arr(i) + " ")
        }
        temp.substring(0,temp.length-1)
    }
}