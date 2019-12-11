DROP TABLE user CASCADE;
DROP TABLE quote CASCADE;


CREATE TABLE user (
	id BIGINT,
	create_time TIMESTAMP,
	modified_time TIMESTAMP,
	name TEXT,
	password TEXT,
	
	PRIMARY KEY (id)
);



CREATE TABLE quote (
	id BIGINT,
	create_time TIMESTAMP,
	modified_time TIMESTAMP,
	zitat TEXT,
   	creator_id BIGINT,
    author TEXT,
	
	PRIMARY KEY (id),
	FOREIGN KEY (creator_id) REFERENCES user (id)

);


