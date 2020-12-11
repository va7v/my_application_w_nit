package com.vatestkot.my_application_w_nit
import org.junit.Test

import org.junit.Assert.*
/**
 * Example local unit test, which will execute on the development machine (host).
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    val test1 = TestDataClass("Sochi", 20)
    val test2 = TestDataClass("Chely", 0)

    val collection = mutableListOf(test1,test2)

    @Test
    fun start() {
        println(collection)
        println(collection.sort()) // - сортировка прошла успешно
        // for (n in collection) { println(n.city+" "+n.temp) } //краткий вывод данных
    }
    fun List<TestDataClass>.sort():List<TestDataClass> {
        val sorting = this.sortedBy { it.temp } // :)
        return sorting
    }
}
