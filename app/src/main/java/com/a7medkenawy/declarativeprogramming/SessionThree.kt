package com.a7medkenawy.declarativeprogramming

/*
*Higher Order Function
 */

//lambda expression
// (var/val) (function Name) :(Parameters Type) ->(Return Type)={(Parameters Name) ->(my code) }
//for example function to add two Integers

/*

var sum: (Int, Int) -> Int = { num1, num2 -> num1 + num2 }
 fun main() {
    println(sum(5,7))  //output -> 12
}

*/


//Higher Order Function  ->  mean function take function as a parameter or return function
//for example

fun test1(x:Double):Double{
    return x/2
}

fun test2(x:Double):Double{
    return x/4 +1
}

fun test3(test:(Double)->Double):Double{
    return test2(5.0)
}

fun test3(test:()->Double):Double{
    return test2(5.0)
}

val returnDouble:()->Double={
    5.0
}

fun test3():()->Double{
    return returnDouble
}


fun sum(x:Int,y:Int):Int{
    return x+y
}

var myNum:()->Int={
    5
}

fun x():()->Int{
    return  myNum
}
fun main() {
//    println(test1(test2(5.0)))
//    println(test2(test1(5.0)))
//
//    val x= test3()
//    var h=x()
//    println(h)
    var z=x()
    var l=z()
    println(l)
}