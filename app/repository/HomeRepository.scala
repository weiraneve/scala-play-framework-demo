package repository

import org.apache.pekko.actor.ActorSystem
import play.api.MarkerContext
import play.api.libs.concurrent.CustomExecutionContext

import javax.inject.{Inject, Singleton}
import scala.concurrent.Future

final case class HomeMessage(content: String)

class HomeExecutionContext @Inject()(actorSystem: ActorSystem) extends CustomExecutionContext(actorSystem, "repository.dispatcher")

trait HomeRepository {
  def index()(implicit mc: MarkerContext): Future[HomeMessage]
}

@Singleton
class HomeRepositoryImpl @Inject()()(implicit ec: HomeExecutionContext) extends HomeRepository {

  override def index()(implicit mc: MarkerContext): Future[HomeMessage] = {
    Future {
      HomeMessage("Hello World!")
    }
  }

}