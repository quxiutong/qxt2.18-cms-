package com.qxt.cms.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.qxt.cms.dao.ArticleRepository;
import com.qxt.cms.domain.Article;
import com.qxt.cms.domain.Channel;
import com.qxt.cms.service.ChannelService;
import com.qxt.cms.util.HLUtils;
/**
 * 
 * @ClassName: ArticleController 
 * @Description: TODO
 * @author: charles
 * @date: 2019年12月11日 上午11:23:02
 */
@RequestMapping("article")
@Controller
public class ArticleController {
	
	@Autowired
	ArticleRepository articleRepository;
	@Autowired
	ElasticsearchTemplate elasticsearchTemplate;

	@Resource
	private ChannelService channelService;
	@GetMapping("selects")
	public String selects() {
		return "admin/article/articles";
		
	}
	
	/**
	 * es搜索的方法
	 * 
	 */
	@RequestMapping("search")
	public String search(String key,Article article, Model model, @RequestParam(defaultValue = "1") Integer page,
			@RequestParam(defaultValue = "2") Integer pageSize) {
		//显示栏目
		//0.封装查询条件
				article.setStatus(1);
				model.addAttribute("article", article);
				//1. 查询出所有的栏目
						List<Channel> channels = channelService.selects();
						model.addAttribute("channels", channels);
		//实现高亮显示
		//es搜索
						
		//定义一个开始时间
		long start = System.currentTimeMillis();
		PageInfo<Article> pageInfo = (PageInfo<Article>) HLUtils.findByHighLight(elasticsearchTemplate, Article.class, page, pageSize, new String[] {"title"}, "id", key);
		//定义一个结束时间
		long end = System.currentTimeMillis();
		System.err.println("es查询一共花费了"+(end-start)+"毫秒");
		model.addAttribute("key", key);
		model.addAttribute("info", pageInfo);
		return "index/index";
	}
	
	

}
