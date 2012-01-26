-- requete 1
select max(prix) as prixMax 
from catalogue;

-- requete 2
select anom, count(acoul) as nbCoul 
from articles 
group by anom;

-- requete 3
select acoul, count(anom) as nbArt 
from articles 
group by acoul 
order by acoul;

-- requete 4
select a.acoul,avg(c.prix) as avgPrice 
from articles as a
inner join catalogue as c
on c.aid=a.aid group by a.acoul order by avgPrice desc;

-- requete 5
select a.acoul,avg(c.prix) as avgPrice 
from articles as a
inner join catalogue as c
on c.aid=a.aid
where a.anom not like 'Ferrari%'
group by a.acoul 
having count(*) > 1
order by avgPrice desc;

-- requete 6
select a.anom,count(c.fid) as nbFourn 
from articles as a
inner join catalogue as c
on a.aid=c.aid
group by a.anom
order by nbFourn desc;

-- requete 7
select a.anom,a.acoul,count(c.fid) as nbFourn 
from articles as a
inner join catalogue as c
on a.aid=c.aid
group by a.anom,a.acoul
order by a.anom,nbFourn desc;

-- requete 8
select a.anom, c.prix 
from articles as a
inner join catalogue as c
on a.aid=c.aid
where c.prix = (select max(prix) from catalogue);

-- requete 9
select f.fnom 
from fournisseurs as f
inner join catalogue as c
on f.fid=c.fid
where c.prix = (select max(prix) from catalogue);

-- requete 10
select f.fnom, count(c.aid)
from fournisseurs as f
inner join catalogue as c
on f.fid=c.fid
group by f.fnom
having count(c.aid) > 1;select distinct c1.fid 
from catalogue as c1, catalogue as c2
where (c1.aid, c2.aid) in(select a1.aid, a2.aid 
                          from articles as a1, articles as a2
                          where a1.acoul <> a2.acoul
                          and a1.anom = a2.anom)
and c1.fid = c2.fid;

-- requete 11
select acoul as couleurRare 
from articles 
group by acoul
having count(*) = 1
order by acoul;

-- requete 12
select a.aid 
from articles as a
inner join catalogue as c
on a.aid=c.aid
group by a.aid
having count(c.fid) >1
order by a.aid;

-- requete13
select distinct c1.fid 
from catalogue as c1, catalogue as c2
where (c1.aid, c2.aid) in(select a1.aid, a2.aid 
                          from articles as a1, articles as a2
                          where a1.acoul <> a2.acoul
                          and a1.anom = a2.anom)
and c1.fid = c2.fid;

-- requete 14
select distinct f.fnom,a.anom
from (	select distinct c1.fid, c1.aid
	  	from catalogue as c1, catalogue as c2
	  	where (c1.aid, c2.aid) in(	select a1.aid, a2.aid 
                                  	from articles as a1, articles as a2
		                      		where a1.acoul <> a2.acoul
		                      		and a1.anom = a2.anom)
        and c1.fid = c2.fid) as c
inner join fournisseurs as f
on c.fid = f.fid
inner join articles as a
on a.aid = c.aid

-- requete 15
select a.anom, min(c.prix) as prixMin, max(c.prix) as prixMax
from articles as a
inner join (select c1.aid , c1.prix
            from catalogue as c1, catalogue as c2 
	    where c1.fid <> c2.fid and c1.aid = c2.aid) as c
on c.aid = a.aid
group by a.anom;

-- requete 16
select max(maxart) as maximumArticles
from (select c1.fid, count(c1.aid) as maxart
      from catalogue as c1
	  group by c1.fid) as c;



-- requete 17                                             ????????????????????????
select f.fnom, max(ma.maxart) as maximumArticles
from (	select c1.fid, count(c1.aid) as maxart
      	from catalogue as c1
	  	group by c1.fid) as ma
inner join fournisseurs as f
on f.fid = ma.fid
group by f.fnom;


-- requete 18
select a.anom
from catalogue as c
inner join articles as a
on c.aid = a.aid
group by a.anom
having count(c.fid) < 2;

-- requete 19
select a.anom, count(a.aid)
from articles as a
where a.aid not in (select ar.aid
					from articles as ar 
					left outer join catalogue as c
					on c.aid = ar.aid
					where c.aid = a.aid)
group by a.anom;

--requete 20
select a.anom, count(a.aid)
from articles as a
where a.aid not in (select ar.aid
					from articles as ar 
					intersect 
					select c.aid 
					from catalogue as c)
group by a.anom;


