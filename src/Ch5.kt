import kotlin.math.abs
import kotlin.math.max

fun main(){

    // Q2
    val chList = listOf('a', 'c', 'e', 'f')
    println("2 : "+ordlist(chList))

    // Q4
    val pList = listOf(Pair(1, 2),Pair(3, 4))
    println("4 : "+multpairs(pList))

    // Q6
    val intList = listOf(3, 5, 7, 9)
    println("6 : "+sqsum(intList))

    // Q8
    val boolList = listOf(true, false, true, false)
    println("8 : "+band(boolList))
    val emptyList = listOf<Boolean>()
    println("8 : "+band(boolList))

    // Q10
    println("10 : "+dupList(intList))

    // Q12
    println("12 : "+il2absrl(listOf(5, -6, 7, 8, 9)))

    // Q14
    val intSqrPairList = listOf(Pair(2, 4), Pair(5, 9), Pair(7, 4))
    println("14 : "+maxpairs(intSqrPairList))

    // Q16
    val listList = listOf(listOf(1, 3), listOf(5, 7, 9), listOf(10, 11))
    println("16 : "+lconcat(listList))

    // Q18
    println("18 : "+min(intList))

    // Q20
    println("20 : "+append(listOf(2,4,5), listOf(3,6,9)))

    // Q22
    println("22 : "+evens(listOf(3, 4, 7, 2, 9)))

    println(mymap(intList){it+300})

}

// Q2
fun ordlist(chList:List<Char>) = chList.map {it.toInt()}

// Q4
fun multpairs(pList:List<Pair<Int, Int>>) = pList.map {it.first*it.second}

// Q6
fun sqsum(intList: List<Int>) = intList.fold(0){ acc, i -> acc+i*i}

// Q8
fun band(boolList:List<Boolean>) = boolList.fold(true){acc: Boolean, i -> acc and i}

// Q10
fun <T> dupList(list: List<T>) = list.flatMap { listOf(it, it) }

// Q12
fun il2absrl(intList: List<Int>) = intList.map { abs(it).toDouble()}

// Q14
fun maxpairs(intSqrList: List<Pair<Int, Int>>) = intSqrList.map { max(it.first, it.second) }

// Q16
fun <T> lconcat(list: List<List<T>>) = list.flatMap { it }

// Q18
fun min(intList: List<Int>) = intList.minBy { it }

// Q20
fun append(list1: List<Int>, list2: List<Int>):List<Int> = list1 + list2

// Q22
fun evens(input: List<Int>):List<Int> = input.filter { it % 2 == 0}

// Q24
fun <T, R> mymap(list:List<T>, transform:(T)->R) = list.fold(listOf<R>()) {acc,t -> acc+transform(t)}
//fun <T, R> Iterable<T>.mymap(transform:(T)->R) = for(item:T in this) (ArrayList<R>(if(this is Collection<*>) this.size else 10)).add(transform(item))

// Q26
fun mymap2(){}