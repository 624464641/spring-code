package com.springframework.xh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author xt
 * @date 2020/9/1
 */
@Component
public class X {

	/**
	 * 循环依赖
	 *  x中引用y  y中引用x
	 */
	@Autowired
	Y y;
	public X(){
		System.out.println("X create");
	}
}
