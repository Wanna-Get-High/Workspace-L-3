select max(prix) as prixMax from catalogue;

select anom, count(acoul) as nbCoul from articles 
group by anom;

select acoul, count(anom) as nbArt from articles 
group by acoul 
order by acoul;

select a.acoul,avg(c.prix) as avgPrice from articles as a
inner join catalogue as c
on c.aid=a.aid group by a.acoul order by avgPrice desc;

select a.acoul,avg(c.prix) as avgPrice 
from articles as a
inner join catalogue as c
on c.aid=a.aid
where a.anom not like 'Ferrari%'
group by a.acoul 
having count(*) > 1
order by avgPrice desc;

select a.anom,count(c.fid) as nbFourn 
from articles as a
inner join catalogue as c
on a.aid=c.aid
group by a.anom
order by nbFourn desc;

select a.anom,a.acoul,count(c.fid) as nbFourn 
from articles as a
inner join catalogue as c
on a.aid=c.aid
group by a.anom,a.acoul
order by a.anom,nbFourn desc;

select a.anom, c.prix from articles as a
inner join catalogue as c
on a.aid=c.aid
where c.prix = (select max(prix) from catalogue);

select f.fnom from fournisseurs as f
inner join catalogue as c
on f.fid=c.fid
where c.prix = (select max(prix) from catalogue);

select f.fnom, count(c.aid)from fournisseurs as f
inner join catalogue as c
on f.fid=c.fid
group by f.fnom
having count(c.aid) > 1;

select acoul as couleurRare 
from articles 
group by acoul
having count(*) = 1
order by acoul;

select a.aid from articles as a
inner join catalogue as c
on a.aid=c.aid
group by a.aid
having count(c.fid) >1
order by a.aid;

select distinct f.fid from fournisseurs as f
inner join catalogue as c
on f.fid=c.fid
where c.aid in(select aid from articles 
               where anom in(select anom from articles 
                             group by anom having count(acoul) > 1));
order by f.fid;



