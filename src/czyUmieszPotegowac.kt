import java.lang.Math.pow

////


class canUMagnify(){

    fun howMutchExamples(){
        var D = readLine().toString().toInt() //pobiera ile ma być parametró podanych
        var a = 1
        var b = 1
        var w = IntArray(D)      //tworzy tablice
        for (i:Int in 0..D-1){
            a = readLine().toString().toInt()
            b = readLine().toString().toInt()


            w[i] = giveLastNumber(a, b)
        }
        for (i:Int in 0..D-1){
            println(w[i])
        }
    }

    fun giveLastNumber(a:Int, b:Int):Int{
        val powNum:String = pow(a.toDouble(), b.toDouble()).toInt().toString()
        return  powNum[powNum.length-1].toString().toInt()
    }


}



fun main(args:Array<String>){
    var givePowLastNumber = canUMagnify()

    givePowLastNumber.howMutchExamples()

}