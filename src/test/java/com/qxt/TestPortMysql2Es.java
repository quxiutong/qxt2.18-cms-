package com.qxt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageInfo;
import com.qxt.cms.dao.ArticleRes;
import com.qxt.cms.domain.Article;
import com.qxt.cms.service.ArticleService;

/**
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-beans.xml")
public class TestPortMysql2Es {
	
	@Autowired
	ArticleRes articleRes;
	
	@Autowired
	ArticleService articleService;
	@Test
	public void testImportMysql2Es() {
		//1.从mysql中查取所有文章信息(已审核通过的文章信息)
		Article article=new Article();
		article.setStatus(1);
		PageInfo<Article> selects = articleService.selects(article, 1, 10000);
		//2.把查询出来的文章批量保存到es索引库
		articleRes.saveAll(selects.getList());
	}

}
