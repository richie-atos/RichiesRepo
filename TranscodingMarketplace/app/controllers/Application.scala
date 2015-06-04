package controllers

import play.api._
import play.api.mvc._

class Application extends Controller {

  val myObj:String = "";
  
  def index() = Action {
    if(myObj == "")
    {
      println("sdfsdf");
    }
    
    Ok(views.html.index("Your new application is ready."))
  }

  def testMethod() = Action {
    Ok(views.html.index("My test 3 output..."))
  }
    
}
