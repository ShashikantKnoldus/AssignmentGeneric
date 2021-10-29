package edu.knoldus

import org.scalatest.flatspec.AnyFlatSpec
import scala.language.postfixOps

class Test extends AnyFlatSpec {
  val S = new EmptyStack[Int]
  val S1: Stack[Int] = S.push(5).push(10)
  val S2 = new NonEmptyStack[Int](6, S1)
  val S3 = new NonEmptyStack[Int](12,S2)

  //Test cases of isEmpty
  "isEmpty function for EmptyStack " should "return true " in {
    assert(S.isEmpty==true)
  }

  "isEmpty function for NonEmptyStack " should "return false" in {
    assert(S1.isEmpty==false)
  }

  //Test cases of EmptyStack
  //Test case of push
  "If we push 5 and 10  in S1  " should "return  top as 10 " in {
    assert(S1.top == 10)
  }

  //Test cases of Top

  "top of S1 " should "give 10" in {
    assert(S1.top == 10)
  }

  //Test case of pop
 "If we pop from S1 " should "remove top " in {
 assert(S1.pop.top == 5)
  }

  //Test cases of NonEmptyStack
  //Test case of push
  "If we push 12  in S2  " should "return  top as 12" in {
    assert(S3.top == 12)
  }
  //Test cases of Top

  "top of S3 " should "give 12" in {
    assert(S3.top == 12)
  }

  //Test case of pop
  "If we pop from S3 " should "remove top " in {
    assert(S3.pop.top == 6)
  }
}