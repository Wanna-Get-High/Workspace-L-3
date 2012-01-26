-- il n'y a que la 13 que je n'ai pas trouve sinon tout me semble correct

-- Q1 --
select aid 
from articles
where aid not in (	select aid 
					from catalogue);
					
-- Q2 --
select fid 
from fournisseurs
where fid not in (	select fid 
					from catalogue);
-- Q3 --
select acoul 
from articles
where not exists (	select aid 
					from catalogue);
-- Q4 --
select *
from catalogue 
where fid not in ( 	select fid
					from fournisseurs);
-- Q5 --
select *
from catalogue 
where aid not in ( 	select aid
					from articles);
-- Q6 --
select aid
from articles
where aid in (	select aid
				from catalogue 
				where prix > 100);
-- Q7 --
select distinct anom
from articles
where aid in (	select aid
				from catalogue
				where fid = ( 	select fid
								from fournisseurs
								where fnom = 'kiventout'));
-- Q8 --
select aid 
from articles as a
where a.aid in (select c.aid
				from catalogue as c
				where aid in (	select c1.aid
								from catalogue as c1
								where c.aid = c1.aid and c.fid <> c1.fid));
-- Q9 --
select distinct a1.anom
from articles as a1
where exists (	select a2.aid
				from articles as a2
				where a1.anom = a2.anom
				and a2.aid <> a1.aid
				and a1.acoul = 'vert' 
				and a2.acoul ='rouge');
					 
-- Q10 --
select a1.aid
from articles as a1
where a1.anom not in ( 	select a2.anom
						from articles as a2 
						where a2.acoul = 'vert')
and a1.acoul = 'rouge';

-- Q11 --
select a1.anom
from articles as a1
where a1.anom not in ( 	select a2.anom
						from articles as a2 
						where a2.acoul <> 'rouge');

-- Q12 -- v1
select distinct c.aid
from catalogue as c
where c.fid in (select f.fid	
				from fournisseurs as f
				where fad like '%USA');

-- Q12 -- v2	
select distinct c.aid
from catalogue c 
where exists (	select * 
				from fournisseurs f
      			where f.fid=c.fid and  fad like '%USA')
and not exists (select * 
				from fournisseurs f
    			where f.fid=c.fid and  fad not like '%USA');
-- Q13 --                                                            ???????????????????????
select c.fid
from catalogue as c
where c.aid in (select a.aid
				from articles as a
				where acoul = 'rouge');
-- Q14 --                                                            
select distinct c.fid 
from catalogue as c
where not exists (	select  f.fid
					from fournisseurs as f, (select aid from articles) as artrouge
					where f.fid  = c.fid 
					and not exists (select fid, aid
									from Catalogue as c2
									where f.fid = c2.fid
									and artrouge.aid = c2.aid));
-- Q15 --                                                           
select distinct c.fid 
from catalogue as c
where not exists (	select  f.fid
					from fournisseurs as f, (select aid from articles where acoul = 'rouge') as artrouge
					where f.fid  = c.fid 
					and not exists (select fid, aid
									from Catalogue as c2
									where f.fid = c2.fid
									and artrouge.aid = c2.aid));
-- Q16 -- 
select c1.fid, c1.aid
from catalogue as c1
where not exists (	select c2.fid
					from catalogue as c2
					where c1.fid <> c2.fid and c1.aid = c2.aid);
