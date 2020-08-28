begin
    execute immediate 'drop table customer';
    dbms_output.put_line('Table customer dropped');
exception
    when others then dbms_output.put_line('Table customer did not exist');
end;
/
begin
    execute immediate 'drop sequence customer_seq';
    dbms_output.put_line('Sequence customer_seq dropped');
exception
    when others then dbms_output.put_line('Sequence customer_seq did not exist');
end;
/

create table customer
(
    id              number(19)    not null,
    name_fa         nvarchar2(50) not null,
    name_en         varchar(50),
    email_address   varchar(50),
    website_address varchar(50),
    constraint customer_pk_id primary key (id)
);

create sequence customer_seq
    minvalue 10000 maxvalue 9999999999999999999 cycle
    start with 10000 increment by 1000 cache 1000;
/