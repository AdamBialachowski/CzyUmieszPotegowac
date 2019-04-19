import java.lang.Math.pow

////


class canUMagnify() {

    fun howMutchExamples() {
        var D = readLine().toString().toInt() //pobiera ile ma być parametró podanych
        var abStr: String
        var a = 1
        var b = 1
        //var w = IntArray(D)      //tworzy tablice
        var w2 = IntArray(D)      //tworzy tablice
        for (i: Int in 0..D - 1) {
            abStr = readLine().toString()

            //w[i] = giveLastNumber(abStr.split(" ")[0].toInt(), abStr.split(" ")[1].toInt())   //potęguje
            w2[i] = giveLastNumber2(abStr.split(" ")[0].toInt()%10, abStr.split(" ")[1].toInt())
            //podstawa a jest modulo 10 bo miliard do 4 to za durzo dla potrzeb spoja
        }
        for (i: Int in 0..D - 1) {
            //println(w[i])
            println(w2[i])
        }
    }

    fun giveLastNumber(a: Int, b: Int): Int {// oblicza wynik potęgując (zjada zbyt dużo zasobów)
        val powNum: String = pow(a.toDouble(), b.toDouble()).toInt().toString()
        return powNum[powNum.length - 1].toString().toInt()
    }

    fun giveLastNumber2(a:Int, b:Int):Int{//Patent na oszczędniejsze wygenerowanie wyniku
        var index: Int = b
        if(b%4 == 0){
            index=4
        }
        else {
            index = index%4
        }
        val powNum: String = pow(a.toDouble(), index.toDouble()).toInt().toString()
        return powNum[powNum.length - 1].toString().toInt()
    }
}



fun main(args:Array<String>){

    var givePowLastNumber = canUMagnify()
    givePowLastNumber.howMutchExamples()

}