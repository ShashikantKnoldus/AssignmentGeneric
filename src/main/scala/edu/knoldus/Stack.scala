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

class NonEmptyStack[A](element: A, remainStack: Stack[A]) extends Stack[A] {
  def isEmpty = false
  def top = element
  def pop = remainStack
}
