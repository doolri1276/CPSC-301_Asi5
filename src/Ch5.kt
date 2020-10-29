import kotlin.math.abs
import kotlin.math.max

fun main(){

    //2
    val charList = listOf('A','b','C')
    println(ordlist(charList))

    //4
    val pairsList = listOf(Pair(1,2),Pair(3,4))
    println(multpairs(pairsList))

    //6
    val intList = listOf(1, 2, 3, 4)
    println(sqsum(intList))

    //8
    val boolList1 = listOf(true, true, true, false)
    val boolList2 = listOf<Boolean>()
    println(band(boolList1))
    println(band(boolList2))

    //10
    println("10 : "+dupList(intList))

    //12
    println(il2absrl(listOf(1,2,3,-4,5)))

    //14
    val intSqrPairList = listOf(Pair(1, 3), Pair(4, 2), Pair(5, 9))
    println(maxpairs(intSqrPairList))

    //16
    val listList = listOf(listOf(1,2), listOf(3,4,5,6), listOf(7))
    println(lconcat(listList))

    //18
    println(min(intList))

}

//2 JK
fun ordlist(charList:List<Char>) = charList.map {it.toInt()}

//4 JK
fun multpairs(pairList:List<Pair<Int, Int>>) = pairList.map {it.first*it.second}

//6 KM ************************
fun sqsum(intList: List<Int>) = intList.fold(0){ acc, i -> acc+i*i}

//8 JK
fun band(boolList:List<Boolean>) = boolList.fold(true){acc: Boolean, i -> acc and i}

//10 KM ************************
fun <T> dupList(list: List<T>) = list.flatMap { listOf(it, it) }

//12 JK
fun il2absrl(intList: List<Int>) = intList.map { abs(it).toDouble()}

//14 KM ************************
fun maxpairs(intSqrList: List<Pair<Int, Int>>) = intSqrList.map { max(it.first, it.second) }

//16 JK
fun <T> lconcat(list: List<List<T>>) = list.flatMap { it }

//18 KM ************************
fun min(intList: List<Int>) = intList.minBy { it }

//20 SJ
fun append(list1: List<Int>, list2: List<Int>):List<Int> = list1 + list2

//22 SJ
fun evens(input: List<Int>):List<Int> = input.filter { it % 2 == 0}

//watch

//24 SJ
fun <T, R> mymap(list:List<T>, transform:(T)->R) = list.fold(listOf<R>()) {acc,t -> acc+transform(t)}
//fun <T, R> Iterable<T>.mymap(transform:(T)->R) = for(item:T in this) (ArrayList<R>(if(this is Collection<*>) this.size else 10)).add(transform(item))

//26 SJ
fun mymap2(){}