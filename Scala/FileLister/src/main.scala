import scala.io.Source

object main {
  def main(args: Array[String]) {
    //    var files = new java.io.File(args(0)).listFiles
    //
    //    def fileLines(file: java.io.File) = Source.fromFile(file).getLines().toList
    //    //files.filter(f=>f.getName().endsWith(".scala")).foreach(println)
    //    var result = List[String]()
    //    for (file <- files
    //         if file.getName().endsWith(".scala");
    //         line <- fileLines(file);
    //         if line.length > 30
    //         ) {
    //      result = (file.getName + "@" + line) :: result
    //    }
    //    result.foreach(println)
    val l = List("Trilece", "Ekler", "Sutlac", "Kabak Tatlisi")
    val p = List(12.0D, 8.3D, 14D, 16.5D)

    val zipped = l zip p
//    zipped.foreach(println)
    val flat = zipped.flatMap(data => List(data._1, data._2))

    val mapFlat = zipped.map(data => List(data._1, data._2)).flatMap(data => data).flatMap(data => data.toString)
    mapFlat.foreach(println)
    //flat.foreach(println)

  }

}
