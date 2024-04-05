package controllers

import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter
import play.api.routing.sird.*

import javax.inject.Inject

class Router @Inject()(controller: HomeController) extends SimpleRouter {

  override def routes: Routes = {
    case GET(p"/") =>
      controller.index
  }
}
