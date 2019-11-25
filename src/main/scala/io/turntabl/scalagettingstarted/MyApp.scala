
package io.turntabl.scalagettingstarted

object MyApp extends App {
    print("Hello, World!\n")

    //string interoperability
    val first = "David"
    val Town = "Dansoman"
    print (s"$first was born in $Town\n")

    //threeTimes
    def threeTimes(msg : String) = msg * 3

    // Even method
    def even( a : Int) = if (a % 2 == 0) true else false

    // Odd method
    def odd( a : Int) = !even(a)

    //wordsToLower
    def wordsToLower(words: String*) = words map (_.toLowerCase)

    //even2
    def even2(i: Int) = i % 2 match{
        case 0 => true
        case 1 => false
    }

    //isweekendDay
    def isWeekendDay(day: String) = day.toLowerCase match {
        case "saturday" | "sunday" => true
        case _ => false
    }

        //ForEach
            def areWeekendDays( days : String*) = days map  (d =>isWeekendDay(d))

    // problem 10
   val check = areWeekendDays("Wednesday", "Friday", "Tuesday", "Monday")
     check foreach (println)

    //Number of times
    def nCount(a: String, b: Int) = print((a + " ") * b)
    nCount("hello", 3)
}
