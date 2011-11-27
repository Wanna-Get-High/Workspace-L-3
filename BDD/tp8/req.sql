-- Q1 --
/*
select a.name 
from artist as a
where a.name in (	select i.actor
					from interpretation as i
					where i.m_id in (	select m1.m_id
										from movie as m1
										where myear = 2010))
or a.name in (	select director
				from movie as m2
				where myear = 2010);
					
-- Q2 --
select a1.name
from artist as a1
where exists (	select i.actor
				from interpretation as i
				where a1.name = i.actor
			except
				select m2.director
				from movie as m2
				where a1.name = m2.director)
				
or exists (	select m1.director
			from movie as m1
			where a1.name = m1.director
		except
			select i2.actor
			from interpretation as i2
			where a1.name = i2.actor);
			
-- Q3 --
select a.name
from artist as a
except
select a.name
from artist as a
where exists (	select i.actor
				from interpretation as i
				where a.name = i.actor
				and exists (select m.m_id
							from movie as m
							where i.m_id = m.m_id
							and m.myear = 2010));
-- Q4 --
select m.title
from movie as m	
where m.m_id in (	select i.m_id
					from interpretation as i
					where i.protagonist = '1'
					and i.actor in (	select a.name 
										from artist as a
										where a.place_birth in ('Lille','Nice','Monpelier','Paris')))
or m.director in (	select a.name 
					from artist as a
					where a.place_birth in ('Lille','Nice','Monpelier','Paris'));
				
-- Q5 --
select m.title
from movie as m	
where m.m_id in (	select i.m_id
					from interpretation as i
					where i.protagonist = '1'
					and i.actor in (	
										select a.name 
										from artist as a
										where a.place_birth in ('Lille','Nice','Monpelier','Paris')
									)
											
				and 0 < ( 	
								select count(a.name)
								from artist as a
								where i.actor = a.name
								and a.place_birth not in ('Lille','Nice','Monpelier','Paris')
						)
				)
															
or m.director in (	select a.name 
					from artist as a
					where a.place_birth in ('Lille','Nice','Monpelier','Paris'));
-- Q6 --

select m.title
from movie as m	
where m.m_id in (	select i.m_id
					from interpretation as i
					where i.protagonist = '1'
					and i.actor in (	select a.name 
										from artist as a
										where a.place_birth in ('Lille','Nice','Monpelier','Paris')))
or m.director in (	select a.name 
					from artist as a
					where a.place_birth in ('Lille','Nice','Monpelier','Paris'))	
except
select m.title
from movie as m	
where m.m_id in (	select i.m_id
					from interpretation as i
					where i.actor not in (select a.name 
										from artist as a
										where a.place_birth in ('Lille','Nice','Monpelier','Paris')))*/
-- Q7 --
--voir create_db_movie.sql

-- Q8 --
select a.name 
from artist as a
where exists (	select *
				from interpretation as i
				where a.name = i.actor
				and in all(	select m.m_id
							from movie));
-- Q9 --
-- Q10 --
-- Q11 --
-- Q12 --
