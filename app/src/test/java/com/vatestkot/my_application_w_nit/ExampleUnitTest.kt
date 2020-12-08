package com.vatestkot.my_application_w_nit
import org.junit.Test

import org.junit.Assert.*
/**
 * Example local unit test, which will execute on the development machine (host).
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    val test1 = TestDataClass("Russia", "Sochi", +10)
    val test2 = TestDataClass("Russia", "Chely", -10)

    val collection = mutableListOf(test1,test2)

    @Test
    fun start() {
        print(collection.sort())
    }
    fun List<TestDataClass>.sort():List<TestDataClass> {
        // this.sortBy { it.temp } // - :(
        /*
        var temp_max : Int = -70
        var WarmPlace : String = ""
        for (n in this) {
            if (n.temp > temp_max) {
                temp_max = n.temp
                WarmPlace = n.city
            }
        }
        println("Теплее всего в городе: "+WarmPlace)
        */
        return this
    }
}
