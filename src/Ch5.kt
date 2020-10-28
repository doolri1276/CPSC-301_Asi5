
fun main(){

    //6
    val intList = listOf(1, 2, 3, 4)
    println(sqsum(intList))

    //10
    println(dupList(intList))

    //16
    val intSqrList = listOf(listOf(1, 3), listOf(4, 2), listOf(5, 9))
    println(maxpairs(intSqrList))

    //18
    println(min(intList))

}

//2 JK
fun ordlist(){}

//4 JK
fun multpairs(){}

//6 KM ************************
fun sqsum(intList: List<Int>) = intList.fold(0){ acc, i -> acc+i*i}

//8 JK
fun band(){}

//10 KM ************************
fun <T> dupList(list: List<T>) = list.map { it }+list.map { it }

//12 JK
fun il2absrl(){}

//14 KM ************************
fun maxpairs(intSqrList: List<List<Int>>) = intSqrList.map { it.maxBy { i -> i } }

//16 JK
fun lconcat(){}

//18 KM ************************
fun min(intList: List<Int>) = intList.minBy { it }

//20 SJ
fun append(list1: List<Int>, list2: List<Int>):List<Int> = list1 + list2

//22 SJ
fun evens(input: List<Int>):List<Int> = input.filter { it % 2 == 0}

//24 SJ
fun mymap(){}

//26 SJ
fun mymap2(){}