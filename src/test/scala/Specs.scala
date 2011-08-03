package oluies.rextest

import org.specs2.mutable._

// This imports the basic constructors and predefined patterns.
import com.digitaldoodles.rex._
// This imports a single (as of Rex 0,7) implicit conversion that allows strings to be used
// as literals in Rex expressions.
import com.digitaldoodles.rex.Implicits._
// This imports objects that contain further predefined patterns; see the API documentation for details.
import com.digitaldoodles.rex.patterns._

class regexwithREX extends Specification {

  "p01" should {
        "Fail because the pattern must match at least three a's" {
            "a" *> 3 !~~= "aa" must_== false
        }
    }
}
