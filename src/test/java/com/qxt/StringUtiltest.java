package com.qxt;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qxt.utils.StringUtil;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class StringUtiltest {
	
	@Test
	public void testString() {
		String url = "www.aaa.com";
		boolean b = StringUtil.isHttpUrl(url);
		if(b) {
			System.out.println("路径不合法");
		}else {
			System.out.println("路径合法");
		}
	}
	
}
