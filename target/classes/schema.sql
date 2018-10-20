CREATE TABLE "advertisement" (
	"id" serial NOT NULL,
	"applier_id" bigint NOT NULL,
	"vehicle_id" bigint NOT NULL,
	"city_id" bigint NOT NULL,
	"currency_id" bigint NOT NULL,
	"date" TIMESTAMP NOT NULL,
	"price" float8 NOT NULL,
	"description" varchar(2000),
	"last_update" TIMESTAMP,
	"label" varchar NOT NULL,
	"seen_count" int4,
	"status" smallint NOT NULL,
	"is_active" numeric(1) NOT NULL DEFAULT '1',
	"owner_id" bigint NOT NULL,
	CONSTRAINT advertisement_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "shafag_users" (
	"id" serial NOT NULL,
	"name" varchar(32) NOT NULL,
	"surname" varchar(32) NOT NULL,
	"username" varchar(32) NOT NULL,
	"email" varchar(64) NOT NULL,
	"is_active" numeric(1) NOT NULL DEFAULT '1',
	"password" varchar(15) NOT NULL,
	"role_id" int NOT NULL,
	CONSTRAINT users_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "vehicle" (
	"id" serial NOT NULL,
	"brand_id" bigint NOT NULL,
	"model_id" bigint NOT NULL,
	"year" numeric(4),
	"millage" int8,
	"gearbox_id" bigint NOT NULL,
	"differential_id" bigint NOT NULL,
	"color_id" bigint NOT NULL,
	"new" numeric(1) NOT NULL,
	"fuel_type_id" bigint NOT NULL,
	"horse_power" smallint,
	"engine" float4,
	"body_type_id" bigint NOT NULL,
	CONSTRAINT vehicle_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "brands" (
	"id" serial NOT NULL,
	"name" varchar(32) NOT NULL,
	"label" varchar(32) NOT NULL,
	"is_active" numeric(1) NOT NULL DEFAULT '1',
	CONSTRAINT brands_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "models" (
	"id" serial NOT NULL,
	"name" varchar(32) NOT NULL,
	"label" varchar(32) NOT NULL,
	"brand_id" bigint NOT NULL,
	"is_active" numeric(1) NOT NULL DEFAULT '1',
	CONSTRAINT models_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "cities" (
	"id" serial NOT NULL,
	"name" varchar(32) NOT NULL,
	"label" varchar(32) NOT NULL,
	"is_active" numeric(1) NOT NULL DEFAULT '1',
	CONSTRAINT cities_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "currency" (
	"id" serial NOT NULL,
	"name" varchar(5) NOT NULL,
	"label" varchar(5) NOT NULL,
	"is_active" numeric(1) NOT NULL DEFAULT '1',
	CONSTRAINT currency_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "gearbox" (
	"id" serial NOT NULL,
	"name" varchar(16) NOT NULL,
	"label" varchar(16) NOT NULL,
	"is_active" numeric(1) NOT NULL DEFAULT '1',
	CONSTRAINT gearbox_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "differential" (
	"id" serial NOT NULL,
	"name" varchar(16) NOT NULL,
	"label" varchar(16) NOT NULL,
	"is_active" numeric(1) NOT NULL DEFAULT '1',
	CONSTRAINT differential_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "fuel_type" (
	"id" serial NOT NULL,
	"name" varchar(16) NOT NULL,
	"label" varchar(16) NOT NULL,
	"is_active" numeric(1) NOT NULL DEFAULT '1',
	CONSTRAINT fuel_type_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "body_type" (
	"id" serial NOT NULL,
	"name" varchar(16) NOT NULL,
	"label" varchar(16) NOT NULL,
	"is_active" numeric(1) NOT NULL DEFAULT '1',
	CONSTRAINT body_type_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "color" (
	"id" serial NOT NULL,
	"name" varchar(16) NOT NULL,
	"label" varchar(16) NOT NULL,
	"is_active" numeric(1) NOT NULL DEFAULT '1',
	CONSTRAINT color_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "pictures" (
	"id" serial NOT NULL,
	"path" varchar(256) NOT NULL,
	"is_active" numeric(1) NOT NULL DEFAULT '1',
	"vehicle_id" bigint NOT NULL,
	"file_type" varchar(7) NOT NULL,
	CONSTRAINT pictures_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "owners" (
	"id" serial NOT NULL,
	"name" varchar(32) NOT NULL,
	"email" varchar(64) NOT NULL,
	"is_active" numeric(1) NOT NULL DEFAULT '1',
	"phone_number" varchar(16) NOT NULL,
	"phone_number1" varchar(16) NOT NULL,
	CONSTRAINT owners_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "vehicle_specs" (
	"id" serial NOT NULL,
	"vehicle_id" bigint NOT NULL,
	"specs_id" bigint NOT NULL,
	CONSTRAINT vehicle_specs_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "specs" (
	"id" serial NOT NULL,
	"name" varchar(32) NOT NULL,
	"label" varchar(64) NOT NULL,
	"is_active" numeric(1) NOT NULL DEFAULT '1',
	CONSTRAINT specs_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "roles" (
	"id" serial NOT NULL,
	"name" varchar(10) NOT NULL,
	CONSTRAINT roles_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



ALTER TABLE "advertisement" ADD CONSTRAINT "advertisement_fk0" FOREIGN KEY ("applier_id") REFERENCES "shafag_users"("id");
ALTER TABLE "advertisement" ADD CONSTRAINT "advertisement_fk1" FOREIGN KEY ("vehicle_id") REFERENCES "vehicle"("id");
ALTER TABLE "advertisement" ADD CONSTRAINT "advertisement_fk2" FOREIGN KEY ("city_id") REFERENCES "cities"("id");
ALTER TABLE "advertisement" ADD CONSTRAINT "advertisement_fk3" FOREIGN KEY ("currency_id") REFERENCES "currency"("id");
ALTER TABLE "advertisement" ADD CONSTRAINT "advertisement_fk4" FOREIGN KEY ("owner_id") REFERENCES "owners"("id");

ALTER TABLE "shafag_users" ADD CONSTRAINT "users_fk0" FOREIGN KEY ("role_id") REFERENCES "roles"("id");

ALTER TABLE "vehicle" ADD CONSTRAINT "vehicle_fk0" FOREIGN KEY ("brand_id") REFERENCES "brands"("id");
ALTER TABLE "vehicle" ADD CONSTRAINT "vehicle_fk1" FOREIGN KEY ("model_id") REFERENCES "models"("id");
ALTER TABLE "vehicle" ADD CONSTRAINT "vehicle_fk2" FOREIGN KEY ("gearbox_id") REFERENCES "gearbox"("id");
ALTER TABLE "vehicle" ADD CONSTRAINT "vehicle_fk3" FOREIGN KEY ("differential_id") REFERENCES "differential"("id");
ALTER TABLE "vehicle" ADD CONSTRAINT "vehicle_fk4" FOREIGN KEY ("color_id") REFERENCES "color"("id");
ALTER TABLE "vehicle" ADD CONSTRAINT "vehicle_fk5" FOREIGN KEY ("fuel_type_id") REFERENCES "fuel_type"("id");
ALTER TABLE "vehicle" ADD CONSTRAINT "vehicle_fk6" FOREIGN KEY ("body_type_id") REFERENCES "body_type"("id");


ALTER TABLE "models" ADD CONSTRAINT "models_fk0" FOREIGN KEY ("brand_id") REFERENCES "brands"("id");








ALTER TABLE "pictures" ADD CONSTRAINT "pictures_fk0" FOREIGN KEY ("vehicle_id") REFERENCES "vehicle"("id");


ALTER TABLE "vehicle_specs" ADD CONSTRAINT "vehicle_specs_fk0" FOREIGN KEY ("vehicle_id") REFERENCES "vehicle"("id");
ALTER TABLE "vehicle_specs" ADD CONSTRAINT "vehicle_specs_fk1" FOREIGN KEY ("specs_id") REFERENCES "specs"("id");


CREATE TABLE engine (
  id SERIAL NOT NULL PRIMARY KEY ,
  label VARCHAR (5) NOT NULL,
  volume VARCHAR (5) NOT NULL
)

CREATE