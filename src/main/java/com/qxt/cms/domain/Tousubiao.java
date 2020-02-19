package com.qxt.cms.domain;

/**
 * @于浩
 */
public class Tousubiao {

	//主键id
	private Integer id;
	//文章id
	private Integer article_id;
	//投诉用户
	private Integer user_id;
	//投诉类型
	private String complaintype;
	//用户提交的证据
	private String urlip;
	//投诉次数
	private int tousucishu;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getArticle_id() {
		return article_id;
	}
	public void setArticle_id(Integer article_id) {
		this.article_id = article_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getComplaintype() {
		return complaintype;
	}
	public void setComplaintype(String complaintype) {
		this.complaintype = complaintype;
	}
	public String getUrlip() {
		return urlip;
	}
	public void setUrlip(String urlip) {
		this.urlip = urlip;
	}
	public int getTousucishu() {
		return tousucishu;
	}
	public void setTousucishu(int tousucishu) {
		this.tousucishu = tousucishu;
	}
	public Tousubiao(Integer id, Integer article_id, Integer user_id, String complaintype, String urlip,
			int tousucishu) {
		super();
		this.id = id;
		this.article_id = article_id;
		this.user_id = user_id;
		this.complaintype = complaintype;
		this.urlip = urlip;
		this.tousucishu = tousucishu;
	}
	public Tousubiao() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Tousubiao [id=" + id + ", article_id=" + article_id + ", user_id=" + user_id + ", complaintype="
				+ complaintype + ", urlip=" + urlip + ", tousucishu=" + tousucishu + "]";
	}
	
	
	
}
