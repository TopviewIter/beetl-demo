package com.zluo.beetl.template;

import java.io.IOException;

import org.junit.Test;

/**
 * 测试文件模版
 * @author luozhangjie
 *
 */
public class FileTemplateTest {

	@Test
	public void testFileTemplate(){
		try {
			new FileTemplate().fileTemplate("param.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
