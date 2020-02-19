package com.qxt;
//导入数据

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qxt.cms.dao.ArticleMapper;
import com.qxt.cms.dao.ArticleRepository;
import com.qxt.cms.domain.ArticleWithBLOBs;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-beans.xml")
public class TestImportMysqlData2Es {

	@Autowired
	ArticleMapper articleMapper;
	//单元测试下面的方法必须是public void test123(){}
	//把mysql中的文章数据导入到es的索引库
	
	@Autowired
	ArticleRepository articleRepository;
	
	@Test
	public void test1() {
		//1.从mysql中查询所有的文章列表,问题?是查出来所有文章吗?肯定要查询出审核通过的文章
		//只有审核通过的文章,才能加入到es索引库,被用户搜索到
		ArticleWithBLOBs article = new ArticleWithBLOBs();
		article.setStatus(1);
		//2.把查询出来的文章进行保存(保存到es的索引库)
		List<ArticleWithBLOBs> list = articleMapper.findAll(article);
		articleRepository.saveAll(list);
	}
	
}
