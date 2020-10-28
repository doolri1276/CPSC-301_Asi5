import kotlin.math.abs

fun main(){

    //2
    val chList = listOf('a', 'c', 'e', 'f')
    println("2 : "+ordlist(chList))

    //4
    val pList = listOf(Pair(1, 2),Pair(3, 4))
    println("4 : "+multpairs(pList))

    //6
    val intList = listOf(3, 5, 7, 9)
    println("6 : "+sqsum(intList))

    //8
    val boolList = listOf(true, false, true, false)
    println("8 : "+band(boolList))
    val emptyList = listOf<Boolean>()
    println("8 : "+band(boolList))

    //10
    println("10 : "+dupList(intList))

    //12
    println("12 : "+il2absrl(listOf(5, -6, 7, 8, 9)))

    //14
    val intSqrList = listOf(listOf(3, 2), listOf(6, 2), listOf(2, 2))
    println("14 : "+maxpairs(intSqrList))

    //16
    val listList = listOf(listOf(1, 3), listOf(5, 7, 9), listOf(10, 11))
    println("16 : "+lconcat(listList))

    //18
    println("18 : "+min(intList))

}

//2
fun ordlist(chList:List<Char>) = chList.map {it.toInt()}

//4
fun multpairs(pList:List<Pair<Int, Int>>) = pList.map {it.first*it.second}

//6
fun sqsum(intList: List<Int>) = intList.fold(0){ acc, i -> acc+i*i}

//8
fun band(boolList:List<Boolean>) = boolList.fold(true){acc: Boolean, i -> acc and i}

//10
fun <T> dupList(list: List<T>) = list.flatMap { listOf(it, it) }

//12
fun il2absrl(intList: List<Int>) = intList.map { abs(it).toDouble()}

//14
fun maxpairs(intSqrList: List<List<Int>>) = intSqrList.map { it.maxBy { i -> i } }

//16
fun <T> lconcat(list: List<List<T>>) = list.flatMap { it }

//18
fun min(intList: List<Int>) = intList.minBy { it }

//20
fun append(){}

//22
fun evens(){}

//24
fun mymap(){}

//26
fun mymap2(){}