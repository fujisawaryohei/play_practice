package models

import java.time.OffsetDateTime
import play.api.libs.json.Json
import play.api.libs.json.JsValue
import play.api.libs.json.Writes

case class Post(id: String,
                user_id: String,
                text: String,
                comment_count: Int)
                // posted_at: OffsetDateTime)

object Post {
  implicit val writes :Writes[Post] =
    new Writes[Post] {
      def writes(post: Post) =
        Json.obj(
          "id"-> post.id,
          "user_id"-> post.user_id,
          "text"-> post.text,
          "comment_count"-> post.comment_count
          // "posted_at"-> post.posted_at
        )
    }
}

case class Meta(status: Int, errorMessage: Option[String] = None)

object Meta {
  implicit val writes :Writes[Meta] =
    new Writes[Meta] {
      def writes(meta: Meta) =
        Json.obj("status"-> meta.status, "errorMessage"-> meta.errorMessage)
    }
}

case class Response(meta: Meta,data: Option[JsValue] = None)

object Response {
  implicit val writes :Writes[Response] =
    new Writes[Response] {
      def writes(response: Response) =
        Json.obj("meta"-> response.meta, "data"-> response.data)
    }
}
