package com.qxt.cms.service;

import com.github.pagehelper.PageInfo;
import com.qxt.cms.domain.Complain;
import com.qxt.cms.vo.ComplainVO;

public interface ComplainService {
	//举报
	boolean insert(Complain complain);
	
	//查询举报
		PageInfo<Complain> selects(ComplainVO complainVO,Integer page,Integer pageSize);
}
