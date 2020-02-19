package com.qxt.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qxt.cms.dao.CategoryMapper;
import com.qxt.cms.dao.ChannelMapper;
import com.qxt.cms.domain.Category;
import com.qxt.cms.domain.Channel;
import com.qxt.cms.service.ChannelService;
@Service
public class ChannelServiceImpl implements ChannelService {
	@Resource
	private ChannelMapper channerMapper;
	
	@Resource
	private CategoryMapper categoryMapper;

	@Override
	public List<Channel> selects() {
		return channerMapper.selects();
	}

	@Override
	public List<Category> selectsByChannelId(Integer channelId) {
		// TODO Auto-generated method stub
		return categoryMapper.selectsByChannelId(channelId);
	}

}
