package repositories

import models.Post
import scalikejdbc._
import scalikejdbc.jsr310._

object PostRepository {
  def findAll: Seq[Post] = DB readOnly { implicit session =>
    sql"SELECT id, user_id, text, comment_count, posted_at FROM posts"
    .map { rs =>
      Post(
        rs.String("id"),
        rs.String("user_id"),
        rs.String("text"),
        rs.Int("comment_count"),
        rs.String("posted_at")
      )
    }
    .list()
    .apply
  }
}
