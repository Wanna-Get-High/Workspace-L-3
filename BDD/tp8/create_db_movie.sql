drop table interpretation;
drop table movie;
drop table artist;

create table movie
(
	m_id integer primary key,
	title varchar(30),
	myear integer,
	type varchar(20),
	director varchar(30)
);

create table artist
(
	name varchar(30) primary key,
	date_birth integer,
	place_birth varchar(30)
);

create table interpretation
(
	m_id integer,
	actor varchar(30),
	role varchar(20),
	protagonist bit(1),
	primary key(m_id,actor),
	foreign key(m_id) references movie(m_id),
	foreign key(actor) references artist(name)
);

insert into artist values ('Dany Boon',1975,'Lille');
insert into artist values ('Melissa Theuriau',1980,'Nice');
insert into artist values ('Jean Reno',1967,'Monpelier');
insert into artist values ('Bourville',1936,'Bruxelle');
insert into artist values ('Harrison Ford',1958,'New York');
insert into artist values ('Mia Frye',1969,'Paris');
insert into artist values ('Bruce Willis',1954,'Los Angeles');
insert into artist values ('Elijah Wood',1978,'Washington DC');
insert into artist values ('Viggo Mortensen',1963,'Los Angeles');
insert into artist values ('Franscesco de la Vega',1990,'Lille');


insert into movie values (0,'Bienvenue chez les chti',2010,'comique','Dany Boon');
insert into movie values (1,'Le Cinquieme Element',2003,'comique,Action','Luc Besson');
insert into movie values (2,'Star Wars',1980,'sci-fi','George Lucas');
insert into movie values (3,'LOTR',2000,'Aventure','Peter Jackson');
insert into movie values (4,'My Movie',2011,'comique','Franscesco de la Vega');
insert into movie values (5,'Final Fantasy',2005,'Animation','Bobelidle');
insert into movie values (6,'Leon',1986,'Action','Luc Besson');


insert into interpretation values (0,'Dany Boon','Dany Boon','1');
insert into interpretation values (0,'Melissa Theuriau','Dany Boons wife','0');
insert into interpretation values (0,'Franscesco de la Vega','a guy','0');

insert into interpretation values (1,'Bruce Willis','Korben Dallas','1');
insert into interpretation values (1,'Mia Frye','extra','0');
insert into interpretation values (1,'Franscesco de la Vega','a guy','0');

insert into interpretation values (2,'Harrison Ford','Yan Solo','1');
insert into interpretation values (2,'Bruce Willis','a guy','0');
insert into interpretation values (2,'Melissa Theuriau','the guys girlfriend','0');
insert into interpretation values (2,'Elijah Wood','a serial killer','0');
insert into interpretation values (2,'Franscesco de la Vega','a guy','0');

insert into interpretation values (3,'Elijah Wood','Frodo','1');
insert into interpretation values (3,'Viggo Mortensen','Aragorn','1');
insert into interpretation values (3,'Franscesco de la Vega','a guy','0');

insert into interpretation values (4,'Harrison Ford','Boby','1');
insert into interpretation values (4,'Dany Boon','the strangers','0');
insert into interpretation values (4,'Melissa Theuriau','Bobys stool pigeon','0');
insert into interpretation values (4,'Jean Reno','Bobys opponent','1');
insert into interpretation values (4,'Bourville','Bourville','0');
insert into interpretation values (4,'Mia Frye','Bourville girlfriend','0');
insert into interpretation values (4,'Bruce Willis','the military','0');
insert into interpretation values (4,'Franscesco de la Vega','a guy','0');

insert into interpretation values (5,'Franscesco de la Vega','a guy','0');

insert into interpretation values (6,'Jean Reno','Leon','1');
insert into interpretation values (6,'Franscesco de la Vega','a guy','0');

