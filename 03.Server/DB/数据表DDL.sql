-- Project Name : xiangqin
-- Date/Time    : 2022/12/6 12:52:32
-- Author       : wuzhusong
-- RDBMS Type   : PostgreSQL
-- Application  : A5:SQL Mk-2

-- 编码转换表
drop table if exists xiangqin.m01_code_master_info cascade;

create table xiangqin.m01_code_master_info (
  code_type varchar
  , code_type_name varchar
  , master_code varchar
  , master_name varchar
  , constraint m01_code_master_info_PKC primary key (code_type,master_code)
) ;

-- 下拉列表信息表
drop table if exists xiangqin.m01_pulldown_info cascade;

create table xiangqin.m01_pulldown_info (
  pulldown_code varchar
  , pulldown_value varchar
  , constraint m01_pulldown_info_PKC primary key (pulldown_code,pulldown_value)
) ;

-- 用户检索信息表
drop table if exists xiangqin.t01_user_search_info cascade;

create table xiangqin.t01_user_search_info (
  uid varchar
  , sex varchar
  , age_from integer
  , age_to integer
  , birth_place varchar
  , address varchar
  , profession varchar
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
  , relation_level1 varchar
  , relation_level2 varchar
  , constraint t01_user_relations_info_PKC primary key (uid,relation_id)
) ;

-- 用户基本信息表
drop table if exists xiangqin.t01_user_basic_info cascade;

create table xiangqin.t01_user_basic_info (
  uid varchar
  , uname varchar
  , sex varchar
  , birth_date date
  , age integer
  , birth_place varchar
  , address varchar
  , profession varchar
  , interest varchar
  , uheight numeric
  , uweight numeric
  , introduce varchar
  , avatar_img varchar
  , uimages1 varchar
  , uimages2 varchar
  , uimages3 varchar
  , identification_img varchar
  , require_age_from integer
  , require_age_to integer
  , require_birth_place varchar
  , require_address varchar
  , require_profession varchar
  , require_height_from numeric
  , require_height_to numeric
  , require_weight_from numeric
  , require_weight_to numeric
  , constraint t01_user_basic_info_PKC primary key (uid)
) ;

-- 用户登录信息表
drop table if exists xiangqin.t01_user_login_info cascade;

create table xiangqin.t01_user_login_info (
  uid varchar
  , mobile varchar
  , email varchar
  , password varchar
  , user_status_code varchar
  , user_censor_result varchar
  , user_rank_code varchar
  , create_time timestamp
  , last_login_time timestamp
  , delete_flg boolean
  , constraint t01_user_login_info_PKC primary key (uid)
) ;

comment on table xiangqin.m01_code_master_info is '编码转换表';
comment on column xiangqin.m01_code_master_info.code_type is '编码类型';
comment on column xiangqin.m01_code_master_info.code_type_name is '编码类型名称';
comment on column xiangqin.m01_code_master_info.master_code is '代码';
comment on column xiangqin.m01_code_master_info.master_name is '名称';

comment on table xiangqin.m01_pulldown_info is '下拉列表信息表';
comment on column xiangqin.m01_pulldown_info.pulldown_code is '下拉列表代码';
comment on column xiangqin.m01_pulldown_info.pulldown_value is '下拉列表值';

comment on table xiangqin.t01_user_search_info is '用户检索信息表';
comment on column xiangqin.t01_user_search_info.uid is '用户ID';
comment on column xiangqin.t01_user_search_info.sex is '性别';
comment on column xiangqin.t01_user_search_info.age_from is '年龄(从)';
comment on column xiangqin.t01_user_search_info.age_to is '年龄(到)';
comment on column xiangqin.t01_user_search_info.birth_place is '籍贯';
comment on column xiangqin.t01_user_search_info.address is '现住址';
comment on column xiangqin.t01_user_search_info.profession is '职业';
comment on column xiangqin.t01_user_search_info.uheight_from is '身高(从)';
comment on column xiangqin.t01_user_search_info.uheight_to is '身高(到)';
comment on column xiangqin.t01_user_search_info.uweight_from is '体重(从)';
comment on column xiangqin.t01_user_search_info.uweight_to is '体重(到)';

comment on table xiangqin.t01_user_relations_info is '用户关系表';
comment on column xiangqin.t01_user_relations_info.uid is '用户ID';
comment on column xiangqin.t01_user_relations_info.relation_id is '关系用户ID';
comment on column xiangqin.t01_user_relations_info.relation_level1 is '邀约进度1:同意互相查看照片';
comment on column xiangqin.t01_user_relations_info.relation_level2 is '邀约进度2:同意交换联系方式';

comment on table xiangqin.t01_user_basic_info is '用户基本信息表';
comment on column xiangqin.t01_user_basic_info.uid is '用户ID';
comment on column xiangqin.t01_user_basic_info.uname is '姓名';
comment on column xiangqin.t01_user_basic_info.sex is '性别';
comment on column xiangqin.t01_user_basic_info.birth_date is '出生年月';
comment on column xiangqin.t01_user_basic_info.age is '年龄';
comment on column xiangqin.t01_user_basic_info.birth_place is '籍贯';
comment on column xiangqin.t01_user_basic_info.address is '现住址';
comment on column xiangqin.t01_user_basic_info.profession is '职业';
comment on column xiangqin.t01_user_basic_info.interest is '兴趣';
comment on column xiangqin.t01_user_basic_info.uheight is '身高';
comment on column xiangqin.t01_user_basic_info.uweight is '体重';
comment on column xiangqin.t01_user_basic_info.introduce is '简介';
comment on column xiangqin.t01_user_basic_info.avatar_img is '头像图片';
comment on column xiangqin.t01_user_basic_info.uimages1 is '个人照片1';
comment on column xiangqin.t01_user_basic_info.uimages2 is '个人照片2';
comment on column xiangqin.t01_user_basic_info.uimages3 is '个人照片3';
comment on column xiangqin.t01_user_basic_info.identification_img is '身份信息照片';
comment on column xiangqin.t01_user_basic_info.require_age_from is '择偶要求_年龄(从)';
comment on column xiangqin.t01_user_basic_info.require_age_to is '择偶要求_年龄(到)';
comment on column xiangqin.t01_user_basic_info.require_birth_place is '择偶要求_籍贯';
comment on column xiangqin.t01_user_basic_info.require_address is '择偶要求_现住址';
comment on column xiangqin.t01_user_basic_info.require_profession is '择偶要求_职业';
comment on column xiangqin.t01_user_basic_info.require_height_from is '择偶要求_身高(从)';
comment on column xiangqin.t01_user_basic_info.require_height_to is '择偶要求_身高(到)';
comment on column xiangqin.t01_user_basic_info.require_weight_from is '择偶要求_体重(从)';
comment on column xiangqin.t01_user_basic_info.require_weight_to is '择偶要求_体重(到)';

comment on table xiangqin.t01_user_login_info is '用户登录信息表';
comment on column xiangqin.t01_user_login_info.uid is '用户ID';
comment on column xiangqin.t01_user_login_info.mobile is '电话号码';
comment on column xiangqin.t01_user_login_info.email is '邮箱';
comment on column xiangqin.t01_user_login_info.password is '密码';
comment on column xiangqin.t01_user_login_info.user_status_code is '用户状态:00:未提交审核,01:审核中,02:审核通过,03:审核拒绝';
comment on column xiangqin.t01_user_login_info.user_censor_result is '审核结果:例:身份信息不清晰';
comment on column xiangqin.t01_user_login_info.user_rank_code is '用户级别:01:普通用户,02:高级用户,08:普通管理员,09:高级管理员';
comment on column xiangqin.t01_user_login_info.create_time is '注册时间';
comment on column xiangqin.t01_user_login_info.last_login_time is '最后登录时间';
comment on column xiangqin.t01_user_login_info.delete_flg is '删除标记';

