package controllers

import javax.inject.Inject

import play.api.mvc._

class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
  def index(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    Ok("Hello World!")
  }
}
