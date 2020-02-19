package com.qxt.cms.dao;

import com.qxt.cms.domain.Settings;

public interface SettingsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Settings record);

    int insertSelective(Settings record);

    Settings selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Settings record);

    int updateByPrimaryKey(Settings record);
}