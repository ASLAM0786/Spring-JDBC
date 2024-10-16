
create table course
(
    id bigint not null,
    name varchar(256) not null,
    author varchar(256) null,
    primary key (id)
);