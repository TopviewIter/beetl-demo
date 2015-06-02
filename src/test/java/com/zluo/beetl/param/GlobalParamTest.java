package com.zluo.beetl.param;

import java.io.IOException;

import org.junit.Test;

/**
 * 测试全局变量的使用
 * @author luozhangjie
 *
 */
public class GlobalParamTest {

	@Test
	public void testReturnGlobalParam() throws IOException{
		new GlobalParam().returnGlobalParam();
	}
	
}
