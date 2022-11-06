-- Project Name : xiangqin
-- Date/Time    : 2022/11/6 14:26:39
-- Author       : wuzhusong
-- RDBMS Type   : PostgreSQL
-- Application  : A5:SQL Mk-2

-- 用户检索信息表
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

-- 用户关系表
drop table if exists xiangqin.t01_user_relations_info cascade;

create table xiangqin.t01_user_relations_info (
  uid varchar
  , relation_id varchar
  , is_send boolean
  , is_relation boolean
  , constraint t01_user_relations_info_PKC primary key (uid,relation_id)
) ;

-- 用户基本信息表
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

-- 用户登录信息表
drop table if exists xiangqin.t01_user_login_info cascade;

create table xiangqin.t01_user_login_info (
  uid varchar
  , mobile varchar
  , email varchar
  , password varchar
  , constraint t01_user_login_info_PKC primary key (uid)
) ;

comment on table xiangqin.t01_user_search_info is '用户检索信息表';
comment on column xiangqin.t01_user_search_info.uid is '用户ID';
comment on column xiangqin.t01_user_search_info.sex is '性别';
comment on column xiangqin.t01_user_search_info.age_from is '年龄(从)';
comment on column xiangqin.t01_user_search_info.age_to is '年龄(到)';
comment on column xiangqin.t01_user_search_info.birth_place is '籍贯';
comment on column xiangqin.t01_user_search_info.address is '现住址';
comment on column xiangqin.t01_user_search_info.profession is '职业';
comment on column xiangqin.t01_user_search_info.interest is '兴趣';
comment on column xiangqin.t01_user_search_info.uheight_from is '身高(从)';
comment on column xiangqin.t01_user_search_info.uheight_to is '身高(到)';
comment on column xiangqin.t01_user_search_info.uweight_from is '体重(从)';
comment on column xiangqin.t01_user_search_info.uweight_to is '体重(到)';

comment on table xiangqin.t01_user_relations_info is '用户关系表';
comment on column xiangqin.t01_user_relations_info.uid is '用户ID';
comment on column xiangqin.t01_user_relations_info.relation_id is '关系用户ID';
comment on column xiangqin.t01_user_relations_info.is_send is '是否邀约';
comment on column xiangqin.t01_user_relations_info.is_relation is '是否同意';

comment on table xiangqin.t01_user_basic_info is '用户基本信息表';
comment on column xiangqin.t01_user_basic_info.uid is '用户ID';
comment on column xiangqin.t01_user_basic_info.uname is '姓名';
comment on column xiangqin.t01_user_basic_info.sex is '性别';
comment on column xiangqin.t01_user_basic_info.birth_date is '出生年月';
comment on column xiangqin.t01_user_basic_info.birth_place is '籍贯';
comment on column xiangqin.t01_user_basic_info.address is '现住址';
comment on column xiangqin.t01_user_basic_info.profession is '职业';
comment on column xiangqin.t01_user_basic_info.interest is '兴趣';
comment on column xiangqin.t01_user_basic_info.uheight is '身高';
comment on column xiangqin.t01_user_basic_info.uweight is '体重';
comment on column xiangqin.t01_user_basic_info.introduce is '简介';
comment on column xiangqin.t01_user_basic_info.uimages is '照片';
comment on column xiangqin.t01_user_basic_info.identification_photo is '身份信息';

comment on table xiangqin.t01_user_login_info is '用户登录信息表';
comment on column xiangqin.t01_user_login_info.uid is '用户ID';
comment on column xiangqin.t01_user_login_info.mobile is '电话号码';
comment on column xiangqin.t01_user_login_info.email is '邮箱';
comment on column xiangqin.t01_user_login_info.password is '密码';

