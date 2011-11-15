/*
-- Q1 --
select e.e_id
from etudiants as e
where exists (	select p.e_id 
				from participer as p
				where p.e_id = e.e_id
				and c_id in ( select c_id
								from cours 
								where horaire like '%Lu%'));
-- Q2 --
select titre
from cours
where c_id in ( select c_id
				from participer
				where e_id in (	select e_id 
								from etudiants
								where programme='Informatique'));
-- Q3 --
select titre
from cours
where c_id in ( select c_id
				from participer
				where e_id in (	select e_id 
								from etudiants
								where programme <> 'Informatique'))
and titre in ('Conception de Systemes d Exploitation','Reseaux de communication',
				'Structures de Donnees','Systemes de Bases de Donnees',
				'Intelligence artificielle','Introduction a l Algebre Lineaire');
-- Q4 --
select niveau, avg(age) as "age moyen", count(*) as "nb etudiants"
from etudiants
group by niveau
order by niveau;
 
-- Q5 --
select e_nom 
from etudiants
where niveau = 'Licence 3'
and e_id in (	select e_id
				from participer
				where c_id in (	select c_id
								from cours
								where prof_id in (	select prof_id
													from profs
													where prof_nom like 'I.%Boulala')));

-- Q6 --
select max(age) as "plus vieux à"
from etudiants
where programme ='Histoire'
or e_id in ( select e_id
				from participer
				where c_id in (	select c_id
								from cours
								where prof_id in (	select prof_id
													from profs
													where prof_nom like 'I.%Boulala')));
-- Q7 --
select e_nom
from etudiants
where e_id in (	select p.e_id 
				from participer as p
				where exists ( 	select c1.c_id
								from cours as c1													
								inner join cours as c2
								on c1.horaire = c2.horaire
								and c1.c_id <> c2.c_id
								and p.c_id = c1.c_id));			
-- Q8 -- technique 1
select e_nom
from etudiants as e
where not exists ( 	select e_id
					from participer as p
					where p.e_id = e.e_id)
order by e_nom;
					

-- Q8 -- technique 2
select e_nom
from etudiants
where e_id not in ( select e_id
					from participer)
order by e_nom;
-- Q8 -- technique 3                                
select e_nom
from etudiants
intersect
select e_nom
from etudiants
where e_id not in ( select e_id
					from participer)
order by e_nom;
-- Q9 --											?????????????????
select prof_nom
from profs as p
where not exists (	select c_id
					from cours as c
					where p.prof_id = c.prof_id );
-- Q10 --
select niveau, avg(age) as "age moyen"
from etudiants
where niveau <> 'Licence 1'
group by niveau
order by niveau;
-- Q11 --
select c.titre
from cours as c
where salle = 'R128'
or (select count(*) 
	from participer as p 
	where c.c_id = p.c_id) = 5;

-- Q12 --                                       ???? manque le count ?????
select p.prof_id, p.prof_nom
from profs as p
where exists (	select *
				from cours as c1
				where c1.prof_id = p.prof_id 
				and c1.salle = 'R128')
and not exists (select *
				from cours as c2
				where c2.prof_id = p.prof_id 
				and c2.salle <> 'R128');
				
-- Q13 --
create view nb_cour_par_etu as 
select e.e_nom, count(p) as nb_cour
from etudiants as e, participer as p
where e.e_id = p.e_id
group by e.e_nom;

select e.e_nom
from etudiants as e, participer as p
where e.e_id = p.e_id
group by e.e_nom
having count(p.c_id) = (select max(nb_cour) from nb_cour_par_etu);

drop view nb_cour_par_etu;

-- Q14 --
select e.e_nom
from etudiants as e
where e.e_id in (	select p.e_id
					from participer as p
					where e.e_id = p.e_id
					and exists (select * 
								from cours as c
								where p.c_id = c.c_id
								and horaire not like '%Lu%')
				except
					select p.e_id
					from participer as p
					where e.e_id = p.e_id
					and exists (select * 
								from cours as c
								where p.c_id = c.c_id
								and horaire like '%Lu%'));
								
-- Q15 --                                              ???????   rep logic mais comprend pas rep <>   ????????

create view nb_etu_par_cour as
select c.c_id as cid, count(e) as nb_etu
from cours as c, etudiants as e
where c.c_id in (	select p.c_id
					from participer as p
					where p.e_id = e.e_id)
group by c.c_id;

select sum(nb_etu) as avg_student
from nb_etu_par_cour;

--drop view nb_etu_par_cour;*/

-- Q16 --
--create view nb_etu_par_cour as
select c.c_id as cid, count(e) as nb_etu
from cours as c, etudiants as e
group by c.c_id
order by c.c_id;

select sum(nb_etu) as avg_student
from nb_etu_par_cour;


/*select avg(nb_etu) as avg_student
from nb_etu_par_cour;*/

--drop view nb_etu_par_cour;









