#Post schema

# --- !Ups
CREATE TABLE posts (
    id varchar(36) NOT NULL,
    user_id varchar(36) NOT NULL,
    text varchar(255) NOT NULL,
    comment_count Int,
    posted_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
);

# --- !Downs

DROP TABLE IF EXISTS posts;
