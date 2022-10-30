package jp.frontierinfo.db.access;

import org.springframework.stereotype.Component;

import jp.frontierinfo.db.dao.S01SequenceDao;

@Component
public class S01SequenceAccess {
	
	private S01SequenceDao s01SequenceDao;
	
	public S01SequenceAccess(S01SequenceDao s01SequenceDao) {
		this.s01SequenceDao = s01SequenceDao;
	}

	public String getUid() {
		return String.format("%06d", s01SequenceDao.getUid()) ;
	}

}