
drop table if exists buses cascade;
drop table if exists stations cascade;
drop table if exists distances cascade;
drop table if exists lines cascade;
drop table if exists timetables cascade;
drop table if exists timetables_types cascade;



create table buses(id serial primary key, make varchar(50), manufacturedOn date not null, used_since date not null, end_date date);
create table stations(id serial primary key, name varchar(50) not null, coordinates double precision[]); --array of longtitudes and latitudes
create table lines(id serial primary key, id_bus int not null references buses(id), decription varchar(75));
create table distances(id serial primary key, station_from int references stations(id), station_to int references stations(id), lines_id int references lines(id), distance double precision);
create table timetables_types(id serial primary key, name varchar(25) not null unique);
create table timetables(id serial primary key, id_lines int not null references lines(id), node_from int not null references stations(id), node_to int references stations(id), arrive_at_node_from time, depart_to_node_to time); --we may need to add an eextra field to say something if the departure is on the next day (after midnight)
 

insert into buses(make, manufacturedon, used_since) values('San', '2001-12-07', '2001-10-25');

insert into stations(name) values('Trzcianka');
insert into stations(name) values('Czarnków');
insert into stations(name) values('Oborniki');
insert into stations(name) values('Poznań');
insert into stations(name) values('Piła');
insert into stations(name) values('Wałcz');

insert into lines(id_bus) values(1);

insert into timetables_types(name) values('Przyjazdy');
insert into timetables_types(name) values('Odjazdy');

insert into timetables(id_lines, node_from, node_to, arrive_at_node_from, depart_to_node_to) values(1, 1, 2, null, '10:00');
insert into timetables(id_lines, node_from, node_to, arrive_at_node_from, depart_to_node_to) values(1, 2, 3, '10:30', '10:35');
insert into timetables(id_lines, node_from, node_to, arrive_at_node_from, depart_to_node_to) values(1, 3, 4, '11:05', '11:15');
insert into timetables(id_lines, node_from, node_to, arrive_at_node_from, depart_to_node_to) values(1, 4, null, '12:10', null);


-- wyszukiwanie linii ze stacji A do B
select t.id_lines from timetables t where (select count(id) from timetables where node_from=:A and id_lines=t.id_lines)>0 and (select count(id) from timetables where node_to=:B
and id_lines = t.id_lines)>0;

--tworzenie tabeli przyjazdów dla stacji A, podajemy miejsce startu linii jako From
select t.id_lines as 'Line', (select node_from from timetables where id_lines = t.id_lines and arrive_at_node_from is null) as 'From', t.arrive_at_node_from as 'Arrival' 
from timetables t where t.node_to=:A;


--wersja 2 timetables (nie zatwierdzona)
create table timetables(id serial primary key, id_stations int not null references stations(id), arrival time, departure time, node_number int not null);
create index uq_timetables(id_stations, node_number) on timetables;

--wyszukiwanie linii ze stacji A do B
select distinct t.id_lines from timetables t where (select count(id) from timetables where id_lines = t.id_lines and id_stations=:A or id_stations=:B)=2 and (select node_number from
timetables where id_lines=t.id_lines and id_stations=:A)-(select node_number from
timetables where id_lines=t.id_lines and id_stations=:B)>0;

--tworzenie tabeli przyjazdów dla stacji A
select t.id_lines as 'Line', t.arrival as 'Arrival', (select id_stations from timetables where id_lines=t.id_lines and node_number=1) as 'From' from timetables t where t.id_stations=:A