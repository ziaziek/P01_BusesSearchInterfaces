
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
create table timetables(id serial primary key, id_timetables_type int references timetables_types(id),  id_lines int references lines(id), id_stations int references stations(id), station_time date not null); --we may need to add an eextra field to say something if the departure is on the next day (after midnight)
 