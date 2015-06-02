package com.zluo.beetl.expression;

import java.io.File;
import java.io.IOException;

import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.FileResourceLoader;

/**
 * 做一些表达式的测试
 * @author luozhangjie
 *
 */
public class Exp {

	public void calculateExp(String fileTemplateName) throws IOException{
		
		String root = System.getProperty("user.dir")+File.separator+"template";
		FileResourceLoader resourceLoader = new FileResourceLoader(root,"utf-8");
		Configuration cfg = Configuration.defaultConfiguration();
		GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
		Template t = gt.getTemplate(fileTemplateName);
		
		t.binding("name", "xiaoming");
		t.binding("password", "123");
		t.binding("age", 0);
		
		String str = t.render();
		System.out.println(str);
		
	}
	
}
