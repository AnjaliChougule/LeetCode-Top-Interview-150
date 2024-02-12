import scala.collection.mutable.Stack
object Solution {
    def isValid(s: String): Boolean = {
        var stack = Stack[Char]()
        for(index <- 0 until s.length){
            val ch = s.charAt(index)
            if(ch == '(' || ch == '[' || ch =='{')
                stack.push(ch)
            else if(!stack.isEmpty){
                if(ch == ')' && stack.top == '(')
                    stack.pop()
                    
                else if(ch == '}' && stack.top == '{')
                    stack.pop()
 
                else if(ch == ']' && stack.top == '[')
                    stack.pop()
                else
                    return false
            }
            else{
                return false
            }
        }
        stack.isEmpty
    }
}