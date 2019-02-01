package controllers

import java.time.OffsetDateTime
import javax.inject._
import play.api.mvc._
import play.api.data._
// import play.api.data.Form
// import play.api.data.Froms._
import play.api.i18n._
import play.api.i18n.I18nSupport
import play.api.i18n.Messages
import play.api.i18n.MessagesApi
import play.api.libs.json.Json
import models.{Post,Meta,Response}
// import repositories.PostRepository

class PostsController @Inject()(val messagesApi: MessagesApi) extends Controller with I18nSupport {
  def get = Action {implicit request =>
    // Ok(Json.toJson(Response(Meta(200), Some(Json.obj("posts"->Json.toJson(PostRepository.findAll))))))
    Ok(Json.toJson(Post("10001","aaadd","Hello World",3)))
  }
}
