package com.zluo.beetl.template;

import java.io.File;
import java.io.IOException;

import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.FileResourceLoader;

/**
 * 文件模版
 * @author luozhangjie
 *
 */
public class FileTemplate {

	public void fileTemplate(String fileTemplateName) throws IOException{
		
		String root = System.getProperty("user.dir")+File.separator+"template";
		FileResourceLoader resourceLoader = new FileResourceLoader(root,"utf-8");
		Configuration cfg = Configuration.defaultConfiguration();
		GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
		Template t = gt.getTemplate(fileTemplateName);
		String str = t.render();
		System.out.println(str);
		
	}
	
}
