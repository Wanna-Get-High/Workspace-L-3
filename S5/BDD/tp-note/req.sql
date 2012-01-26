/*
	Francois Lepan
*/
drop table interpretation;
drop table movie;
drop table artist;

/*
	vehicule(immat,marque,type,portee);
*/
create table vehicule
(
	immat varchar(9) primary key,
	marque varchar(30) not null,
	type varchar(30) not null,
	portee integer not null
);

/*
	conducteur(cid,num_secu,nom,prenom,date_naiss);
*/
create table conducteur
(
	cid integer primary key,
	num_secu integer unique,
	nom varchar(30),
	prenom varchar(30)
	date_naiss date
);

/*
	voyage(vid,descr,dep,date_dep,arr,date_arr,immat);
*/
create table voyage
(
	vid integer primary key,
	descr varchar(30),
	dep varchar(20),
	date_dep date,
	arr varchar(20),
	date_arr date,
	immat varchar(8),
	foreign key(immat) references conducteur(immat)
);

/*
	voycond(vid,cid);
*/
create table voycond
(
	vid integer,
	cid integer,
	foreign key(vid) references voyage(vid),
	foreign key(cid) references conducteur(cid)
);


-- Q5 --
insert into vehicule values ('536DJG54','Mercedes','class A',650);
insert into vehicule values ('AB344BA65','Peugeot','807',800);
insert into vehicule values ('347CBC59','Clio','2 type 1',700);
insert into vehicule values ('AA123AA23','Renault','Megane',200);

insert into conducteur values (1,123456789012345,'Fox','Megane','1981-03-24');
insert into conducteur values (2,968574123659874,'Biloute','brown','1965-06-15');
insert into conducteur values (3,351469852667482,'Bill','Bob','1990-05-07');


insert into voyage values (1,'Egypte pays de tout...','Paris','2012-05-07 11:45:00','Le Caire','2012-05-07 17:15:00','536DJG54');
insert into voyage values (2,'Lille ...','Paris','2012-03-07 11:45:00','Lille','2012-03-07 12:45:00','347CBC59');
insert into voyage values (3,'Egypte pays de tout...','Bordeaux','2012-06-07 11:45:00','Marseille','2012-06-07 18:45:00','AB344BA65');
insert into voyage values (4,'Renne ...','Lille','2012-06-07 09:40:00','Renne','2012-07-07 11:45:00','AA123AA23');

insert into voycond values (1,3);
insert into voycond values (1,2);
insert into voycond values (2,1);
insert into voycond values (3,3);
insert into voycond values (4,1);
insert into voycond values (4,3);

-- Q6 --
insert into voycond values (4,nul);
insert into voyage values (1,'Egypte pays de tout...','Paris','2012-05-07 11:45:00','Le Caire','2012-05-07 17:15:00','salut');
insert into vehicule values ('536DJG54','Mercedes','class A','bonjour');

