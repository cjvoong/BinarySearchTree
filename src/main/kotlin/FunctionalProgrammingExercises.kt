package functionalprogramming

object FunctionalProgrammingExercises{
    fun reverseString(str:String):String{
        return if (str.length == 1)
            str
        else
            reverseString(str.slice(1 until str.length)) + str.first()
    }

    fun getElementsAsString(list:List<String>):String{
        return if (list.count()==1)
            list.first()
        else {
            list.first() + "," + getElementsAsString(list.drop(1))
        }
    }

    fun isStringPalindrome(str:String):Boolean{
        return if (str.length<2)
            true
        else {
            println("Is ${str.first()} == ${str.last()} : ${(str.last() == str.first())}")
            (str.last() == str.first()) && isStringPalindrome(str.drop(1).dropLast(1))
            }
        }

    fun aToPowerB(a:Int,b:Int):Int{
        return if (b==0)
             1
        else
            a* aToPowerB(a,b-1)
    }


}