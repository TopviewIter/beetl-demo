package com.zluo.beetl.object;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.FileResourceLoader;

/**
 * 返回一系列的对象给模版访问
 * @author luozhangjie
 *
 */
public class MObject {

	public void returnObject(String fileTemplateName) throws IOException{
		
		//用于测试list
		List<String> result = new ArrayList<String>();
		result.add("xiaoming");
		//用于测试map里面
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		map.put("result", result);
		//用于测试map的遍历
		Map<String, String> m = new HashMap<String, String>();
		m.put("name", "xiaoming");
		m.put("password", "123");
		m.put("age", "1");
		//用于测试当map的元素个数为0时beetl的处理,当map为空时,会报空
		Map<String, String> mm = null;
		
		String root = System.getProperty("user.dir")+File.separator+"template";
		FileResourceLoader resourceLoader = new FileResourceLoader(root,"utf-8");
		Configuration cfg = Configuration.defaultConfiguration();
		GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
		Template t = gt.getTemplate(fileTemplateName);
		
		t.binding(map);
		t.binding("list", result);
		t.binding("map", map);
		t.binding("m", m);
		t.binding("mm", mm);
		
		String str = t.render();
		System.out.println(str);
	}
	
}
