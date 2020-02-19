package com.qxt.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.qxt.cms.domain.Tousubiao;
import com.qxt.cms.service.TousuService;
import com.qxt.cms.vo.ComplainVO;

/**
 * @于浩
 */
@Controller
public class TousuController {

	@Autowired
	private TousuService service;
	
	//投诉列表
	@RequestMapping("selects")
	public String selects(Model m,@RequestParam(defaultValue = "1")int pageNum,ComplainVO vo) {
		PageInfo<Tousubiao> infos=service.list(pageNum,vo);
		m.addAttribute("infos", infos);
	    return "tousuliebiao";
	}
	
	//详情
	@RequestMapping("xiangqing")
	public String xiangqing(Model m) {
		List<Tousubiao> list = service.xiangqing();
		m.addAttribute("list", list);
		return "list";
	}
	//投诉
	@RequestMapping("tousu")
	public String tousu(Model m,Tousubiao tousubiao) {
		service.tousu(tousubiao);
		Tousubiao tousubiao2=new Tousubiao();
		if(tousubiao2.getId()>50) {
			tousubiao2.setUrlip("不显示按钮");
		}else {
			tousubiao2.setUrlip("投诉按钮");
		}
		if(tousubiao2.getArticle_id()>100&&tousubiao2.getArticle_id()<90) {
			 tousubiao2.setUrlip("失敗");
		}else {
			 tousubiao2.setUrlip("成功");
		}
		return "tousu";
	}
}
