package io.turntabl.Function

class Function {

    val strLen: String
      => Int = (str: String)
    => str.length

  val spaceLen: String
    => Int = (str: String)
  => str.count( _ == ' ')

    val ApplyToString: (String,
      String => Int) =>
      Int = (str: String, func : String => Int)=> func(str)

  val calculate: String => (Int, Int)
    => Double = (instruction : String)
  => instruction.toUpperCase()
    match
    {
    case "ADD" => (A: Int, B: Int) => A + B
    case "MULTIPLY" => (A: Int, B: Int) => A * B
    case "DIVIDE" => (A: Int, B: Int) => A / B
    case "SUBTRACT" => (A: Int, B: Int) => A - B
    case "MODULO" => (A: Double, B: Double) => A % B
  }
  //unpacking tuple
val tuple2:(String , String) = ("David", "Scala")
  var name, favourite = tuple2
  def connect (name: String, favourite: String)
  tuple2 match {
    case (name, favourite) => connect(name, favourite)
  }
    //Map
      var countries: Map[String, String] = Map ("Ghana" -> "Accra",
                            "London" -> "UK", "China" -> "Benjin")
          countries += ("Afghanistan" -> "kabul", "Madagascar" -> "Antananarivo" )

  // Capacity for Norway
  val countries: Map[String, String] = Map ("Tunisia" -> "Tunis", "Rwanda" -> "Kigali")
  println(countries.getOrElse("Norway", "Unknown"))
  println(countries.getOrElse("Togo", "Unknown"))


  //friends names
      val names: Set[String ]= Set ( "Samuels", "doreen", "sam",  "Daviv", Samuels")
    println(names count( _ eq "Samuels"))

        //List of names
        val namesList = List( "Samuels", "Alexander", "Owuwsu", "Samuels", "Sam", "Doreen")
        namesList foreach (println)

        //Values more than six
        val namesList = List( "Samuels", "Alexander", "Owuwsu", "Samuels", "Sam", "Doreen")
        namesList  =foreach print (_.length > 6)
        println(namesList)

        //count more than six
        val namesList = List( "Samuels", "Alexander", "Owuwsu", "Samuels", "Sam", "Doreen")
        namesList  = count (_.length > 6)
        println(namesList)

        }