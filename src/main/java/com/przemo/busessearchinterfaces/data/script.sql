create table buses(id serial primary key, make varchar(50), manufacturedOn date not null);
create table stations(id serial primary key, name varchar(50) not null);
create table distances(id serial primary key, station_from int references stations(id), station_to int references stations(id), distance double precision);
create table lines(id serial primary key, id_bus int not null references buses(id), decription varchar(75));
create table  routes(id serial primary key, id_station int not null references stations(id), arrival_time time, departure_time time); --we may need to add an eextra field to say something if the departure is on the next day (after midnight)
