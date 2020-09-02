package com.springframework.xh;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xt
 * @date 2020/9/2
 */
public class Test {


	public static void main(String[] args) {
		// 1.初始化ApplicationContext容器对象
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);
		System.out.println(ac.getBean(X.class));
	}


}
