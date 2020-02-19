package com.qxt.cms.service;

import java.util.List;

import javax.validation.Valid;

import com.github.pagehelper.PageInfo;
import com.qxt.cms.domain.Tousubiao;
import com.qxt.cms.vo.ComplainVO;

/**
 * @于浩
 */
public interface TousuService {
  
	//投诉列表
	PageInfo<Tousubiao> list(int pageNum,ComplainVO vo);
	//详情列表
	List<Tousubiao> xiangqing();
	void tousu(@Valid Tousubiao tousubiao);
}
