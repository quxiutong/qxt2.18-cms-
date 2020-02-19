package com.qxt.cms.dao;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.qxt.cms.domain.Article;
import com.qxt.cms.domain.ArticleWithBLOBs;

/**
 * @于浩
 */
//此时自动具备了crud功能
public interface ArticleRes extends ElasticsearchRepository<Article, Integer>{
	//实现复杂查询
			//按照标题查询,方法名称一定要按照规则写
			List<ArticleWithBLOBs> findByTitle(String key);
			//按照标题或者内容查询,方法名称一定要按照规则写
//			List<ArticleWithBLOBs> findByTitleOrContent(String title,String content);
}
