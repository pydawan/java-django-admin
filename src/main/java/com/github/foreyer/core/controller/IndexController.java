package com.github.foreyer.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController extends BaseController{
	
	@RequestMapping(value = {"/","/index"})
	public String index(){
		return getView() + "/index";
	}
	
}