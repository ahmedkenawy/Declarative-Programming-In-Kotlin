package com.a7medkenawy.declarativeprogramming

/**
 * اول وتاني session
 */

/**
 * ال Declarative Function هي اطلاع الكمبيوتر علي ما نريد ولكن دون الدحول في تفاصيل
 */
/**
 * تفصيلا هي انك تعرف الكمبيوتر مثلا انك محتاج تعمل عمليه جمع لكن متعرفهوش هو هيعملها ازاي تسيبه هو يقرر
 */
/**
 * تعرفه مثلا انك محتاج تعمل sort ل list  لكن متعرفهوش هو المفروض يعمل كده ازاي زي ماهو موجود في الامثله تحت
 */

/**
 *  يعني أيه  pure function؟ يعني function  مبتعتمدش علي اي متغير خارجي سواء تقرا منه او تكتب فيه مكتفيه بنفسها
 */

val myData = listOf(3, 4, 5, 9, 7, 80, 20)
fun main() {

    /**
     * Declarative Programming
     */
    val myResult= myData.asSequence().map { it + 1 }.map { it * it }.map { it - 10 }.sorted().filter { it>10 }.take(3).toList()
    println(myResult) //output [15, 26, 54]


    /**
     * Imperative Programming
     */
    for (i in myData) {
        println(subtractTen(square(addOne(i))))  //your output is 6,15,26,90,54,6551,431
    }

    /**
     * في حاله انك محتاج تستخدم نفس ال function المستخدمه في ال Declarative فوق فانت محتاج تكتب عدد كبير جداً من الكود محتاج تعمل function  تعمل filter و function تعمل sort  كل  function  فيها عدد لا باس بيه من الاكواد
     */
    /**
     * يبقي الImparative ولا ال Declarative  اللي اسهل ؟
     */
    /**
     * طبعا ال Declarative لانها وفرت عليك وقت ومجهود كبير
     */
}

private fun addOne(value: Int): Int {
    return value + 1
}

private fun square(value: Int): Int {
    return (value * value)
}

private fun subtractTen(value: Int): Int {
    return (value - 10)
}
