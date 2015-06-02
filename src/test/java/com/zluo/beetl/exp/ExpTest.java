package com.zluo.beetl.exp;

import java.io.IOException;

import org.junit.Test;

import com.zluo.beetl.expression.Exp;

/**
 * 测试表达式的效果
 * @author luozhangjie
 *
 */
public class ExpTest {

	@Test
	public void testCalculateExp() throws IOException{
		new Exp().calculateExp("exp.txt");
	}
	
}
