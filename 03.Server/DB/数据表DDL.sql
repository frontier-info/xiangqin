-- Project Name : xiangqin
-- Date/Time    : 2022/12/6 12:52:32
-- Author       : wuzhusong
-- RDBMS Type   : PostgreSQL
-- Application  : A5:SQL Mk-2

-- コードマスタ
drop table if exists xiangqin.m01_code_master_info cascade;

create table xiangqin.m01_code_master_info (
  code_type varchar
  , code_type_name varchar
  , master_code varchar
  , master_name varchar
  , constraint m01_code_master_info_PKC primary key (code_type,master_code)
) ;

-- プルダウンリスト情報
drop table if exists xiangqin.m01_pulldown_info cascade;

create table xiangqin.m01_pulldown_info (
  pulldown_code varchar
  , pulldown_value varchar
  , constraint m01_pulldown_info_PKC primary key (pulldown_code,pulldown_value)
) ;

-- ユーザー検索条件
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

-- 友達リクエスト管理
drop table if exists xiangqin.t01_user_relations_info cascade;

create table xiangqin.t01_user_relations_info (
  uid varchar
  , relation_id varchar
  , relation_level1 varchar
  , relation_level2 varchar
  , constraint t01_user_relations_info_PKC primary key (uid,relation_id)
) ;

-- ユーザー基本情報
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

-- ユーザーログイン情報
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

comment on table xiangqin.m01_code_master_info is 'コードマスタ';
comment on column xiangqin.m01_code_master_info.code_type is 'コード種類';
comment on column xiangqin.m01_code_master_info.code_type_name is 'コード種類名称';
comment on column xiangqin.m01_code_master_info.master_code is 'マスタコード';
comment on column xiangqin.m01_code_master_info.master_name is 'マスタ名称';

comment on table xiangqin.m01_pulldown_info is 'プルダウンリスト情報';
comment on column xiangqin.m01_pulldown_info.pulldown_code is 'プルダウンリストキー';
comment on column xiangqin.m01_pulldown_info.pulldown_value is 'プルダウンリストバリュー';

comment on table xiangqin.t01_user_search_info is 'ユーザー検索条件';
comment on column xiangqin.t01_user_search_info.uid is 'ユーザーID';
comment on column xiangqin.t01_user_search_info.sex is '性别';
comment on column xiangqin.t01_user_search_info.age_from is '年齢(から)';
comment on column xiangqin.t01_user_search_info.age_to is '年齢(まで)';
comment on column xiangqin.t01_user_search_info.birth_place is '出生地';
comment on column xiangqin.t01_user_search_info.address is '居住地';
comment on column xiangqin.t01_user_search_info.profession is '職業';
comment on column xiangqin.t01_user_search_info.uheight_from is '身長(から)';
comment on column xiangqin.t01_user_search_info.uheight_to is '身長(まで)';
comment on column xiangqin.t01_user_search_info.uweight_from is '体重(から)';
comment on column xiangqin.t01_user_search_info.uweight_to is '体重(まで)';

comment on table xiangqin.t01_user_relations_info is '友達リクエスト管理';
comment on column xiangqin.t01_user_relations_info.uid is 'ユーザーID';
comment on column xiangqin.t01_user_relations_info.relation_id is 'リクエストユーザーID';
comment on column xiangqin.t01_user_relations_info.relation_level1 is 'リクエストステップ1:写真の閲覧が承認され';
comment on column xiangqin.t01_user_relations_info.relation_level2 is 'リクエストステップ2:連絡先交換が承認され';

comment on table xiangqin.t01_user_basic_info is 'ユーザー基本情報';
comment on column xiangqin.t01_user_basic_info.uid is 'ユーザーID';
comment on column xiangqin.t01_user_basic_info.uname is '名前';
comment on column xiangqin.t01_user_basic_info.sex is '性别';
comment on column xiangqin.t01_user_basic_info.birth_date is '生年月日';
comment on column xiangqin.t01_user_basic_info.age is '年齢';
comment on column xiangqin.t01_user_basic_info.birth_place is '出生地';
comment on column xiangqin.t01_user_basic_info.address is '居住地';
comment on column xiangqin.t01_user_basic_info.profession is '職業';
comment on column xiangqin.t01_user_basic_info.interest is '趣味';
comment on column xiangqin.t01_user_basic_info.uheight is '身長';
comment on column xiangqin.t01_user_basic_info.uweight is '体重';
comment on column xiangqin.t01_user_basic_info.introduce is '自己紹介';
comment on column xiangqin.t01_user_basic_info.avatar_img is 'プロフィール写真';
comment on column xiangqin.t01_user_basic_info.uimages1 is '写真1';
comment on column xiangqin.t01_user_basic_info.uimages2 is '写真2';
comment on column xiangqin.t01_user_basic_info.uimages3 is '写真3';
comment on column xiangqin.t01_user_basic_info.identification_img is '身分証明書の写真';
comment on column xiangqin.t01_user_basic_info.require_age_from is '配偶者の要件_年齢(から)';
comment on column xiangqin.t01_user_basic_info.require_age_to is '配偶者の要件_年齢(まで)';
comment on column xiangqin.t01_user_basic_info.require_birth_place is '配偶者の要件_出生地';
comment on column xiangqin.t01_user_basic_info.require_address is '配偶者の要件_居住地';
comment on column xiangqin.t01_user_basic_info.require_profession is '配偶者の要件_職業';
comment on column xiangqin.t01_user_basic_info.require_height_from is '配偶者の要件_身長(から)';
comment on column xiangqin.t01_user_basic_info.require_height_to is '配偶者の要件_身長(まで)';
comment on column xiangqin.t01_user_basic_info.require_weight_from is '配偶者の要件_体重(から)';
comment on column xiangqin.t01_user_basic_info.require_weight_to is '配偶者の要件_体重(まで)';

comment on table xiangqin.t01_user_login_info is 'ユーザーログイン情報';
comment on column xiangqin.t01_user_login_info.uid is 'ユーザーID';
comment on column xiangqin.t01_user_login_info.mobile is '連絡先';
comment on column xiangqin.t01_user_login_info.email is 'メールアドレス';
comment on column xiangqin.t01_user_login_info.password is 'パスワード';
comment on column xiangqin.t01_user_login_info.user_status_code is 'ユーザー状態:00:審査未依頼,01:審査中,02:審査完了,03:審査拒否';
comment on column xiangqin.t01_user_login_info.user_censor_result is '審査結果';
comment on column xiangqin.t01_user_login_info.user_rank_code is 'ユーザーレベル:01:一般ユーザー,02:VIPユーザー,08:一般管理員,09:上級管理員';
comment on column xiangqin.t01_user_login_info.create_time is 'サインアップ日時';
comment on column xiangqin.t01_user_login_info.last_login_time is '最終ログイン日時';
comment on column xiangqin.t01_user_login_info.delete_flg is '削除フラグ';

