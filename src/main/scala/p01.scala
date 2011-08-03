package   oluies.testingrex

import com.digitaldoodles.rex._
// This imports a single (as of Rex 0,7) implicit conversion that allows        strings to be used
// as literals in Rex expressions.
import com.digitaldoodles.rex.Implicits._
// This imports objects that contain further predefined patterns; see the API   documentation for details.
import com.digitaldoodles.rex.patterns._


object regexwithREX extends App {
      println("Hello, World!")
      println("a" *> 3 !~~= "aa")

}
