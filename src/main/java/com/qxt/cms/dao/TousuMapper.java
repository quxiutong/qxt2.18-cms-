package com.qxt.cms.dao;

import java.util.List;

import javax.validation.Valid;

import com.qxt.cms.domain.Tousubiao;
import com.qxt.cms.vo.ComplainVO;

/**
 * @于浩
 */
public interface TousuMapper {

	//投诉列表
	List<Tousubiao> list(ComplainVO vo);
	//详情
	List<Tousubiao> xiangqing();
	void tousu(@Valid Tousubiao tousubiao);
}
