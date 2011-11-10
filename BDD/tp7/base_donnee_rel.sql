-- q1 --
select e_id
from participer
where c_id in (select c_id 
               from cours
               where horaire like '%Lu%');
-- q2 --
select titre 
from cours
where c_id in (	select c_id 
				from participer
               	where e_id in (	select e_id 
               					from etudiants
                              	where programme = 'Informatique'));
-- q3 -- ?????
select titre 
from cours
where c_id in (select c_id from participer
               where e_id in (select e_id from etudiants
                              where programme <> 'Informatique'));
-- q4 --
-- q5 --
-- q6 --
-- q7 --
-- q8 --
-- q9 --
-- q10 --
-- q11 --
-- q12 --
-- q13 --
-- q14 --
-- q15 --
-- q16 --
