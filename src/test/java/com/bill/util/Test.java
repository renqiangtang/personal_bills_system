package com.bill.util;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by sky on 2018/7/4.
 */
public class Test {
	@org.junit.Test
	public void testHttpRequest(HttpServletRequest request){
		try {
			InputStream inputStream = request.getInputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
