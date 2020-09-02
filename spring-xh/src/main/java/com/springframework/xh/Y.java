package com.springframework.xh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author xt
 * @date 2020/9/2
 */
@Component
public class Y {

	@Autowired
	X x;
	public  Y(){

	}
}
