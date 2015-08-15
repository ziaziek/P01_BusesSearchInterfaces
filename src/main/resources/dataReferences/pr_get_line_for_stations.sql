
CREATE OR REPLACE FUNCTION pr_get_line_for_stations(
    station_from integer,
    station_to integer)
  RETURNS lines AS
$BODY$select distinct l.id as id, l.id_bus as bus, l.decription as description from lines l inner join timetables t on l.id=t.id_lines where (select count(id) from timetables where node_from=$1
and id_lines=t.id_lines)>0 and (select count(id) from timetables where node_to=$2
and id_lines = t.id_lines)>0$BODY$
  LANGUAGE sql VOLATILE
  COST 100;