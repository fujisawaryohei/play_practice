#Comment shcema

# -- !Ups

CREATE TABLE comments (
 id varchar(36) NOT NULL,
 user_id varchar(36) NOT NULL,
 text varchar(255) NOT NULL,
 parent_post_id varchar(36) NOT NULl,
 comment_count Int,
 posted_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
);

# --- !Downs

DROP TABLE IF EXIST comments;
