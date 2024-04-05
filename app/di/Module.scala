package di

import com.google.inject.AbstractModule
import net.codingwell.scalaguice.ScalaModule
import play.api.{Configuration, Environment}
import repository.{HomeRepository, HomeRepositoryImpl}

import javax.inject.Singleton

class Module(environment: Environment, configuration: Configuration)
  extends AbstractModule
    with ScalaModule {

  override def configure(): Unit = {
    bind[HomeRepository].to[HomeRepositoryImpl].in[Singleton]()
  }
}
