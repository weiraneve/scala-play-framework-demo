package services

import play.api.MarkerContext
import repository.{HomeMessage, HomeRepository}

import javax.inject.Inject
import scala.concurrent.{ExecutionContextExecutor, Future}

class HomeService @Inject()(homeRepository: HomeRepository)(implicit ec: ExecutionContextExecutor) {

  def index(implicit mc: MarkerContext): Future[HomeMessage] = homeRepository.index()

}
