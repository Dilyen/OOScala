
package io.turntabl.MyApp

import io.turntabl.ooscala.TLCStudent

object MyApp extends App {
    val doreen = new TLCStudent("doreen", "doodo", id = 1011)
    println(doreen.termOfService)

    val  david = new TLCStudent("david", "andoh", githubURL = "http://github.com/turntabl")
    println(david.termOfService)

    println(doreen hasSameTermOfService_? david)

    println(david TopGrade)



}



