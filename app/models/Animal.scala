package models

import java.awt.Color



/**
 * Created by samrat on 2/10/15.
 */
case class Animal (name: String, color: String, age: Long, description: String)

object Animal{
  var animals = Set(
  Animal("Cow","black", 32, "It's big."),
  Animal("Cat", "white", 31, "It's mediam."),
  Animal("Goat", "green", 22, "It's smallest."),
  Animal("Dog", "yellow", 25, "It's smaller")
  )

  def findAll = animals.toList.sortBy(_.age)
}
