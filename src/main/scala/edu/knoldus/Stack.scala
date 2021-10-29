package edu.knoldus

import scala.sys.error

trait Stack[A]{
  def push(x: A): Stack[A] = new NonEmptyStack[A](x, this)
  def isEmpty: Boolean
  def top: A
  def pop: Stack[A]

}

class EmptyStack[A] extends Stack[A] {
  def isEmpty = true
  def top = error("Stack is empty ")
  def pop = error("Stack is empty for pop")

}

class NonEmptyStack[A](elem: A, remain: Stack[A]) extends Stack[A] {
  def isEmpty = false
  def top = elem
  def pop = remain
}
object cnclk extends App{
  val x = new EmptyStack[Int]
  val y = x.push(1).push(2)
  println(y.isEmpty)
}