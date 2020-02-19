package com.qxt.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qxt.cms.dao.ShoucangMapper;
import com.qxt.cms.domain.Shoucang;
import com.qxt.cms.service.shoucangService;
@Service
public class shoucangServiceImpl implements shoucangService {

	@Resource
	private ShoucangMapper mapper;
	
	@Override
	public List<Shoucang> selects() {
		// TODO Auto-generated method stub
		return mapper.selects();
	}

	@Override
	public int delshou(Integer id) {
		// TODO Auto-generated method stub
		return mapper.delshou(id);
	}

	@Override
	public boolean addshou(Integer id) {
		// TODO Auto-generated method stub
		try {
			mapper.addshou(id);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

}
