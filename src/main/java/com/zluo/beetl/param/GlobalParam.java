package com.zluo.beetl.param;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.FileResourceLoader;

/**
 * 全局变量的使用
 * @author luozhangjie
 *
 */
public class GlobalParam {

	public void returnGlobalParam() throws IOException{
		
		List<String> result = new ArrayList<String>();
		result.add("xiaoming");
		result.add("xiaodong");
		String root = System.getProperty("user.dir")+File.separator+"template";
		FileResourceLoader resourceLoader = new FileResourceLoader(root,"utf-8");
		Configuration cfg = Configuration.defaultConfiguration();
		GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
		Template t = gt.getTemplate("globalTemplate.txt");
		t.binding("result",result);
		String str = t.render();
		System.out.println(str);
		
	}
	
}
