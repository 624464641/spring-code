package com.springframework.xh;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author xt
 * @date 2020/9/1
 */
@Component
public class X {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext at = new AnnotationConfigApplicationContext();
		at.register();

		at.refresh();
	}

}
