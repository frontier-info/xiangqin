package jp.frontierinfo.db.dao;

import java.util.List;
import java.util.Map;

import jp.frontierinfo.db.bean.BackstageSerachInfo;
import jp.frontierinfo.db.bean.UserFullInfo;
import jp.frontierinfo.db.bean.UserSimpleInfo;
import jp.frontierinfo.db.entity.T01UserBasicInfo;
import jp.frontierinfo.db.entity.T01UserSearchInfo;

public interface T01UserBasicInfoDao {
	
	// 指定検索条件で30名の異性情報を取得
	List<UserSimpleInfo> selectRecommendList(T01UserSearchInfo searchInfo);
	
	// 検索条件が一致する異性が30名未満の場合、ランダムで30名までDBから取得
	List<UserSimpleInfo> selectRandomList(Map<String, Object> params);
	
	// 指定するユーザーの情報を取得(ユーザー画面用)
	UserFullInfo selectUserFullInfoByUid(String uid, String relationId);
	
	// 指定するユーザーの情報を取得(ユーザー画面用、申請された友達一覧用)
	UserFullInfo selectUserFullInfoByRelationId(String uid, String relationId);

	// 指定する検索条件のユーザー情報を取得(管理員画面用)
	List<UserFullInfo> selectUserFullInfoLi(BackstageSerachInfo searchInfo);

	// 指定するユーザーの情報を取得(管理員画面用)
	UserFullInfo selectUserFullInfoByUidForBackstage(String uid);
	
    int deleteByPrimaryKey(String uid);

    int insert(T01UserBasicInfo record);

    int insertSelective(T01UserBasicInfo record);

    T01UserBasicInfo selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(T01UserBasicInfo record);

    int updateByPrimaryKey(T01UserBasicInfo record);
}