create table fournisseurs(
fid integer,
fnom varchar(30),
fad varchar(60),
primary key(fid));

create table articles(
aid integer,
anom varchar(30),
acoul varchar(15),
primary key(aid));

create table catalogue(
fid integer,
aid integer,
prix real,
foreign key(fid) references fournisseurs(fid),
foreign key(aid) references articles(aid));

---- attention: vous devrez determiner la longueur  pour les differents attributs du type varchar

INSERT INTO articles VALUES (1,'Left Handed Toaster Cover','rouge');
INSERT INTO articles VALUES (2,'Smoke Shifter End','noir');
INSERT INTO articles VALUES (3,'Acme Widget Washer','rouge');
INSERT INTO articles VALUES (4,'Acme Widget Washer','argente');
INSERT INTO articles VALUES (5,'Brake for Crop Circles Sticker','opaque');
INSERT INTO articles VALUES (6,'Anti-Gravity Turbine Generator','cyan');
INSERT INTO articles VALUES (7,'Anti-Gravity Turbine Generator','magenta');
INSERT INTO articles VALUES (8,'Fire Hydrant Cap','rouge');
INSERT INTO articles VALUES (9,'7 Segment Display','vert');
INSERT INTO articles VALUES (10,'Microsd Card USB Reader','vert');
INSERT INTO articles VALUES (11,'Ferrari F430','rouge');
INSERT INTO articles VALUES (12,'Microsd Card USB Reader','rouge');



-------------
INSERT INTO fournisseurs VALUES (1,'kiventout','59 rue du Chti, F-75001 Paris');
INSERT INTO fournisseurs VALUES (2,'Big Red Tool and Die','4 My Way, Bermuda Shorts, OR 90305, USA');
INSERT INTO fournisseurs VALUES (3,'Perfunctory Parts','99999 Short Pier, Terra Del Fuego, TX 41299, USA');
INSERT INTO fournisseurs VALUES (4,'Alien Aircaft Inc.','2 Groom Lake, Rachel, NV 51902, USA');
INSERT INTO fournisseurs VALUES (5,'Autolux','Piazza del Paris, 8, I-20121 Milano');

-----------
INSERT INTO catalogue VALUES (1,1,36.10);
INSERT INTO catalogue VALUES (1,2,42.30);
INSERT INTO catalogue VALUES (1,3,15.30);
INSERT INTO catalogue VALUES (1,4,20.50);
INSERT INTO catalogue VALUES (1,5,20.50);
INSERT INTO catalogue VALUES (1,6,124.23);
INSERT INTO catalogue VALUES (1,7,124.23);
INSERT INTO catalogue VALUES (1,8,11.70);
INSERT INTO catalogue VALUES (1,9,75.20);
INSERT INTO catalogue VALUES (2,1,16.50);
INSERT INTO catalogue VALUES (2,7,0.55);
INSERT INTO catalogue VALUES (2,8,7.95);
INSERT INTO catalogue VALUES (3,8,12.50);
INSERT INTO catalogue VALUES (3,9,1.00);
INSERT INTO catalogue VALUES (4,4,57.3);
INSERT INTO catalogue VALUES (4,5,22.20);
INSERT INTO catalogue VALUES (4,8,48.6);
INSERT INTO catalogue VALUES (5,11,234555.67);
