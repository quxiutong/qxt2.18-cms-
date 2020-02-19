package com.qxt.cms.dao;

import java.util.List;

import com.qxt.cms.domain.Complain;
import com.qxt.cms.vo.ComplainVO;

public interface ComplainMapper {
	
	int insert(Complain complain);
	
	//查询举报
	List<Complain> selects(ComplainVO complainVO);

}
