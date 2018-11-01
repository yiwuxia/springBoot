package com.beenoisy.springboot.way.config;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import com.alibaba.druid.support.http.StatViewServlet;



@WebServlet(urlPatterns="/druid/*",initParams={
		@WebInitParam(name="allow",value=""),
		@WebInitParam(name="deny",value=""),
		@WebInitParam(name="loginUsername",value="admin"),
		@WebInitParam(name="loginPassword",value="admin")
})
public class DruidServlet  extends StatViewServlet  {
	
}
