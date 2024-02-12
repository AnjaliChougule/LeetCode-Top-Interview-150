import scala.collection.mutable
import scala.collection.mutable._
object Solution {
    def groupAnagrams(strs: Array[String]): List[List[String]] = {
        var mp=mutable.Map.empty[String,List[String]]
        for(i <- 0 until strs.length)
        {
            var s=strs(i)
            s= s.sortWith(_.compareTo(_) < 0)
           if( mp.contains(s)){
               var x = mp(s)
                x=x :+ strs(i)
                println(x)
                println(strs(i))
                mp.put(s,x)
           }
           else {
               mp.put(s, List(strs(i)))
           }
        }
        var v: List[List[String]] = List(List("a","b"))
        for ((key,value) <- mp){
            v=v:+value
        } 
        v.tail
    }
}