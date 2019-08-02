import scala.io.Source

//if(args.length>0){
//for( line <-  Source.fromFile(args(0)).getLines())
//println(line.length + " " + line)
//} 
//else
//	Console.err.println("No file found!")

def maxLength (line1:Int,line2:Int):Int=if(line1>line2) line1 else line2
var lines=Source.fromFile(args(0)).getLines().toList
var max =lines.map(l=>l.length).reduceLeft(maxLength)
Console println max

