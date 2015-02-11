package controllers

import java.io.{PrintWriter, File}

import models.Animal
import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Hello Samrat!!! hello hello"))
  }

  def list = Action {
    val animals = Animal.findAll
//    val writer = new PrintWriter("/home/samrat/test.txt")
//    for(x <- animals){
//      writer.write(x.name)
//    }
//    writer.close()

    Ok(views.html.animalList(animals))
//    Ok("")
  }

}