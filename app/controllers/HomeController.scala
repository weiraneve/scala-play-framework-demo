package controllers

import play.api.MarkerContext
import play.api.libs.json.Json
import play.api.mvc.*
import services.HomeService

import javax.inject.Inject
import scala.concurrent.ExecutionContext


class HomeController @Inject()(val controllerComponents: ControllerComponents, homeService: HomeService)(
  implicit ec: ExecutionContext) extends BaseController {

  def index: Action[AnyContent] = Action.async { implicit request =>
    homeService.index.map { message =>
      Ok(Json.toJson(message.content))
    }
  }
}
