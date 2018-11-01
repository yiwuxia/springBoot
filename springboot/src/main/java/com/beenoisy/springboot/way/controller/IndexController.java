package com.beenoisy.springboot.way.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.jin.springboot.domin.App;
import com.jin.springboot.util.MyUtils;
import com.redare.devframework.common.spring.db.SpringJdbcHelper;

/**
 * Created by BeeNoisy on 16/8/13.
 */
@RestController
public class IndexController {
	
	@Autowired
	JdbcTemplate JdbcTemplate;
	
	@Autowired
	SpringJdbcHelper springJdbcHelper;
	
	
    @RequestMapping(value = "/hello"/*,method = RequestMethod.POST*/)
    @ResponseBody
    public String index() {
    	System.out.println(springJdbcHelper);
    	//springJdbcHelper.update("UPDATE app_user SET user_name ='李劲' WHERE id =2");
    	App app=	springJdbcHelper.queryForBean("	SELECT * FROM app_user where id=2 ", App.class);
        return JSON.toJSONString(app);
    }
    
    @RequestMapping(value = "/listByPage"/*,method = RequestMethod.POST*/)
    @ResponseBody
    public String listByPage() {
    	
    	
        return JSON.toJSONString("");
        
    }
    //根据id获取当前的echart数据
    @RequestMapping(value = "/getECharData"/*,method = RequestMethod.POST*/)
    @ResponseBody
    public String getECharData(
    		@RequestParam("id") String id
    		) {
    	if (MyUtils.getCacheMap().containsKey(id)) {
			
		}else {
			//
		}
    	
        return JSON.toJSONString("");
        
    }
}
