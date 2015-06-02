package com.zluo.beetl.object;

import java.io.IOException;

import org.junit.Test;

/**
 * 测试模版引用属性的效果
 * @author luozhangjie
 *
 */
public class MObjectTest {

	@Test
	public void testReturnObject() throws IOException{
		new MObject().returnObject("visitObject.txt");
	}
	
}
