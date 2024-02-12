import scala.collection.mutable.Stack
object Solution {
    def decodeString(s: String): String = {
   val stack = Stack[Char]()
        var ans =""
        for (i <- 0 until s.length) {
            if (s.charAt(i) != ']')
                stack.push(s.charAt(i));
            else {
                var str = ""
                var k = "";
                while (stack.top != '[') {
                    str = stack.pop() + str;
                }
                stack.pop();
 
                while (stack.nonEmpty && stack.top.isDigit){
                    k = stack.pop() + k;
                    }
                val n = k.toInt
 
                for(_ <-1 to  n) {
                 for(j <- 0 until str.length){
                    stack.push(str.charAt(j));
                 }
                }
            }
        }
        while(stack.nonEmpty)
            ans = stack.pop() +ans;
           
        ans
    }
}