/*
	chose a revoir :
	dans votre base vous n'avez aucune cle primaire et pour la table avions il y a 2 avions avec la meme "cle primaire"
	incoherence entre le fichier resultat et ce qui est demande
*/

-- Q1 --  
--votre reponse c'est pour un pilote certifie sur au moin 2 avions 
--pour plus de 3 avion il faudrait mettre > 3 au lieu de >1

select c1.eid, max(a.portee)
from certifications as c1, avions as a
where c1.aid = a.aid
group by c1.eid
having (select count(c2.aid)
		from certifications as c2
		where c1.eid = c2.eid) > 3;

-- Q2 --
select enom
from employes
where salaire < (	select min(prix)
					from vols 
					where dep = 'CDG'
					and arr = 'NOU' );
-- Q3 --
-- j'ai verifier la base de donnee et il y a bien un employe : (567354612,'Laura Giacco',256481) gagnant > 100000 
-- qui est certifie sur un avion (567354612,1) qui peut parcourir > 7484 km (1,'Boeing 747-400',8430);
-- donc j'ai 2 lignes de plus que vous. (avec la base que vous donnez)
select v.dep, v.arr, v.distance
from vols as v
where exists (	select a.portee
				from avions as a
				where v.distance < a.portee
				and exists (select c.aid
							from certifications as c
							where a.aid = c.aid
							and exists (select e.eid
										from employes as e 
										where c.eid = e.eid
										and salaire > 100000)));
-- Q4 --
select e.enom 
from employes as e
where exists (	select c.eid
				from certifications as c
				where e.eid = c.eid
				and exists (select a.aid
							from avions as a
							where a.aid = c.aid
							and a.portee > 1500)
			except
				select c.eid
				from certifications as c
				where e.eid = c.eid
				and exists (select a.aid
							from avions as a
							where a.aid = c.aid
							and a.portee < 1500))
order by e.enom;
-- Q5 --
--question super bien pose
--"pour au moins deux tels avions" --> et qui en pilotes au moins 2

-- Q6 --
-- le resultat que vous proposez est pour Boeing mais vous demandez pour Airbus...
select e.enom 
from employes as e
where exists (	select c.eid
				from certifications as c
				where e.eid = c.eid
				and exists (select a.aid
							from avions as a
							where a.aid = c.aid
							and a.anom like 'Airbus%'
							and a.portee > 1500)
			except
				select c.eid
				from certifications as c
				where e.eid = c.eid
				and exists (select a.aid
							from avions as a
							where a.aid = c.aid
							and a.portee < 1500))
order by e.enom;

-- Q7 --
select enom, eid 
from employes
group by enom, eid, salaire
having salaire = (	select max(salaire)
					from (	select salaire
							from employes
						except 
							select max(salaire)
							from employes) as s);
-- Q8 --
select e.eid, e.enom
from employes as e
where exists (	select c.eid
				from certifications as c
				where c.eid = e.eid
				and exists (select a.aid
							from avions as a
							where a.aid = c.aid
							and a.portee > 2000)
			except
				select c.eid
				from certifications as c
				where c.eid = e.eid
				and exists (select a.aid
							from avions as a
							where a.aid = c.aid
							and a.anom like 'Boeing%'));
-- Q9 --
-- j'ai verifie et il y a bien un employe non certifie qui gagne plus que la moyenne des pilotes.
select e.enom, e.salaire
from employes as e
where not exists (	select c.eid
					from certifications as c
					where c.eid = e.eid)
group by e.enom, e.salaire
having e.salaire > (select avg(salaire)
					from employes as e1
					where exists (	select c1.eid
									from certifications as c1
									where c1.eid = e1.eid));
-- Q10 --
select avg(e1.salaire) - avg(e.salaire) as difference
from employes as e, employes as e1
where exists (	select c.eid
				from certifications as c
				where c.eid = e1.eid);
