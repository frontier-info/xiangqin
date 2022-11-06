-- Project Name : xiangqin
-- Date/Time    : 2022/11/6 14:26:39
-- Author       : wuzhusong
-- RDBMS Type   : PostgreSQL
-- Application  : A5:SQL Mk-2

-- �û�������Ϣ��
drop table if exists xiangqin.t01_user_search_info cascade;

create table xiangqin.t01_user_search_info (
  uid varchar
  , sex integer
  , age_from varchar
  , age_to varchar
  , birth_place varchar
  , address varchar
  , profession varchar
  , interest varchar
  , uheight_from numeric
  , uheight_to numeric
  , uweight_from numeric
  , uweight_to numeric
  , constraint t01_user_search_info_PKC primary key (uid)
) ;

-- �û���ϵ��
drop table if exists xiangqin.t01_user_relations_info cascade;

create table xiangqin.t01_user_relations_info (
  uid varchar
  , relation_id varchar
  , is_send boolean
  , is_relation boolean
  , constraint t01_user_relations_info_PKC primary key (uid,relation_id)
) ;

-- �û�������Ϣ��
drop table if exists xiangqin.t01_user_basic_info cascade;

create table xiangqin.t01_user_basic_info (
  uid varchar
  , uname varchar
  , sex integer
  , birth_date date
  , birth_place varchar
  , address varchar
  , profession varchar
  , interest varchar
  , uheight numeric
  , uweight numeric
  , introduce varchar
  , uimages varchar
  , identification_photo varchar
  , constraint t01_user_basic_info_PKC primary key (uid)
) ;

-- �û���¼��Ϣ��
drop table if exists xiangqin.t01_user_login_info cascade;

create table xiangqin.t01_user_login_info (
  uid varchar
  , mobile varchar
  , email varchar
  , password varchar
  , constraint t01_user_login_info_PKC primary key (uid)
) ;

comment on table xiangqin.t01_user_search_info is '�û�������Ϣ��';
comment on column xiangqin.t01_user_search_info.uid is '�û�ID';
comment on column xiangqin.t01_user_search_info.sex is '�Ա�';
comment on column xiangqin.t01_user_search_info.age_from is '����(��)';
comment on column xiangqin.t01_user_search_info.age_to is '����(��)';
comment on column xiangqin.t01_user_search_info.birth_place is '����';
comment on column xiangqin.t01_user_search_info.address is '��סַ';
comment on column xiangqin.t01_user_search_info.profession is 'ְҵ';
comment on column xiangqin.t01_user_search_info.interest is '��Ȥ';
comment on column xiangqin.t01_user_search_info.uheight_from is '���(��)';
comment on column xiangqin.t01_user_search_info.uheight_to is '���(��)';
comment on column xiangqin.t01_user_search_info.uweight_from is '����(��)';
comment on column xiangqin.t01_user_search_info.uweight_to is '����(��)';

comment on table xiangqin.t01_user_relations_info is '�û���ϵ��';
comment on column xiangqin.t01_user_relations_info.uid is '�û�ID';
comment on column xiangqin.t01_user_relations_info.relation_id is '��ϵ�û�ID';
comment on column xiangqin.t01_user_relations_info.is_send is '�Ƿ���Լ';
comment on column xiangqin.t01_user_relations_info.is_relation is '�Ƿ�ͬ��';

comment on table xiangqin.t01_user_basic_info is '�û�������Ϣ��';
comment on column xiangqin.t01_user_basic_info.uid is '�û�ID';
comment on column xiangqin.t01_user_basic_info.uname is '����';
comment on column xiangqin.t01_user_basic_info.sex is '�Ա�';
comment on column xiangqin.t01_user_basic_info.birth_date is '��������';
comment on column xiangqin.t01_user_basic_info.birth_place is '����';
comment on column xiangqin.t01_user_basic_info.address is '��סַ';
comment on column xiangqin.t01_user_basic_info.profession is 'ְҵ';
comment on column xiangqin.t01_user_basic_info.interest is '��Ȥ';
comment on column xiangqin.t01_user_basic_info.uheight is '���';
comment on column xiangqin.t01_user_basic_info.uweight is '����';
comment on column xiangqin.t01_user_basic_info.introduce is '���';
comment on column xiangqin.t01_user_basic_info.uimages is '��Ƭ';
comment on column xiangqin.t01_user_basic_info.identification_photo is '�����Ϣ';

comment on table xiangqin.t01_user_login_info is '�û���¼��Ϣ��';
comment on column xiangqin.t01_user_login_info.uid is '�û�ID';
comment on column xiangqin.t01_user_login_info.mobile is '�绰����';
comment on column xiangqin.t01_user_login_info.email is '����';
comment on column xiangqin.t01_user_login_info.password is '����';

