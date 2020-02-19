package com.qxt.cms.dao;

import java.util.List;


import com.qxt.cms.domain.Shoucang;

public interface ShoucangMapper {

	List<Shoucang> selects();

	int delshou(Integer id);

	void addshou(Integer id);	

}
