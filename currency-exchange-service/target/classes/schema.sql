
DROP TABLE IF EXISTS currency_exchange;  
create table currency_exchange (id integer not null, conversion_multiple decimal(19,2), currency_from varchar(255), port integer, currency_to varchar(255), primary key (id));