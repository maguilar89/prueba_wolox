create database prueba_wolox
	with owner postgres;

CREATE TABLE "public"."album" (
"id" serial,
"user_id" int4,
"title" varchar COLLATE "default",
CONSTRAINT "album_pk" PRIMARY KEY ("id")
)
WITH (OIDS=FALSE);
ALTER TABLE "public"."album" OWNER TO "postgres";


CREATE TABLE "public"."comment" (
"id" serial,
"post_id" int4,
"name" varchar COLLATE "default",
"email" varchar COLLATE "default",
"body" varchar COLLATE "default",
CONSTRAINT "comment_pk" PRIMARY KEY ("id")
)
WITH (OIDS=FALSE);
ALTER TABLE "public"."comment" OWNER TO "postgres";


CREATE TABLE "public"."photo" (
"id" serial,
"album_id" int4,
"title" varchar COLLATE "default",
"url" varchar COLLATE "default",
"thumbnail_url" varchar COLLATE "default",
CONSTRAINT "photo_pk" PRIMARY KEY ("id")
)
WITH (OIDS=FALSE);
ALTER TABLE "public"."photo" OWNER TO "postgres";


CREATE TABLE "public"."user" (
"id" serial,
"name" varchar COLLATE "default",
"username" varchar COLLATE "default",
"email" varchar COLLATE "default",
"street" varchar COLLATE "default",
"suite" varchar COLLATE "default",
"city" varchar COLLATE "default",
"zipcode" varchar COLLATE "default",
"lat" varchar COLLATE "default",
"lng" varchar COLLATE "default",
"phone" varchar COLLATE "default",
"website" varchar COLLATE "default",
"name_company" varchar COLLATE "default",
"catch_phrase" varchar COLLATE "default",
"bs" varchar COLLATE "default",
CONSTRAINT "user_pk" PRIMARY KEY ("id")
)
WITH (OIDS=FALSE);
ALTER TABLE "public"."user" OWNER TO "postgres";