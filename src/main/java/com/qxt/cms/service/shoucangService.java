package com.qxt.cms.service;

import java.util.List;

import com.qxt.cms.domain.Shoucang;

public interface shoucangService {

	List<Shoucang> selects();

	int delshou(Integer id);

	boolean addshou(Integer id);

}
